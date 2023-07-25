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

	public Member getMemberBynickName(String nickName) {
		return memberDao.getMemberBynickName(nickName);
	}

	public void join(String loginId, String loginPw, String name, String nickName, String e_mail, String sex,
			String birth, double height, double weight, double bmi, String bmi_level, String loss, String months,
			String category, String category_level) {
		Member member = new Member(loginId, loginPw, name, nickName, e_mail, sex, birth, height, weight, bmi, bmi_level,
				loss, months, category, category_level);
		memberDao.join(member);
	}

	public void nickName(int id, String nickName) {
		Member member = new Member(id, nickName);
		memberDao.nickName(id, member);
	}

	public void body_info(int id, String sex, double height, double weight, double bmi, String bmi_level) {
		Member member = new Member(id, sex, height, weight, bmi, bmi_level);
		memberDao.body_info(id, member);
	}

	public void object(int id, String loss, String months) {
		memberDao.object(id, loss, months);
	}

	public void category_level(int id, String category, String category_level) {
		memberDao.category_level(id, category, category_level);
	}

	public Member getMember(int memberId) {
		return memberDao.getMember(memberId);
	}

	public void remove(int memberId) {
		memberDao.remove(memberId);
	}

}