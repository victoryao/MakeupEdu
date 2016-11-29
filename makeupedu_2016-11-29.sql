# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.11)
# Database: makeupedu
# Generation Time: 2016-11-29 15:17:09 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table stu_info
# ------------------------------------------------------------

DROP TABLE IF EXISTS `stu_info`;

CREATE TABLE `stu_info` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `cls_interest` varchar(256) DEFAULT NULL COMMENT '感兴趣的课程',
  `cls_time` varchar(256) DEFAULT NULL,
  `approach` varchar(256) DEFAULT NULL COMMENT '了解渠道',
  `learn_goal` varchar(256) DEFAULT NULL COMMENT '学习的主要目的',
  `learn_time` varchar(256) DEFAULT NULL COMMENT '什么时候入学',
  `expectation` varchar(256) DEFAULT NULL COMMENT '毕业后的工作场所',
  `reason` varchar(256) DEFAULT NULL COMMENT '选择学校的理由',
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `stu_info` WRITE;
/*!40000 ALTER TABLE `stu_info` DISABLE KEYS */;

INSERT INTO `stu_info` (`id`, `stu_id`, `cls_interest`, `cls_time`, `approach`, `learn_goal`, `learn_time`, `expectation`, `reason`, `created`, `modified`)
VALUES
	(1,2,'[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','2016-11-28 00:10:30','2016-11-28 00:10:30'),
	(2,1,'[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]','2016-11-28 00:11:57','2016-11-28 00:11:57');

/*!40000 ALTER TABLE `stu_info` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table stu_query_his
# ------------------------------------------------------------

DROP TABLE IF EXISTS `stu_query_his`;

CREATE TABLE `stu_query_his` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(64) NOT NULL DEFAULT '',
  `remark` text,
  `created` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `stu_query_his` WRITE;
/*!40000 ALTER TABLE `stu_query_his` DISABLE KEYS */;

INSERT INTO `stu_query_his` (`id`, `stu_id`, `user_id`, `user_name`, `remark`, `created`)
VALUES
	(1,0,1,'1','备注','2016-11-28 00:11:57');

/*!40000 ALTER TABLE `stu_query_his` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table student
# ------------------------------------------------------------

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(56) NOT NULL DEFAULT '',
  `gender` varchar(2) NOT NULL DEFAULT '0' COMMENT '0:男 1:女',
  `age` tinyint(4) NOT NULL DEFAULT '0',
  `phone` bigint(11) NOT NULL,
  `qq` int(11) NOT NULL DEFAULT '0',
  `is_work` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0:在职 1：不在职',
  `job_sort` varchar(256) NOT NULL DEFAULT '' COMMENT '职业类别',
  `created` datetime NOT NULL,
  `modified` datetime NOT NULL,
  `status` tinyint(4) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;

INSERT INTO `student` (`id`, `name`, `gender`, `age`, `phone`, `qq`, `is_work`, `job_sort`, `created`, `modified`, `status`)
VALUES
	(1,'张三','1',23,15811193221,274927444,0,'{\"code\":1,\"remark\":\"备注\"}','2016-11-28 00:03:41','2016-11-28 00:03:41',0),
	(2,'张三','1',23,15811193221,274927444,0,'{\"code\":1,\"remark\":\"备注\"}','2016-11-28 00:05:40','2016-11-28 00:05:40',0),
	(3,'张三','1',23,15811193221,274927444,0,'{\"code\":1,\"remark\":\"备注\"}','2016-11-28 00:06:40','2016-11-28 00:06:40',0),
	(4,'张三','1',23,15811193221,274927444,0,'{\"code\":1,\"remark\":\"备注\"}','2016-11-28 00:10:30','2016-11-28 00:10:30',0),
	(5,'张三','1',23,15811193221,274927444,0,'{\"code\":1,\"remark\":\"备注\"}','2016-11-28 00:11:57','2016-11-28 00:11:57',0);

/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(256) NOT NULL DEFAULT '',
  `password` varchar(256) NOT NULL DEFAULT '',
  `type` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `user_name`, `password`, `type`)
VALUES
	(1,'123','123',0);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
