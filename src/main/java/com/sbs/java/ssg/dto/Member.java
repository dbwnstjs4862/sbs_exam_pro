package com.sbs.java.ssg.dto;

import java.util.Map;

import lombok.Data;

@Data
public class Member extends Dto {
	public String loginId;
	public String loginPw; 
	public String nickname;
	public String e_mail;
	public String sex;
	public String birth;
	
	public Member(Map<String, Object> row) {
		super(row);
		this.loginId = (String) row.get("loginId");
		this.loginPw = (String) row.get("loginPw");
		this.nickname = (String) row.get("nickname");
		this.e_mail = (String) row.get("e_mail");
		this.sex = (String) row.get("e_mail");
		this.birth = (String) row.get("birth");
	}

	public Member(String loginId, String loginPw, String nickname, String e_mail, String sex, String birth) {
		this.loginId = loginId;
		this.loginPw = loginPw;
		this.nickname = nickname;
		this.e_mail = e_mail;
		this.sex = sex;
		this.birth = birth;
	}
}