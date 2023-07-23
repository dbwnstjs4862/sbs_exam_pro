package com.sbs.java.ssg.service;

import java.util.List;

import com.sbs.java.ssg.container.Container;
import com.sbs.java.ssg.dao.ArticleDao;
import com.sbs.java.ssg.dto.Article;
import com.sbs.java.ssg.dto.Board;

public class ArticleService {
	private ArticleDao articleDao;

	public ArticleService() {
		articleDao = Container.articleDao;
	}

	public List<Article> getForPrintArticles(String boardCode, String searchkeyword) {
		return articleDao.getForPrintArticles(boardCode, searchkeyword);
	}

	public Article getArticle(int id) {
		return articleDao.getArticle(id);
	}

	public int articleWrite(int memberId, int boardId, String nickname, String title, String body) {
		Article article = new Article(memberId, boardId, nickname, title, body);
		return articleDao.write(article);
	}

	public List<Article> getArticles() {
		return articleDao.getArticles();
	}

	public Board getBoard(int id) {
		return articleDao.getBoard(id);
	}

	public Article getForPrintArticle(int id) {
		return articleDao.getForPrintArticle(id);
	}

	public void modify(int id, String title, String body) {
		articleDao.modify(id, title, body);
	}

	public void delete(int id) {
		articleDao.delete(id);
	}

}