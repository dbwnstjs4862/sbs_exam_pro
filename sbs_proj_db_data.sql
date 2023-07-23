/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 10.4.28-MariaDB : Database - sbs_proj
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sbs_proj` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `sbs_proj`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `nickname` char(100) NOT NULL,
  `title` char(100) NOT NULL,
  `body` char(100) NOT NULL,
  `memberId` int(1) unsigned NOT NULL,
  `boardId` int(1) unsigned NOT NULL,
  `hit` int(10) unsigned NOT NULL,
  `like` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `boardId` (`boardId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `article` */

insert  into `article`(`id`,`regDate`,`updateDate`,`nickname`,`title`,`body`,`memberId`,`boardId`,`hit`,`like`) values 
(1,'2023-07-24 05:21:24','2023-07-24 05:21:24','','제목1','내용1',1,1,0,0),
(2,'2023-07-24 05:21:24','2023-07-24 05:21:24','','제목2','내용2',2,1,0,0),
(3,'2023-07-24 05:21:24','2023-07-24 05:21:24','','제목3','내용3',1,2,0,0);

/*Table structure for table `articleReply` */

DROP TABLE IF EXISTS `articleReply`;

CREATE TABLE `articleReply` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `nickname` char(100) NOT NULL,
  `body` char(100) NOT NULL,
  `memberId` int(1) unsigned NOT NULL,
  `articleId` int(1) unsigned NOT NULL,
  `like` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `articleId` (`articleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `articleReply` */

insert  into `articleReply`(`id`,`regDate`,`updateDate`,`nickname`,`body`,`memberId`,`articleId`,`like`) values 
(1,'2023-07-24 05:24:03','2023-07-24 05:24:03','유저1','zz',2,4,0),
(2,'2023-07-24 05:24:39','2023-07-24 05:24:39','유저1','qt',2,4,0);

/*Table structure for table `board` */

DROP TABLE IF EXISTS `board`;

CREATE TABLE `board` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `code` char(100) NOT NULL,
  `name` char(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `code` (`code`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `board` */

insert  into `board`(`id`,`regDate`,`updateDate`,`code`,`name`) values 
(1,'2023-07-24 05:21:24','2023-07-24 05:21:24','notice','공지'),
(2,'2023-07-24 05:21:24','2023-07-24 05:21:24','free','자유'),
(3,'2023-07-24 05:21:24','2023-07-24 05:21:24','food','식품 후기'),
(4,'2023-07-24 05:21:24','2023-07-24 05:21:24','wear','운동복 후기');

/*Table structure for table `member` */

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `regDate` datetime NOT NULL,
  `updateDate` datetime NOT NULL,
  `loginId` char(100) NOT NULL,
  `loginPw` char(100) NOT NULL,
  `nickname` char(100) NOT NULL,
  `e_mail` char(100) NOT NULL,
  `sex` char(100) NOT NULL,
  `birth` char(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `loginId` (`loginId`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `member` */

insert  into `member`(`id`,`regDate`,`updateDate`,`loginId`,`loginPw`,`nickname`,`e_mail`,`sex`,`birth`) values 
(1,'2023-07-24 05:21:24','2023-07-24 05:21:24','admin','admin','관리자','pyyk@gym.com','M','881214'),
(2,'2023-07-24 05:21:24','2023-07-24 05:21:24','user1','user1','유저1','user1@gym.com','F','990415'),
(3,'2023-07-24 05:21:24','2023-07-24 05:21:24','user2','user2','유저2','user2@gym.com','M','941221');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
