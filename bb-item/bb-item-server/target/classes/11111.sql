/*
Navicat MySQL Data Transfer

Source Server         : 内网测试-115
Source Server Type    : MySQL
Source Server Version : 80020
Source Host           : 192.168.18.115:3306
Source Schema         : lottery

Target Server Type    : MySQL
Target Server Version : 80020
File Encoding         : 65001

Date: 29/12/2020 16:24:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_list
-- ----------------------------
DROP TABLE IF EXISTS `test_list`;
CREATE TABLE `test_list`  (
`id` bigint(0) NOT NULL AUTO_INCREMENT,
`number` tinyint(0) NULL DEFAULT NULL,
`one` tinyint(0) NULL DEFAULT NULL,
`two` tinyint(0) NULL DEFAULT NULL,
`three` tinyint(0) NULL DEFAULT NULL,
`four` tinyint(0) NULL DEFAULT NULL,
`five` tinyint(0) NULL DEFAULT NULL,
`six` tinyint(0) NULL DEFAULT NULL,
`seven` tinyint(0) NULL DEFAULT NULL,
`eight` tinyint(0) NULL DEFAULT NULL,
`nine` tinyint(0) NULL DEFAULT NULL,
`ten` tinyint(0) NULL DEFAULT NULL,
`spacial` tinyint(0) UNSIGNED NULL DEFAULT NULL,
`status` int(0) NULL DEFAULT 1,
`delete_flag` int(0) NOT NULL DEFAULT 0 COMMENT '0 、没有删除 1、删除',
`memo` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
`gmt_created_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP,
`gmt_modified_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(0),
PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1152 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '彩票的分类\r\n' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
