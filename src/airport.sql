/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : flower

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 29/02/2020 14:58:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for airplane
-- ----------------------------
DROP TABLE IF EXISTS `airplane`;
CREATE TABLE `airplane`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `airno` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` int(5) NULL DEFAULT NULL COMMENT '单位分钟',
  `price` double NULL DEFAULT NULL,
  `takeid` int(10) NULL DEFAULT NULL COMMENT '起飞机场',
  `landid` int(10) NULL DEFAULT NULL COMMENT '降落机场',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of airplane
-- ----------------------------
INSERT INTO `airplane` VALUES (1, '播音747', 123, 100, 1, 3);
INSERT INTO `airplane` VALUES (2, '播音858', 77, 300, 3, 2);

-- ----------------------------
-- Table structure for airport
-- ----------------------------
DROP TABLE IF EXISTS `airport`;
CREATE TABLE `airport`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `portname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `cityname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of airport
-- ----------------------------
INSERT INTO `airport` VALUES (1, '首都机场', '北京');
INSERT INTO `airport` VALUES (2, '南苑机场', '北京');
INSERT INTO `airport` VALUES (3, '虹桥机场', '上海');

SET FOREIGN_KEY_CHECKS = 1;
