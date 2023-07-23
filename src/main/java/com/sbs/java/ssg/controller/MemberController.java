package com.sbs.java.ssg.controller;

import java.util.Scanner;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dto.Member;
import com.sbs.java.ssg.service.MemberService;

public class MemberController extends Controller {
	private Scanner sc;
	private MemberService memberService;
	private Session session;
	
	public MemberController() {
		sc = Container.getScanner();
		session = Container.getSession();
		memberService = Container.memberService;
	}
	
	public void doAction(String command, String actionMethodName) {
		switch ( actionMethodName ) {
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
		default:
			System.out.println("존재하지 않는 명령어 입니다.");
			break;
		}
	}

	private boolean isJoinableLoginId(String loginId) {
		Member member = memberService.getMemberByLoginId(loginId);
		
		if ( member == null ) {
			return true;
		}
		
		return false;
	}

	public void doJoin() {
		String loginId = null;
		
		while ( true ) {
			System.out.printf("로그인 아이디 : ");
			loginId = sc.nextLine();
			
			if ( isJoinableLoginId(loginId) == false ) {
				System.out.printf("%s(은)는 이미 사용중인 아이디입니다.\n", loginId);
				continue;
			}
			
			break;
		}
		
		String loginPw = null;
		String loginPwConfirm = null;
		
		while ( true ) {
			System.out.printf("로그인 비번 : ");
			loginPw = sc.nextLine();
			System.out.printf("로그인 비번확인 : ");
			loginPwConfirm = sc.nextLine();
			
			if ( loginPw.equals(loginPwConfirm) == false ) {
				System.out.println("비밀번호를 다시 입력해주세요.");
				continue;
			}
			
			break;
		}
		
		System.out.printf("닉네임 : ");
		String nickname = sc.nextLine();
		
		System.out.printf("이메일 : ");
		String e_mail = sc.nextLine();
		
		System.out.printf("성별(M/F) : ");
		String sex = sc.nextLine();
		
		System.out.printf("생년월일(6글자) : ");
		String birth = sc.nextLine();

		memberService.join(loginId, loginPw, nickname, e_mail, sex, birth);

		System.out.printf("회원가입이 완료되었습니다. [%s] 님 환영합니다^^\n", nickname);
	}
	
	private void doLogin() {		
		System.out.printf("로그인 아이디 : ");
		String loginId = sc.nextLine();
		System.out.printf("로그인 비번 : ");
		String loginPw = sc.nextLine();
		
		// 입력받은 아이디에 해당하는 회원이 존재하는지
		Member member = memberService.getMemberByLoginId(loginId);
		
		if ( member == null ) {
			System.out.println("해당 회원은 존재하지 않습니다.");
			return;
		}
		
		if ( member.loginPw.equals(loginPw) == false ) {
			System.out.println("비밀번호가 맞지 않습니다.");
			return;
		}
		
		session.setLoginedMember(member);
		Member loginedMember = session.getLoginedMember();
		
		System.out.printf("로그인 성공! %s님 환영합니다!\n", loginedMember.nickname);
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
		
		if ( member.loginPw.equals(loginPw) == false ) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}			
		
		System.out.println("정말 회원탈퇴를 하시겠습니까? Y/N");
		
		String deleteAnswer = sc.nextLine();
		
		Member loginedMember = session.getLoginedMember();
		if (deleteAnswer.equals("Y")||deleteAnswer.equals("y")) {
			memberService.remove(member.id);
			System.out.println("그동안 이용해 주셔서 감사합니다.");
			session.setLoginedMember(null);
			return;
		}
		if (deleteAnswer.equals("N")||deleteAnswer.equals("n")) {
			return;
		}
	}
	public void admindelete() {
		Member loginedMember = session.getLoginedMember();
		if (loginedMember.id == 1) {
			doDelete();
		}
	}
}