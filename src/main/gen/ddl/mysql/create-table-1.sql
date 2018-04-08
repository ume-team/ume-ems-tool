
DROP TABLE IF EXISTS `ZOO_DATATYPE_DEMO` ;
CREATE TABLE `ZOO_DATATYPE_DEMO` (
    `textValuePrimaryKey` VARCHAR(10) BINARY NOT NULL	DEFAULT 'AAA' COMMENT '文本字段1',
    `textValueVarLength` VARCHAR(10) BINARY NOT NULL	 COMMENT '文本字段2',
    `IntValue` INT(3) 	 COMMENT '整数字段1',
    `IntValueWithDefault` INT 	DEFAULT 32 COMMENT '整数字段2',
    `DateValue` DATE 	 COMMENT '日期字段',
    `TimeValue` TIME 	 COMMENT '时间字段',
	`TimestampValue` TIMESTAMP 	NULL DEFAULT NULL COMMENT '时间戳字段',
    `BigIntValueWithLength` BIGINT(50) 	 COMMENT '大整数字段1',
    `BigIntValue` BIGINT 	 COMMENT '大整数字段2',
    `decimalValue` DECIMAL 	 COMMENT '数值1',
    `DecimalValueWithLength` DECIMAL(10,2) 	 COMMENT '数值2',
    `TextFixedValue` CHAR(3) BINARY 	 COMMENT '定长字符1',
    `LongTextValue` TEXT(128) 	 COMMENT '长文本1',
    `blobObj` BLOB 	 COMMENT '二进制',
    `clobObj` TEXT 	 COMMENT '字符流',
	`AutoGenSequence` INT AUTO_INCREMENT PRIMARY KEY COMMENT '自增长序列',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT '数据类型测试·DEMO表' ;

DROP TABLE IF EXISTS `ZOO_DATATYPE_DEMO_HT` ;
CREATE TABLE `ZOO_DATATYPE_DEMO_HT` (
    `textValuePrimaryKey` VARCHAR(10),
    `textValueVarLength` VARCHAR(10),
    `IntValue` INT(3),
    `IntValueWithDefault` INT,
    `DateValue` DATE,
    `TimeValue` TIME,
    `TimestampValue` TIMESTAMP  NULL DEFAULT NULL COMMENT '时间戳字段',
    `BigIntValueWithLength` BIGINT(50),
    `BigIntValue` BIGINT,
    `decimalValue` DECIMAL,
    `DecimalValueWithLength` DECIMAL(10,2),
    `TextFixedValue` CHAR(3),
    `LongTextValue` TEXT(128),
    `blobObj` BLOB,
    `clobObj` TEXT,
    `AutoGenSequence` INT,
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `OPERATION_HISTORY_CATEGORY` CHAR(1) NOT NULL COMMENT '操作类别'
);

