/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : csdn

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2019-04-12 16:22:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for csdn_user
-- ----------------------------
DROP TABLE IF EXISTS `csdn_user`;
CREATE TABLE `csdn_user` (
  `USER_ID` varchar(255) NOT NULL,
  `USER_NAME` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of csdn_user
-- ----------------------------
INSERT INTO `csdn_user` VALUES ('1', 'admin', '123456');
