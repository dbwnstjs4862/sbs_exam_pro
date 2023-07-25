package com.sbs.java.ssg.controller;

import java.util.Scanner;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dto.Member;
import com.sbs.java.ssg.service.MemberService;

public class MemberController extends Controller {
	private Scanner sc;
	private MemberService memberService;
	private Session session;
	private SportsWearRecommendedProductController sportsWearRecommendedProductController;
	private FoodRecommendedProductController foodRecommendedProductController;

	public MemberController() {
		sc = Container.getScanner();
		session = Container.getSession();
		memberService = Container.memberService;
	}

	public void doAction(String command, String actionMethodName) {
		switch (actionMethodName) {
		case "join":
			doJoin();
			break;
		case "login":
			doLogin();
			break;
		case "logout":
			doLogout();
			break;
		case "delete":
			doDelete();
			break;
		case "mypage":
			doMypage();
			break;
		case "recommendedProduct":
			doRecommendedProduct();
			break;
		default:
			System.out.println("존재하지 않는 명령어 입니다.");
			break;
		}
	}

	private boolean isJoinableLoginId(String loginId) {
		Member member = memberService.getMemberByLoginId(loginId);

		if (member == null) {
			return true;
		}

		return false;
	}

	private boolean isJoinablenickName(String nickName) {
		Member member = memberService.getMemberBynickName(nickName);

		if (member == null) {
			return true; // 중복이 아니다
		}

		return false; // 중복이다
	}

	public void doJoin() {
		String loginId = null;

		while (true) {
			System.out.printf("로그인 아이디 : ");
			loginId = sc.nextLine();

			if (isJoinableLoginId(loginId) == false) {
				System.out.printf("%s(은)는 이미 사용중인 아이디입니다.\n", loginId);
				continue;
			}

			break;
		}

		String loginPw = null;
		String loginPwConfirm = null;

		while (true) {
			System.out.printf("로그인 비번 : ");
			loginPw = sc.nextLine();
			System.out.printf("로그인 비번확인 : ");
			loginPwConfirm = sc.nextLine();

			if (loginPw.equals(loginPwConfirm) == false) {
				System.out.println("비밀번호를 다시 입력해주세요.");
				continue;
			}

			break;
		}

		System.out.printf("이름 : ");
		String name = sc.nextLine();

		System.out.printf("닉네임 : ");
		String nickName = sc.nextLine();

		System.out.printf("성별(M/F) : ");
		String sex = sc.nextLine();

		if (sex.equals("m") || sex.equals("f")) {
			System.out.println("대문자로 다시 입력 해 주세요.");
			return;
		}

		System.out.printf("키 : ");
		double height = sc.nextDouble();

		System.out.printf("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();

		double bmi = weight / (height * height / 10000);

		String bmi_level;

		if (weight / (height * height / 10000) > 35) {
			bmi_level = "고도비만";
		} else if (weight / (height * height / 10000) > 30) {
			bmi_level = "비만";
		} else if (weight / (height * height / 10000) > 25) {
			bmi_level = "과체중";
		} else if (weight / (height * height / 10000) > 18.5) {
			bmi_level = "표준";
		} else {
			bmi_level = "저체중";
		}
		System.out.printf("bmi : %.1f\n", bmi);
		System.out.printf("bmi_level : %s\n", bmi_level);

		System.out.printf("감량 : ");
		String loss = sc.nextLine();

		System.out.printf("개월 : ");
		String months = sc.nextLine();

		System.out.printf("운동종목 : ");
		String category = sc.nextLine();

		System.out.printf("운동난이도 : ");
		String category_level = sc.nextLine();

		System.out.printf("이메일 : ");
		String e_mail = sc.nextLine();

		System.out.printf("생년월일(6글자) : ");
		String birth = sc.nextLine();

		memberService.join(loginId, loginPw, name, nickName, e_mail, sex, birth, height, weight, bmi, bmi_level, loss,
				months, category, category_level);

		System.out.printf("회원가입이 완료되었습니다. [%s] 님 환영합니다^^\n", nickName);
	}

	private void doLogin() {
		System.out.printf("로그인 아이디 : ");
		String loginId = sc.nextLine();

		System.out.printf("로그인 비번 : ");
		String loginPw = sc.nextLine();

		// 입력받은 아이디에 해당하는 회원이 존재하는지
		Member member = memberService.getMemberByLoginId(loginId);

		if (member == null) {
			System.out.println("해당 회원은 존재하지 않습니다.");
			return;
		}

		if (member.loginPw.equals(loginPw) == false) {
			System.out.println("비밀번호가 맞지 않습니다.");
			return;
		}

		session.setLoginedMember(member);
		Member loginedMember = session.getLoginedMember();

		System.out.printf("로그인 성공! %s님 환영합니다!\n", loginedMember.nickName);
	}

	private void doLogout() {
		session.setLoginedMember(null);

		System.out.println("로그아웃 되었습니다.");
	}

	private void doDelete() {

		System.out.printf("로그인 아이디 : ");
		String loginId = sc.nextLine();
		System.out.printf("로그인 비번 : ");
		String loginPw = sc.nextLine();

		Member member = memberService.getMemberByLoginId(loginId);

		if (member.loginPw.equals(loginPw) == false) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}

		System.out.println("정말 회원탈퇴를 하시겠습니까? Y/N");

		String deleteAnswer = sc.nextLine();

		Member loginedMember = session.getLoginedMember();
		if (deleteAnswer.equals("Y") || deleteAnswer.equals("y")) {
			memberService.remove(member.id);
			System.out.println("그동안 이용해 주셔서 감사합니다.");
			session.setLoginedMember(null);
			return;
		}
		if (deleteAnswer.equals("N") || deleteAnswer.equals("n")) {
			return;
		}
	}

	public void adminDelete() {
		Member loginedMember = session.getLoginedMember();
		if (loginedMember.id == 1) {
			doDelete();
		}
	}

	private void doRecommendedProduct() {
		System.out.println("1. 운동복 추천");
		System.out.println("2. 식품 추천");
		System.out.print("추천 받으실 제품의 번호를 입력하세요) ");
		String recommendedProductAnswer = sc.nextLine();

		if (recommendedProductAnswer.equals(1)) {
			sportsWearRecommendedProductController.sportsWearRecommendedProduct();
		} else if (recommendedProductAnswer.equals(2)) {
			foodRecommendedProductController.foodRecommendedProduct();
		}
	}

	private void doMypage() {

		System.out.println("===명령어 목록===");
		System.out.println("1. 닉네임 설정");
		System.out.println("2. 나의 신체정보");
		System.out.println("3. 나의 목표설정");
		System.out.println("4. 운동종목 및 레벨선택");
		System.out.println("5. 나의 정보보기");
		System.out.println("6. 마이페이지 나가기");

		while (true) {
			System.out.printf("원하시는 목록의 번호를 입력하세요. : ");
			String Mypage = sc.next();
			sc.nextLine();

			if (Mypage.equals("1")) {
				System.out.printf("닉네임을 변경 하시겠습니까?(Y/N)");
				String answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.printf("변경할 닉네임을 적어주세요 :");
					String nickName = sc.next();
					if (isJoinablenickName(nickName) == false) {
						System.out.printf("%s(은)는 이미 사용중인 닉네임입니다.\n", nickName);
						continue;
					}

					int memberId = session.getLoginedMember().getId();
					memberService.nickName(memberId, nickName);
					System.out.println("===변경 완료===");

					System.out.printf("닉네임이 %s (으)로 변경되었습니다.\n", nickName);

					continue;
				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("닉네임을 유지합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}

			} else if (Mypage.equals("2")) {

				String bmi_level;
				System.out.printf("나의 신체정보를 변경 하시겠습니까?(Y/N)");
				String answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.printf("성별(M or F) : ");
					String sex = sc.next();
					if (sex.equals("m") || sex.equals("M")) {
						sex = "남자";
					} else if (sex.equals("f") || sex.equals("F")) {
						sex = "여자";
					} else {
						System.out.println("잘못 입력하셔습니다.");
						continue;
					}
					System.out.printf("신장(cm) : ");
					double height = sc.nextDouble();

					System.out.printf("몸무게(kg) : ");
					double weight = sc.nextDouble();

					if (weight / (height * height / 10000) > 35) {
						bmi_level = "고도비만";
					} else if (weight / (height * height / 10000) > 30) {
						bmi_level = "비만";
					} else if (weight / (height * height / 10000) > 25) {
						bmi_level = "과체중";
					} else if (weight / (height * height / 10000) > 18.5) {
						bmi_level = "표준";
					} else {
						bmi_level = "저체중";
					}
					double bmi = weight / (height * height / 10000);
					System.out.printf("bmi : %.1f\n", bmi);

					int memberId = session.getLoginedMember().getId();
					memberService.body_info(memberId, sex, height, weight, bmi, bmi_level);

					System.out.printf("성별 : %s\n신장 : %.1fcm\n몸무게 : %.1fkg\nBMI 수치 : %.1f\nBMI : %s\n", sex, height,
							weight, weight / (height * height / 10000), bmi_level);
					System.out.println("===변경 완료===");
					continue;

				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("신체정보를 유지합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;

				}
			}

			else if (Mypage.equals("3")) {
				System.out.printf("나의 목표를 변경 하시겠습니까?(Y/N)");
				String answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.printf("변경할 목표을 적어주세요.\n");
					System.out.println("1) 5kg 감량\n2) 10kg 감량\n3) 15kg 감량\n4) 20kg 감량");
					String loss = sc.next();
					if (loss.equals("1")) {
						loss = "5kg 감량";

					} else if (loss.equals("2")) {
						loss = "10kg 감량";

					} else if (loss.equals("3")) {
						loss = "15kg 감량";

					} else if (loss.equals("4")) {
						loss = "20kg 감량";

					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					System.out.printf("목표 기간을 선택해주세요.\nA) 1~3개월, B) 3~6개월 C), 6~12개월\n");
					String months = sc.next();
					if (months.equals("A") || months.equals("a")) {
						months = "1~3개월";
					} else if (months.equals("B") || months.equals("b")) {
						months = "3~6개월";
					} else if (months.equals("C") || months.equals("c")) {
						months = "6~12개월";
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					System.out.println("===변경 완료===");

					int memberId = session.getLoginedMember().getId();
					memberService.object(memberId, loss, months);

					System.out.printf("나의 목표\n%s동안 목표량 %s을 할것입니다.\n", months, loss);
					continue;

				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("나의 목표를 유지합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			}

			else if (Mypage.equals("4")) {
				System.out.printf("운동종목 및 레벨을 변경 하시겠습니까?(Y/N)");
				String answer = sc.next();
				if (answer.equals("y") || answer.equals("Y")) {
					System.out.printf("변경할 운동종목을 적어주세요.\n");
					System.out.printf("1.헬스, 2.요가, 3.필라테스");
					String category = sc.next();
					if (category.equals("1")) {
						System.out.printf("자신에게 맞는 헬스 난이도를 선택해주세요.\n");
						System.out.println("1.헬린이\n(초보자들이 부담없이 운동할수있도록 도와줍니다.)\n");
						System.out.println("2.헬중이\n(중급자들이 적극적으로 운동할수있게 도와줍니다.)\n");
						System.out.println("3.헬창이\n(상급자들이 자신의 한계치까지 도달할수있도록 도와줍니다.)\n");
						String category_level = sc.next();
						if (category_level.equals("1")) {
							category = "헬스\n";
							category_level = "헬린이";

						} else if (category_level.equals("2")) {
							category = "헬스\n";
							category_level = "헬중이";

						} else if (category_level.equals("3")) {
							category = "헬스\n";
							category_level = "헬창이";

						} else {
							System.out.println("잘못 입력하셨습니다.");
							continue;
						}

						System.out.println("===변경 완료===");
						System.out.printf("%s\n%s\n", category, category_level);
						continue;
					} else if (category.equals("2")) {
						System.out.printf("자신에게 맞는 요가 난이도를 선택해주세요.\n");
						System.out.println("1.요린이\n(초보자들이 부담없이 요가를 할수있도록 도와줍니다.)\n");
						System.out.println("2.요중이\n(중급자들이 적극적으로 요가를 할수있게 도와줍니다.)\n");
						System.out.println("3.요창이\n(상급자들이 자신의 한계치까지 유연헤질수 있도록 도와줍니다).\n");
						String category_level = sc.next();
						if (category_level.equals("1")) {
							category = "요가\n";
							category_level = "요린이";

						} else if (category_level.equals("2")) {
							category = "요가\n";
							category_level = "요중이";

						} else if (category_level.equals("3")) {
							category = "요가\n";
							category_level = "요창이";

						} else {
							System.out.println("잘못 입력하셨습니다.");
							continue;
						}
						System.out.println("===변경 완료===");
						System.out.printf("%s\n%s\n", category, category_level);
						continue;
					}

					else if (category.equals("3")) {
						System.out.printf("자신에게 맞는 필라테스 난이도를 선택해주세요.\n");
						System.out.println("1.필린이\n(초보자들이 부담없이 코어운동할수있도록 도와줍니다.)\n");
						System.out.println("2.필중이\n(중급자들이 적극적으로 코어운동할수있게 도와줍니다.)\n");
						System.out.println("3.필창이\n(상급자들이 자신의 한계치까지 코어운동을 할수있도록 도와줍니다.)\n");
						String category_level = sc.next();
						if (category_level.equals("1")) {
							category = "필라테스\n";
							category_level = "필린이";

						} else if (category_level.equals("2")) {
							category = "필라테스\n";
							category_level = "필중이";

						} else if (category_level.equals("3")) {
							category = "필라테스\n";
							category_level = "필창이";

						} else {
							System.out.println("잘못 입력하셨습니다.");
							continue;

						}
						int memberId = session.getLoginedMember().getId();

						memberService.category_level(memberId, category, category_level);
						System.out.println("===변경 완료===");
						System.out.printf("%s\n%s\n", category, category_level);
						continue;

					}

				} else if (answer.equals("n") || answer.equals("N")) {
					System.out.println("운동종목 및 레벨을 유지합니다.");
					break;
				} else {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
			} else if (Mypage.equals("5")) {
				System.out.println(" === 내 정보 === ");

				break;

			} else if (Mypage.equals("6")) {
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			sc.close();
		}
	}
}