package com.sbs.java.ssg.service;

import java.util.List;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dao.ArticleReplyDao;
import com.sbs.java.ssg.dto.Article;
import com.sbs.java.ssg.dto.ArticleReply;

public class ArticleReplyService {
	private ArticleReplyDao ArticleReplyDao;

	public ArticleReplyService() {
		ArticleReplyDao = Container.articleReplyDao;
	}

	public int articleReplyWrite(int memberId, int articleId, String name, String body) {
		ArticleReply articleReply = new ArticleReply(memberId, articleId, name, body);
		return ArticleReplyDao.articleReplyWrite(articleReply);
	}
	
	public void delete(int id) {
		ArticleReplyDao.delete(id);
	}
	
	public List<ArticleReply> getReplies(int id) {
		return ArticleReplyDao.getReplies(id);
	}
}