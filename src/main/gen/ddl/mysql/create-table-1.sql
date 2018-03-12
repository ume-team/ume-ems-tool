
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


DROP TABLE IF EXISTS `EM_TBL_CFG` ;
CREATE TABLE `EM_TBL_CFG` (
    `ENT_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '实体ID',
    `ENT_NAME` VARCHAR(64) BINARY 	 COMMENT '实体名称',
    `ENT_TYPE` INT(2) 	DEFAULT 0 COMMENT '实体类别',
    `ENT_LAYOUT` VARCHAR(64) BINARY 	 COMMENT '实体布局模版',
    `REF_TBL_ID` VARCHAR(32) BINARY 	 COMMENT '实体参照表名',
    `REF_TBL_DATASOURCE` VARCHAR(32) BINARY 	 COMMENT '实体参照表数据源',
    `REF_TBL_READONLY_COLS` VARCHAR(256) BINARY 	 COMMENT '参照表的只读属性值',
    `REF_TBL_HIDE_COLS` VARCHAR(256) BINARY 	 COMMENT '实体参照表的隐藏属性集',
    `REF_TBL_DISABLE_COLS` VARCHAR(256) BINARY 	 COMMENT '实体参照表的不可用属性集',
    `PRE_PROC_DISP` VARCHAR(128) BINARY 	 COMMENT '实体自定义显示前处理的ID',
    `PRE_PROC_SAVE` VARCHAR(128) BINARY 	 COMMENT '实体自定义保存前处理的ID',
    `PRE_PROC_VALIDATE` VARCHAR(128) BINARY 	 COMMENT '实体自定义验证器的ID',
    `CUS_ENTITY_MANAGER` VARCHAR(128) BINARY 	 COMMENT '实体自定义EntityManager的ID',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM实体展示配置表' ;
ALTER TABLE `EM_TBL_CFG` ADD CONSTRAINT `PK_EM_TBL_CFG` PRIMARY KEY ( ENT_ID ) ;


DROP TABLE IF EXISTS `EM_TBL_COL_CFG` ;
CREATE TABLE `EM_TBL_COL_CFG` (
    `ENT_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '属性所属实体ID',
    `COL_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '属性ID',
    `COL_NAME` VARCHAR(64) BINARY 	 COMMENT '属性名称',
    `DATA_SUB_TYPE` VARCHAR(32) BINARY 	 COMMENT '属性子类型（扩展类型）',
    `NOT_NULL` INT(1) 	 COMMENT '属性是否非空',
    `DEFAULT_VALUE` VARCHAR(128) BINARY 	 COMMENT '属性默认值',
    `DATA_LENGTH_MIN` INT(32) 	 COMMENT '属性最小长度',
    `DATA_LENGTH_MAX` INT(32) 	 COMMENT '属性最大长度',
    `DATA_RANGE_MIN` VARCHAR(128) BINARY 	 COMMENT '属性最小值',
    `DATA_RANGE_MAX` VARCHAR(128) BINARY 	 COMMENT '属性最大值',
    `CONSTRAINT_TYPE` INT(2) 	 COMMENT '属性制约类型',
    `CONSTRAINT_REF` VARCHAR(32) BINARY 	 COMMENT '属性制约ID',
    `DISP_TYPE` INT(3) 	 COMMENT '属性显示类别',
    `DISP_FORMAT` VARCHAR(128) BINARY 	 COMMENT '显示格式',
    `EDIT_FORMAT` VARCHAR(128) BINARY 	 COMMENT '属性编辑格式',
    `PRE_PROC_DISP` VARCHAR(128) BINARY 	 COMMENT '属性自定义显示前处理',
    `PRE_PROC_SAVE` VARCHAR(128) BINARY 	 COMMENT '属性自定义保存前处理',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM实体属性配置表' ;
ALTER TABLE `EM_TBL_COL_CFG` ADD CONSTRAINT `PK_EM_TBL_COL_CFG` PRIMARY KEY ( ENT_ID ,COL_ID ) ;


DROP TABLE IF EXISTS `EM_CONS_CODE_CFG` ;
CREATE TABLE `EM_CONS_CODE_CFG` (
    `CONS_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '类别编号',
    `CONS_SEQ` INT(8) NOT NULL	 COMMENT '序号',
    `CONS_NAME` VARCHAR(32) BINARY 	 COMMENT '编码名称',
    `CONS_DESC` VARCHAR(64) BINARY 	 COMMENT '编码描述',
    `DISP_VALUE` VARCHAR(256) BINARY 	 COMMENT '表示值',
    `STORE_VALUE` VARCHAR(256) BINARY 	 COMMENT '存贮值',
    `STORE_TYPE` INT(2) 	 COMMENT '存贮类型',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM 编码配置表' ;
ALTER TABLE `EM_CONS_CODE_CFG` ADD CONSTRAINT `PK_EM_CONS_CODE_CFG` PRIMARY KEY ( CONS_ID ,CONS_SEQ ) ;


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


DROP TABLE IF EXISTS `EM_SEQ` ;
CREATE TABLE `EM_SEQ` (
    `ITEM_NAME` VARCHAR(8) BINARY NOT NULL	 COMMENT '采番名称',
    `MIN_VALUE` INT(16) NOT NULL	 COMMENT '最小值',
    `MAX_VALUE` INT(32) NOT NULL	 COMMENT '最大值',
    `CURRENT_INDEX` INT(32) NOT NULL	 COMMENT '当前值',
    `INCREMENT_VALUE` INT(16) NOT NULL	 COMMENT '增量',
    `ITEM_LENGTH` INT 	 COMMENT '长度',
    `PREFIX` VARCHAR(64) BINARY 	 COMMENT '前缀',
    `POSTFIX` VARCHAR(64) BINARY 	 COMMENT '后缀',
    `REPEATABLE` VARCHAR(1) BINARY 	 COMMENT '是否可重复',
    `FORMATTER` VARCHAR(64) BINARY 	 COMMENT '格式化扩展',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '采番表' ;
ALTER TABLE `EM_SEQ` ADD CONSTRAINT `PK_EM_SEQ` PRIMARY KEY ( ITEM_NAME ) ;


