
/* EM_CONS_SQL_CFG : EM 制约（SQL）配置表 */
DROP TABLE IF EXISTS `EM_CONS_SQL_CFG` ;
CREATE TABLE `EM_CONS_SQL_CFG` (
    `CONS_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '制约ID',
    `CONS_NAME` VARCHAR(32) BINARY 	 COMMENT '制约名称',
    `CONS_DESC` VARCHAR(64) BINARY 	 COMMENT '制约描述',
    `CONS_SQLR` VARCHAR(1024) BINARY 	 COMMENT '制约SQLR',
    `CONS_SQLU` VARCHAR(1024) BINARY 	 COMMENT '制约SQLU',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM 制约（SQL）配置表' ;
ALTER TABLE `EM_CONS_SQL_CFG` ADD CONSTRAINT `PK_EM_CONS_SQL_CFG` PRIMARY KEY ( CONS_ID ) ;
