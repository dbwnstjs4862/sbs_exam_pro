package com.sbs.java.ssg.service;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dao.MemberDao;
import com.sbs.java.ssg.dto.Member;

public class MemberService {
	private MemberDao memberDao;
	
	public MemberService() {
		memberDao = Container.memberDao;
	}

	public Member getMemberByLoginId(String loginId) {
		return memberDao.getMemberByLoginId(loginId);
	}

	public void join(String loginId, String loginPw, String nickname, String e_mail, String sex,String birth) {
		Member member = new Member(loginId, loginPw, nickname, e_mail, sex, birth);
		memberDao.join(member);
	}

	public Member getMember(int memberId) {
		return memberDao.getMember(memberId);
	}
	
	public void remove(int memberId) {
		memberDao.remove(memberId);
	}
}