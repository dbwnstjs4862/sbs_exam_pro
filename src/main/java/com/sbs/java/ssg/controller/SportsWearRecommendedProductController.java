package com.sbs.java.ssg.controller;

public class SportsWearRecommendedProductController {
	public SportsWearRecommendedProductController() {

	}

	public void sportsWearRecommendedProduct() {
		while (true) {

			// bmi계산 입력

			String sex;
			double bmi;
			String category;
			String bmi_level;
			double 저체중 = 18.5;
			double 표준 = 39.9;
			double 과체중 = 29.9;

			// 운동복 Lgg 추천(여자)-헬스
			String femaleGymWear1 = "안다르";
			String femaleGymWear2 = "젝시믹스";
			String femaleGymWear3 = "스컬피그";
			// Lgg(하의)
			String[] fAndarGymLgg = { "베스트셀러 에어쿨링", "에어쿨링 핏 텐션", "조거핏" };
			String[] fXexymixGymLgg = { "블랙라벨 시그니처 360N", "업텐션", "블랙라벨 시그니처 360N 부츠컷팬츠" };
			String[] fSkullGymLgg = { "제로뉴베이직", "플렉스 에어", "익스트림 프로" };
			// Top(티셔츠&크롭티)
			String[] fAndarGymTop = { "에어페치페이스", "에어로실버크롭티", "시스루투웨이셔링커버업" };
			String[] fXexymixGymTop = { "프레쉬페더 트위스트 크롭 숏슬리브", "에어센트 숏슬리브", "언밸러스 트임 숏슬리브" };
			String[] fSkullGymTop = { "라운드크롭 숏슬리브", "플레어언발슬리브리스", "벤츄리쿨링티셔츠" };
			// Outer
			String[] fAndarGymOuter = { "릴레어컴포트핏크롭집업", "릴레어컴포트핏집업", "클리어페더미들윈드자켓" };
			String[] fXexymixGymOuter = { "슬림핏크롭집업자켓", "젤라인텐션슬림핏집업자켓", "XXMX 크롭 바람막이 블랙" };
			String[] fSkullGymOuter = { "아쿠아쿨링크롭자켓", "올데이라이트후드집업", "후드집업우드로즈핑크" };
			// Inner
			String[] fAndarGymInner = { "비프리올데이", "에어리프리소프트", "프론트지퍼홀백" };
			String[] fXexymixGymInner = { "블랙라벨시그니처서포트탑", "하이디베이직", "베이직플레인" };
			String[] fSkullGymInner = { "아우아쿨링소피아", "아쿠아쿨링다이아", "익스트림맥스업" };

			// 운동복 레깅스 추천(여자)-요가
			// 운동복 Lgg 추천(여자)-요가 //
			String femaleYogaWear1 = "안다르";
			String femaleYogaWear2 = "콘치웨어";
			String femaleYogaWear3 = "요가웨어";
			// Lgg(하의)
			String[] fAndarYogaLgg = { "베스트셀러 에어쿨링", "에어쿨링 핏 텐션", "조거핏" };
			String[] fConchYogaLgg = { "에어라이트 3D 9부 Lgg", "힙업 부스터 프럽 Lgg", "Penna Soft Leggings(Navy)" };
			String[] fOzezYogaLgg = { "스티치스모킹", "우븐스트레치", "핀턱조거" };
			// Top(티셔츠&크롭티)
			String[] fAndarYogaTop = { "모달 투웨이 슬릿 커버업", "모달 서스테이너블 크로스백 슬리브리스", "모달 서스테이너블 드레이프 숏슬리브" };
			String[] fConchYogaTop = { "레이어 올인원 크롭탑", "빅홀 올인원 크롭탑", "오픈백 스트랩 슬리브" };
			String[] fOzezYogaTop = { "키홀 홀터넥 캐미솔 - 딥 라벤더", "레이온 숏슬리브 커버업 - 인디 핑크", "스모킹 숏슬리브 커버업 - 스카이 샌드" };
			// Outer
			String[] fAndarYogaOuter = { "클리어페더윈드자켓", "시스루멀티커버업", "에어쿨링타이업가디건" };
			String[] fConchYogaOuter = { "타이다이 랩 가디건", "루즈 플러피 맨투맨 ", "디어 슬릿 골지 슬리브" };
			String[] fOzezYogaOuter = { "타이다이 셔츠", "워싱 랩 가디건", "요루 한텐" };
			// Inner
			String[] fAndarYogaInner = { "비프리올데이", "에어리프리소프트", "프론트지퍼홀백" };
			String[] fConchYogaInner = { "블랙라벨시그니처서포트탑", "하이디베이직", "베이직플레인" };
			String[] fOzezYogaInner = { "아우아쿨링소피아", "아쿠아쿨링다이아", "익스트림맥스업" };

			// 운동복 Lgg 추천(여자)-필라테스
			String femalePilatesWear1 = "시크릿스";
			String femalePilatesWear2 = "젝스믹스";
			String femalePilatesWear3 = "뮬라웨어";
			// Lgg(하의)
			String[] fSecretPilatesLgg = { "V컷 Lgg 요가 필라테스 애플힙 스포츠", "V컷 Lgg 요가 필라테스 애플힙 스포츠",
					"V컷 Lgg 요가 필라테스 애플힙 스포츠" };
			String[] fXexymixPilatesLgg = { "블랙라벨 시그니처 330N 8부", "블랙라벨 시그니처 300N 수퍼라이트", "블랙라벨 시그니처 투웨이워터" };
			String[] fMulaPilatesLgg = { "뉴 노블 하이라이즈", "제로 프레스", "에너지업" };
			// Top(티셔츠&크롭티)
			String[] fSecretPilatesTop = { "글램버튼필라테스복반팔", "에어로실버크롭티", "개미허리필라테스복" };
			String[] fMulaPilatesTop = { "슬래쉬 포인트 롱 슬리브(패드 타입)", "백 오버랩 롱 슬리브(패드 타입)", "백컷 숏 슬리브(패드 타입)" };
			// Inner
			String[] fSecretPilatesInner = { "스킨 크롭탑 튜브탑 필라테스 요가", "코르셋 브라탑 필라테스 요가", "코르셋 브라탑 필라테스 요가" };
			String[] fXexymixPilatesInner = { "소프트 액티브 브라 블랙", "소프트 액티브 브라 멜란그레이", "골지 밴딩 브라렛 라벤더가든" };
			String[] fMulaPilatesInner = { "믹스 업 숏 브라탑", "프론트 집업 숏 브라탑", "노블 액티브 숏 브라탑" };

			// ======================= 남자 ===========================

			String menGymWear1 = "젝스믹스";
			String menGymWear2 = "스파이더";
			String menGymWear3 = "언더아머";

			// Lgg(Bottom)
			String[] mXexymixPilatesBottom = { "하디 스트레치 카고 쇼츠", "멀티플 액션 6인치 쇼츠", "컴포터블 카고 조거팬츠" };
			String[] mSpiderGymBottom = { "유니섹스 저지 숏츠", "맨즈 트레이닝 베이직 셋업 팬츠", "유니섹스 트레이닝 라이트 셋업 팬츠" };
			String[] mUnderGymBottom = { "남성 UA 론치 런 5인치 쇼츠", "남성 APAC 우븐 쇼츠 2.0", "남성 UA 론치 런 투인원 쇼츠" };

			// Top(티셔츠&크롭티)
			String[] mXexymixPilatesTop = { "머슬핏 숏슬리브", "머슬핏 듀얼 슬리브리스", "트리플 엑스 숏슬리브" };
			String[] mSpiderGymTop = { "유니섹스 에센셜 미들 로고 반팔 티셔츠", "유니섹스 트레이닝 슬림핏 반팔 티셔츠", "유니섹스 액티브 긴팔 티셔츠" };
			String[] mUnderGymTop = { "남성 UA 스포츠스타일 로고 탱크", "남성 UA RUSH™ 우븐 ½ 집 아노락 재킷", "남성 UA 베이스라인 코튼 탱크" };

			// Outer
			String[] mXexymixPilatesOuter = { "윈드테크 스윙자켓", "플렉스 집업 후디", "스트링 후드 아노락" };
			String[] mSpiderGymOuter = { "맨즈 러닝 라이트 핑거루프 후드 집업 자켓", "맨즈 액티브 스탠드넥 쿨링 트리코트 셋업 집업",
					"유니섹스 트레이닝 하프집 아노락 자켓" };
			String[] mUnderGymOuter = { "남성 UA Storm 포프런트 레인 재킷", "남성 UA 스트레치 우븐 윈드브레이커 ", "남성 프로젝트 락 브라마 재킷" };

			if (sex.equals(M)) {
				if (bmi <= 저체중) {
					System.out.printf("\n");
					if (category.equals("헬스")) {

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[0]);
							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[0]);
							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[0]);
							break;
						}
					} else if (category.equals("요가")) {

						System.out.printf("\n");
						if (bmi_level.equals("요린이")) {
							System.out.printf("====== (요린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요중이")) {
							System.out.printf("====== (요중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요른이")) {
							System.out.printf("====== (요른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;
						}
					} else if (category.equals("필라테스")) {

						if (bmi_level.equals("필린이")) {
							System.out.printf("====== (필린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[0]);

							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[0]);
							break;

						} else if (bmi_level.equals("필중이")) {
							System.out.printf("====== (필중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[0]);

							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[0]);
							break;

						} else if (bmi_level.equals("필른이")) {
							System.out.printf("====== (필른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[0]);
							break;
						}
					}

				}

				// bmi==과체중
				if (bmi <= 과체중) {
					System.out.printf("\n");
					if (category.equals("헬스")) {

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[1]);
							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[1]);
							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[1]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[1]);
							break;
						}
					} else if (category.equals("요가")) {

						System.out.printf("\n");
						if (bmi_level.equals("요린이")) {
							System.out.printf("====== (요린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요중이")) {
							System.out.printf("====== (요중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요른이")) {
							System.out.printf("====== (요른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;
						}
					} else if (category.equals("필라테스")) {

						System.out.printf("\n");
						if (bmi_level.equals("필린이")) {
							System.out.printf("====== (필린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[1]);
							break;

						} else if (bmi_level.equals("필중이")) {
							System.out.printf("====== (필중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[1]);
							break;

						}

						else if (bmi_level.equals("필른이")) {
							System.out.printf("====== (필른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[1]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[1]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[1]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[1]);
							break;
						}
					}

				}

				// bmi==고도비만
				if (bmi <= 고도비만) {
					System.out.printf("\n");
					if (category.equals("헬스")) {
						// 레깅스 추천

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[2]);
							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[2]);
							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fAndarGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fSkullGymLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymOuter[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymOuter[2]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear1,
									fAndarGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear2,
									fXexymixGymInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femaleGymWear3,
									fSkullGymInner[2]);
							break;
						}
					} else if (category.equals("요가")) {

						System.out.printf("\n");
						if (bmi_level.equals("요린이")) {
							System.out.printf("====== (요린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요중이")) {
							System.out.printf("====== (요중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;

						} else if (bmi_level.equals("요른이")) {
							System.out.printf("====== (요른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaLgg[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaLgg[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaOuter[0]);

							System.out.printf("\n");
							System.out.printf("====== (요른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear1,
									fAndarYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear2,
									fConchYogaInner[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", femaleYogaWear3,
									fOzezYogaInner[0]);
							break;
						}

					} else if (category.equals("필라테스")) {

						System.out.printf("\n");
						if (bmi_level.equals("필린이")) {
							System.out.printf("====== (필린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (필린이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[2]);
							break;

						} else if (bmi_level.equals("필중이")) {
							System.out.printf("====== (필중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fMulaPilatesTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (필중이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[2]);
							break;

						} else if (bmi_level.equals("필른이")) {
							System.out.printf("====== (필른이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesLgg[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesLgg[2]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesTop[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesTop[2]);

							System.out.printf("\n");
							System.out.printf("====== (필른이) 이너웨어 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear1,
									fSecretPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear2,
									fXexymixPilatesInner[2]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", femalePilatesWear3,
									fMulaPilatesInner[2]);
							break;
						}

					}
				}
			}
			if (sex.equals(F)) {

				if (bmi <= 저체중) {
					System.out.printf("\n");
					if (category.equals("헬스")) {

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(S)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;
						}
					}
				}

				// 과체중
				if (bmi <= 과체중) {
					System.out.printf("\n");
					if (category.equals("헬스")) {

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(M)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;
						}
					}
				}

				// 고도비만
				if (bmi <= 과체중) {
					System.out.printf("\n");
					if (category.equals("헬스")) {

						System.out.printf("\n");
						if (bmi_level.equals("헬린이")) {
							System.out.printf("====== (헬린이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬린이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬중이")) {
							System.out.printf("====== (헬중이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬중이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;

						} else if (bmi_level.equals("헬창이")) {
							System.out.printf("====== (헬창이) 레깅스 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymBottom[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymBottom[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 상의 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymTop[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymTop[0]);

							System.out.printf("\n");
							System.out.printf("====== (헬창이) 아우터 제품추천 ======\n");
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear1,
									mXexymixPilatesOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear2,
									mSpiderGymOuter[0]);
							System.out.printf("회원님에게 추천하는 운동복브랜드는 %s이며, %s(L)사이즈을 추천드립니다.\n", menGymWear3,
									mUnderGymOuter[0]);

							break;
						}
					}
				}
			}
		}
	}
}
