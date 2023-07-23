# 데이터베이스 삭제/생성/선택
DROP DATABASE IF EXISTS sbs_proj;
CREATE DATABASE sbs_proj;
USE sbs_proj;

CREATE TABLE article (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	nickname CHAR(100) NOT NULL,
	title CHAR(100) NOT NULL,
	`body` CHAR(100) NOT NULL,
	memberId INT(1) UNSIGNED NOT NULL,
	boardId INT(1) UNSIGNED NOT NULL,
	hit INT(10) UNSIGNED NOT NULL,
	`like` INT(10) UNSIGNED NOT NULL,
	INDEX boardId (`boardId`)
);

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목1',
`body` = '내용1',
memberId = 1,
boardId = 1;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목2',
`body` = '내용2',
memberId = 2,
boardId = 1;

INSERT INTO article
SET regDate = NOW(),
updateDate = NOW(),
title = '제목3',
`body` = '내용3',
memberId = 1,
boardId = 2;

SELECT * FROM article;

CREATE TABLE articleReply (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	nickname CHAR(100) NOT NULL,
	`body` CHAR(100) NOT NULL,
	memberId INT(1) UNSIGNED NOT NULL,
	articleId INT(1) UNSIGNED NOT NULL,
	`like` INT(10) UNSIGNED NOT NULL,
	INDEX articleId (`articleId`)
);

SELECT * FROM articleReply;

CREATE TABLE `member` (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	loginId CHAR(100) NOT NULL UNIQUE,
	loginPw CHAR(100) NOT NULL,
	nickname CHAR(100) NOT NULL,
	e_mail CHAR(100) NOT NULL,
	sex CHAR(100) NOT NULL,
	birth CHAR(100) NOT NULL
);

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'admin',
loginPw = 'admin',
nickname = '관리자',
e_mail = 'pyyk@gym.com',
sex = 'M',
birth = '881214';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user1',
loginPw = 'user1',
nickname = '유저1',
e_mail = 'user1@gym.com',
sex = 'F',
birth = '990415';

INSERT INTO `member`
SET regDate = NOW(),
updateDate = NOW(),
loginId = 'user2',
loginPw = 'user2',
nickname = '유저2',
e_mail = 'user2@gym.com',
sex = 'M',
birth = '941221';

SELECT * FROM `member`;

CREATE TABLE board (
	id INT(10) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	regDate DATETIME NOT NULL,
	updateDate DATETIME NOT NULL,
	`code` CHAR(100) NOT NULL UNIQUE, # free/notice
	`name` CHAR(100) NOT NULL # 자유/공지사항
);

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'notice',
`name` = '공지';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'free',
`name` = '자유';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'food',
`name` = '식품 후기';

INSERT INTO `board`
SET regDate = NOW(),
updateDate = NOW(),
`code` = 'wear',
`name` = '운동복 후기';

SELECT * FROM board;