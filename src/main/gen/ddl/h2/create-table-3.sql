

DROP TABLE IF EXISTS `UME_USER` ;
CREATE TABLE `UME_USER` (
    `USER_ID` VARCHAR(32) NOT NULL	,
    `USER_PASSWORD` VARCHAR(32) 	,
    `USER_NAME` VARCHAR(256) 	,
    `USER_NICK_NAME` VARCHAR(256) 	,
    `USER_GENDER` INT(1) 	,
    `USER_MOBILE` VARCHAR(16) 	,
    `USER_EMAIL` VARCHAR(64) 	,
    `USER_HEAD_IMAGE` VARCHAR(256) 	,
    `USER_DESC` VARCHAR(256) 	,
    `USER_STATUS` INT(1) 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_USER` ADD CONSTRAINT `PK_UME_USER` PRIMARY KEY ( USER_ID ) ;



DROP TABLE IF EXISTS `UME_ROLE` ;
CREATE TABLE `UME_ROLE` (
    `ROLE_ID` VARCHAR(32) NOT NULL	,
    `ROLE_NAME` VARCHAR(64) 	,
    `ROLE_DESC` VARCHAR(128) 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_ROLE` ADD CONSTRAINT `PK_UME_ROLE` PRIMARY KEY ( ROLE_ID ) ;



DROP TABLE IF EXISTS `UME_USER_ROLE` ;
CREATE TABLE `UME_USER_ROLE` (
    `USER_ID` VARCHAR(32) NOT NULL	,
    `ROLE_ID` VARCHAR(32) NOT NULL	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_USER_ROLE` ADD CONSTRAINT `PK_UME_USER_ROLE` PRIMARY KEY ( USER_ID ,ROLE_ID ) ;



DROP TABLE IF EXISTS `UME_RESOURCE` ;
CREATE TABLE `UME_RESOURCE` (
    `RES_ID` VARCHAR(32) NOT NULL	,
    `RES_TYPE` INT(2) NOT NULL	,
    `RES_NAME` VARCHAR(64) 	,
    `RES_GROUP` VARCHAR(64) 	,
    `RES_LINK` VARCHAR(1024) 	,
    `RES_INDEX` INT(8) 	,
    `RES_STATUS` INT(1) 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_RESOURCE` ADD CONSTRAINT `PK_UME_RESOURCE` PRIMARY KEY ( RES_ID ,RES_TYPE ) ;



DROP TABLE IF EXISTS `UME_ROLE_ACL` ;
CREATE TABLE `UME_ROLE_ACL` (
    `ROLE_ID` VARCHAR(32) NOT NULL	,
    `ACC_RES_ID` VARCHAR(32) NOT NULL	,
    `ACC_RES_TYPE` INT(2) NOT NULL	,
    `ACC_LEVEL` INT(2) NOT NULL	DEFAULT 1,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `UME_ROLE_ACL` ADD CONSTRAINT `PK_UME_ROLE_ACL` PRIMARY KEY ( ROLE_ID ,ACC_RES_ID ,ACC_RES_TYPE ,ACC_LEVEL ) ;


