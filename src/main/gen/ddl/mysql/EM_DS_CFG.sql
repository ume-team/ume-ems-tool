
/* EM_DS_CFG : EM数据源配置表 */
DROP TABLE IF EXISTS `EM_DS_CFG` ;
CREATE TABLE `EM_DS_CFG` (
    `ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '实体ID',
    `NAME` VARCHAR(128) BINARY 	 COMMENT '数据源名称',
    `URL` VARCHAR(128) BINARY NOT NULL	 COMMENT '数据源连接URL',
    `DRIVER_CLASS` VARCHAR(128) BINARY NOT NULL	 COMMENT '数据源JDBC驱动类名',
    `USERNAME` VARCHAR(32) BINARY NOT NULL	 COMMENT '数据源用户名',
    `PASSWORD` VARCHAR(32) BINARY NOT NULL	 COMMENT '数据源密码',
    `MAX_WAIT` VARCHAR(8) BINARY 	DEFAULT '1' COMMENT '连接池最大等待时间',
    `MIN_IDLE` VARCHAR(8) BINARY 	DEFAULT '1' COMMENT '连接池最小闲置数',
    `MAX_IDLE` VARCHAR(8) BINARY 	DEFAULT '2' COMMENT '连接池最大闲置数',
    `MAX_ACTIVE` VARCHAR(8) BINARY 	DEFAULT '5' COMMENT '连接池最大活跃数',
    `INITIAL_SIZE` VARCHAR(8) BINARY 	DEFAULT '1' COMMENT '连接池初始化连接数',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM数据源配置表' ;
ALTER TABLE `EM_DS_CFG` ADD CONSTRAINT `PK_EM_DS_CFG` PRIMARY KEY ( ID ) ;
