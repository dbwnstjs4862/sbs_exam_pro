package com.sbs.java.ssg.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.db.DBConnection;
import com.sbs.java.ssg.dto.Article;
import com.sbs.java.ssg.dto.ArticleReply;

public class ArticleReplyDao {
	public List<ArticleReply> replies;
	private DBConnection dbConnection;

	public ArticleReplyDao() {
		replies = new ArrayList<>();
		dbConnection = Container.getDBConnection();
	}
	
	public int articleReplyWrite(ArticleReply articleReply) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("INSERT INTO articleReply "));
		sb.append(String.format("SET regDate = NOW(), "));
		sb.append(String.format("updateDate = NOW(), "));
		sb.append(String.format("`body` = '%s', ", articleReply.body));
		sb.append(String.format("nickname = '%s', ", articleReply.nickname));
		sb.append(String.format("memberId = '%d', ", articleReply.memberId));
		sb.append(String.format("articleId = '%d', ", articleReply.articleId));
		sb.append(String.format("`like` = '%d' ", articleReply.like));

		return dbConnection.insert(sb.toString());
	}

	public int delete(int id) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("DELETE FROM articleReply "));
		sb.append(String.format("WHERE id = '%d' ", id));

		return dbConnection.delete(sb.toString());
	}

	public List<ArticleReply> getReplies(int id) {
		StringBuilder sb = new StringBuilder();

		sb.append(String.format("SELECT R.* "));
		sb.append(String.format("FROM articleReply AS R "));
		sb.append(String.format("INNER JOIN `article` AS A "));
		sb.append(String.format("ON R.articleId = A.id "));
		sb.append(String.format("WHERE A.id = %d ", id));

		List<ArticleReply> replies = new ArrayList<>();
		List<Map<String, Object>> rows = dbConnection.selectRows(sb.toString());

		for (Map<String, Object> row : rows) {
			replies.add(new ArticleReply(row));
		}

		return replies;
	}
}