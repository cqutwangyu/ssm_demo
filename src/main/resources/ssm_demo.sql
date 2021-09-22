/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : ssm_demo

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2021-09-22 16:27:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ssm_demo_user
-- ----------------------------
DROP TABLE IF EXISTS `ssm_demo_user`;
CREATE TABLE `ssm_demo_user` (
  `FLOW_ID` varchar(32) NOT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  `SORT` int(11) DEFAULT NULL,
  PRIMARY KEY (`FLOW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ssm_demo_user
-- ----------------------------
INSERT INTO `ssm_demo_user` VALUES ('125d8543bc6d43ac86c830d6f94c3f46', 'a', '1');
INSERT INTO `ssm_demo_user` VALUES ('1fbc865682354e67ba4c84435c1947b8', 'a', '1');
INSERT INTO `ssm_demo_user` VALUES ('c33629f68f7b43889f98d680c5ea91fb', 'a', '1');
INSERT INTO `ssm_demo_user` VALUES ('f4de0713ad294cdfb9d21058f44c3e48', 'a', '1');
