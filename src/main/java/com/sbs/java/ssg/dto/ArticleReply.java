package com.sbs.java.ssg.dto;

import java.util.Map;

import lombok.Data;

@Data
public class ArticleReply extends Dto {
	public int articleId;
	public int memberId;
	public String body;
	public String nickname;
	public int like;

	public ArticleReply(int memberId, int articleId, String nickname, String body) {
		this(memberId, articleId, nickname, body, 0);
	}

	public ArticleReply(int memberId, int articleId, String nickname, String body, int like) {
		this.articleId = articleId;
		this.memberId = memberId;
		this.nickname = nickname;
		this.body = body;
		this.like = like;
	}

	public ArticleReply(Map<String, Object> row) {
		super(row);
		this.memberId = (int) row.get("memberId");
		this.articleId = (int) row.get("articleId");
		this.nickname = (String) row.get("nickname");
		this.body = (String) row.get("body");
		this.like = (int) row.get("like");
	}
	
	public void increaseLike() {
		like++;
	}
}