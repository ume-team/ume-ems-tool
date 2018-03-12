
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

