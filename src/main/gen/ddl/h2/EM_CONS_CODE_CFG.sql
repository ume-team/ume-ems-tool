
DROP TABLE IF EXISTS `EM_CONS_CODE_CFG` ;
CREATE TABLE `EM_CONS_CODE_CFG` (
    `CONS_ID` VARCHAR(32) NOT NULL	,
    `CONS_SEQ` INT(8) NOT NULL	,
    `CONS_NAME` VARCHAR(32) 	,
    `CONS_DESC` VARCHAR(64) 	,
    `DISP_VALUE` VARCHAR(256) 	,
    `STORE_VALUE` VARCHAR(256) 	,
    `STORE_TYPE` INT(2) 	,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);
ALTER TABLE `EM_CONS_CODE_CFG` ADD CONSTRAINT `PK_EM_CONS_CODE_CFG` PRIMARY KEY ( CONS_ID ,CONS_SEQ ) ;
