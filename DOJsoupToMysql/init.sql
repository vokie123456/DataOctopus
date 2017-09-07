-- 创建数据库
drop DATABASE if exists `TENDERDB`;
CREATE DATABASE `TENDERDB` CHARACTER SET 'utf8'  COLLATE 'utf8_general_ci';

use TENDERDB;

CREATE TABLE TenderNotice (
  tenderKey INTEGER(11) NOT NULL,
  orgName VARCHAR(50) DEFAULT NULL,
  tenderName VARCHAR(255) DEFAULT NULL,
  tenderDate VARCHAR(50) DEFAULT NULL,
  tenderType VARCHAR(50) DEFAULT NULL,
  tenderYear VARCHAR(10) DEFAULT NULL,
  tenderYearMonth VARCHAR(10) DEFAULT NULL,
  PRIMARY KEY (tenderKey) COMMENT ''
);

