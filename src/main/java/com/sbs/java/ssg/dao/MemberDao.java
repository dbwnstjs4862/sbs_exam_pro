package com.sbs.java.ssg.dao;

import java.util.Map;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.db.DBConnection;
import com.sbs.java.ssg.dto.Member;

public class MemberDao extends Dao {
	private DBConnection dbConnection;

	public MemberDao() {
		dbConnection = Container.getDBConnection();
	}

	public int join(Member member) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("INSERT INTO `member` "));
		sb.append(String.format("SET regDate = NOW(), "));
		sb.append(String.format("updateDate = NOW(), "));
		sb.append(String.format("loginId = '%s', ", member.loginId));
		sb.append(String.format("loginPw = '%s', ", member.loginPw));
		sb.append(String.format("name = '%s', ", member.name));
		sb.append(String.format("nickname = '%s', ", member.nickName));
		sb.append(String.format("e_mail = '%s', ", member.e_mail));
		sb.append(String.format("sex = '%s', ", member.sex));
		sb.append(String.format("birth = '%s', ", member.birth));
		sb.append(String.format("height = '%.1f', ", member.height));
		sb.append(String.format("weight = '%.1f', ", member.weight));
		sb.append(String.format("bmi = '%.1f', ", member.bmi));
		sb.append(String.format("bmi_level = '%s', ", member.bmi_level));
		sb.append(String.format("loss = '%s', ", member.loss));
		sb.append(String.format("months = '%s', ", member.months));
		sb.append(String.format("category = '%s', ", member.category));
		sb.append(String.format("category_level = '%s' ", member.category_level));

		return dbConnection.insert(sb.toString());
	}

	public int nickName(int id, Member member) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("UPDATE `member` "));
		sb.append(String.format("SET updateDate = NOW(), "));
		sb.append(String.format("nickName = '%s' ", member.nickName));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.update(sb.toString());
	}

	public int body_info(int id, Member member) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("UPDATE `member` "));
		sb.append(String.format("SET updateDate = NOW(), "));
		sb.append(String.format("sex = '%s', ", member.sex));
		sb.append(String.format("height = '%.1f', ", member.height));
		sb.append(String.format("weight = '%.1f', ", member.weight));
		sb.append(String.format("bmi = '%.1f', ", member.bmi));
		sb.append(String.format("bmi_level = '%s' ", member.bmi_level));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.update(sb.toString());
	}

	public int object(int id, String loss, String months) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("UPDATE `member` "));
		sb.append(String.format("SET updateDate = NOW(), "));
		sb.append(String.format("loss = '%s', ", loss));
		sb.append(String.format("months = '%s' ", months));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.update(sb.toString());
	}

	public int category_level(int id, String category, String category_level) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("UPDATE `member` "));
		sb.append(String.format("SET updateDate = NOW(), "));
		sb.append(String.format("category = '%s', ", category));
		sb.append(String.format("category_level = '%s' ", category_level));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.update(sb.toString());
	}

	public Member getMemberByLoginId(String loginId) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("SELECT * "));
		sb.append(String.format("FROM `member` "));
		sb.append(String.format("WHERE loginId = '%s' ", loginId));

		Map<String, Object> memberRow = dbConnection.selectRow(sb.toString());

		if (memberRow.isEmpty()) {
			return null;
		}

		return new Member(memberRow);
	}

	public Member getMember(int id) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("SELECT * "));
		sb.append(String.format("FROM `member` "));
		sb.append(String.format("WHERE id = '%d' ", id));

		Map<String, Object> row = dbConnection.selectRow(sb.toString());

		if (row.isEmpty()) {
			return null;
		}

		return new Member(row);
	}

	public Member getMemberBynickName(String nickName) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("SELECT * "));
		sb.append(String.format("FROM `member` "));
		sb.append(String.format("WHERE nickName = '%s' ", nickName));

		Map<String, Object> row = dbConnection.selectRow(sb.toString());

		if (row.isEmpty()) {
			return null;
		}

		return new Member(row);
	}

	public int remove(int id) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("DELETE FROM member "));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.delete(sb.toString());
	}
}