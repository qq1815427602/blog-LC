/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.52 : Database - re_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`re_blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `re_blog`;

/*Table structure for table `re_articles` */

DROP TABLE IF EXISTS `re_articles`;

CREATE TABLE `re_articles` (
  `article_id` bigint(255) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '发表用户ID',
  `article_title` varchar(32) DEFAULT NULL COMMENT '帖子标题',
  `article_content` longtext COMMENT '帖子内容',
  `article_views` bigint(20) DEFAULT NULL COMMENT '浏览量',
  `article_comment_count` bigint(20) DEFAULT NULL COMMENT '评论总数',
  `article_date` datetime DEFAULT NULL COMMENT '发表时间',
  `article_like_count` bigint(20) DEFAULT NULL COMMENT '点赞数量',
  `article_state` int(11) DEFAULT NULL COMMENT '状态 0:编辑完成 1:展示中 2:草稿箱 3:垃圾箱',
  PRIMARY KEY (`article_id`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `re_articles` */

insert  into `re_articles`(`article_id`,`user_id`,`article_title`,`article_content`,`article_views`,`article_comment_count`,`article_date`,`article_like_count`,`article_state`) values (1,1,'标题','测试内容',0,0,'2020-02-01 00:00:00',0,0),(2,2,'测试','测试内容',0,0,'2020-02-02 19:48:33',0,0),(3,3,'测试标题QAQ','测试内容QWQ',0,0,NULL,0,0);

/*Table structure for table `re_comments` */

DROP TABLE IF EXISTS `re_comments`;

CREATE TABLE `re_comments` (
  `comment_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `user_id` bigint(20) DEFAULT NULL COMMENT '发表用户ID',
  `article_id` bigint(20) DEFAULT NULL COMMENT '评论文章ID',
  `comment_like_count` bigint(20) DEFAULT NULL COMMENT '点赞数',
  `comment_date` datetime DEFAULT NULL COMMENT '评论日期',
  `comment_content` text COMMENT '评论内容',
  `parent_comment_id` varchar(32) DEFAULT NULL COMMENT '父评论ID',
  `comment_state` int(11) DEFAULT NULL COMMENT '状态 1:正常展示 2:冻结中 3:黑名单封禁',
  PRIMARY KEY (`comment_id`),
  KEY `article_id` (`article_id`),
  KEY `comment_date` (`comment_date`),
  KEY `parent_comment_id` (`parent_comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `re_comments` */

insert  into `re_comments`(`comment_id`,`user_id`,`article_id`,`comment_like_count`,`comment_date`,`comment_content`,`parent_comment_id`,`comment_state`) values (1,1,1,0,'2020-02-06 11:36:03','博主写的很好哦 奥力给！','0',1),(2,2,1,0,'2020-02-06 11:46:28','确实 有一说一','1',1);

/*Table structure for table `re_labels` */

DROP TABLE IF EXISTS `re_labels`;

CREATE TABLE `re_labels` (
  `label_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标签ID',
  `label_name` varchar(20) NOT NULL COMMENT '标签名称',
  `label_alias` varchar(15) DEFAULT NULL COMMENT '标签别名',
  `label_description` text NOT NULL COMMENT '标签描述',
  PRIMARY KEY (`label_id`),
  KEY `label_name` (`label_name`),
  KEY `label_alias` (`label_alias`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `re_labels` */

insert  into `re_labels`(`label_id`,`label_name`,`label_alias`,`label_description`) values (1,'动漫',NULL,'肥宅资讯'),(2,'日记本',NULL,'用于记录生活');

/*Table structure for table `re_log` */

DROP TABLE IF EXISTS `re_log`;

CREATE TABLE `re_log` (
  `log_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志编号',
  `user_id` bigint(20) NOT NULL COMMENT '用户编号',
  `log_info` varchar(255) NOT NULL COMMENT '日志说明',
  `log_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `re_log` */

/*Table structure for table `re_roles` */

DROP TABLE IF EXISTS `re_roles`;

CREATE TABLE `re_roles` (
  `role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `parent_role_id` bigint(20) DEFAULT NULL COMMENT '父级角色ID',
  `role_name` varchar(64) DEFAULT NULL COMMENT '角色名称',
  `role_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `role_description` varchar(200) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `re_roles` */

insert  into `re_roles`(`role_id`,`parent_role_id`,`role_name`,`role_createtime`,`role_description`) values (1,0,'普通用户','2020-01-31 21:04:16','普通权限');

/*Table structure for table `re_set_artitle_label` */

DROP TABLE IF EXISTS `re_set_artitle_label`;

CREATE TABLE `re_set_artitle_label` (
  `article_label_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号ID',
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `label_id` bigint(20) NOT NULL COMMENT '标签ID',
  PRIMARY KEY (`article_label_id`),
  KEY `label_id` (`label_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `re_set_artitle_label` */

insert  into `re_set_artitle_label`(`article_label_id`,`article_id`,`label_id`) values (1,1,1),(2,1,2),(3,2,1);

/*Table structure for table `re_set_artitle_sort` */

DROP TABLE IF EXISTS `re_set_artitle_sort`;

CREATE TABLE `re_set_artitle_sort` (
  `article_id` bigint(20) NOT NULL COMMENT '文章ID',
  `sort_id` bigint(20) NOT NULL COMMENT '分类ID',
  PRIMARY KEY (`article_id`),
  KEY `sort_id` (`sort_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `re_set_artitle_sort` */

/*Table structure for table `re_set_users_role` */

DROP TABLE IF EXISTS `re_set_users_role`;

CREATE TABLE `re_set_users_role` (
  `users_role_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号ID',
  `role_id` bigint(20) NOT NULL COMMENT '角色ID',
  `user_id` bigint(20) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`users_role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `re_set_users_role` */

insert  into `re_set_users_role`(`users_role_id`,`role_id`,`user_id`) values (1,1,3);

/*Table structure for table `re_sorts` */

DROP TABLE IF EXISTS `re_sorts`;

CREATE TABLE `re_sorts` (
  `sort_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '分类ID',
  `sort_name` varchar(50) DEFAULT NULL COMMENT '分类名称',
  `sort_alias` varchar(15) DEFAULT NULL COMMENT '分类别名',
  `sort_icon` bigint(20) DEFAULT NULL COMMENT '分类图标',
  `sort_description` text COMMENT '分类描述',
  `parent_sort_id` varchar(20) DEFAULT NULL COMMENT '父分类ID',
  PRIMARY KEY (`sort_id`),
  KEY `sort_name` (`sort_name`),
  KEY `sort_alias` (`sort_alias`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

/*Data for the table `re_sorts` */

insert  into `re_sorts`(`sort_id`,`sort_name`,`sort_alias`,`sort_icon`,`sort_description`,`parent_sort_id`) values (1,'技术',NULL,NULL,NULL,'0'),(2,'前端',NULL,NULL,NULL,'1'),(3,'Spring',NULL,NULL,NULL,'4'),(4,'后端',NULL,NULL,NULL,'1'),(5,'MyBatis',NULL,NULL,NULL,'4');

/*Table structure for table `re_users` */

DROP TABLE IF EXISTS `re_users`;

CREATE TABLE `re_users` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `user_ip` varchar(20) DEFAULT NULL COMMENT '用户IP',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名',
  `user_password` varchar(100) DEFAULT NULL COMMENT '用户密码',
  `user_email` varchar(30) DEFAULT NULL COMMENT '用户邮箱',
  `user_profile_photo` varchar(255) DEFAULT NULL COMMENT '用户头像',
  `user_registration_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `user_birthday` date DEFAULT NULL COMMENT '用户生日',
  `user_age` tinyint(4) DEFAULT NULL COMMENT '用户年龄',
  `user_telephone_number` int(11) DEFAULT NULL COMMENT '用户手机号',
  `user_nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `user_wechat_id` varchar(128) DEFAULT NULL COMMENT '用户微信ID标识',
  `user_state` int(11) DEFAULT NULL COMMENT '状态 1:正常 2:冻结 3:封禁',
  PRIMARY KEY (`user_id`),
  KEY `user_name` (`user_name`),
  KEY `user_nickname` (`user_nickname`),
  KEY `user_email` (`user_email`),
  KEY `user_telephone_number` (`user_telephone_number`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `re_users` */

insert  into `re_users`(`user_id`,`user_ip`,`user_name`,`user_password`,`user_email`,`user_profile_photo`,`user_registration_time`,`user_birthday`,`user_age`,`user_telephone_number`,`user_nickname`,`user_wechat_id`,`user_state`) values (1,NULL,'夜空',NULL,NULL,NULL,'2020-01-31 19:37:22',NULL,NULL,NULL,NULL,NULL,NULL),(2,NULL,'星空',NULL,NULL,NULL,'2020-01-31 19:37:22',NULL,NULL,NULL,NULL,NULL,NULL),(3,NULL,NULL,'$2a$10$xhbFfbgqQPsi6DLfiDw/AeFfkJVu413ROhbrPfJ72QbsT8FsQ7Nu2','string','https://cn.vuejs.org/images/logo.png','2020-01-31 21:41:50',NULL,NULL,NULL,NULL,NULL,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
