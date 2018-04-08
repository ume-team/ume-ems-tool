

DROP TABLE IF EXISTS `ZOO_DATATYPE_DEMO` ;
CREATE TABLE `ZOO_DATATYPE_DEMO` (
    `textValuePrimaryKey` VARCHAR(10) NOT NULL	DEFAULT 'AAA',
    `textValueVarLength` VARCHAR(10) NOT NULL	,
    `IntValue` INT(3) 	,
    `IntValueWithDefault` INT 	DEFAULT 32,
    `DateValue` DATE 	,
    `TimeValue` TIME 	,
	`TimestampValue` TIMESTAMP 	NULL DEFAULT NULL,
    `BigIntValueWithLength` BIGINT(50) 	,
    `BigIntValue` BIGINT 	,
    `decimalValue` DECIMAL 	,
    `DecimalValueWithLength` DECIMAL(10,2) 	,
    `TextFixedValue` CHAR(3) 	,
    `LongTextValue` TEXT(128) 	,
    `blobObj` BLOB 	,
    `clobObj` TEXT 	,
	`AutoGenSequence` INT AUTO_INCREMENT PRIMARY KEY,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `UPDATE_AUTHOR` VARCHAR(32),
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP
);

DROP TABLE IF EXISTS `ZOO_DATATYPE_DEMO_HT` ;
CREATE TABLE `ZOO_DATATYPE_DEMO_HT` (
    `textValuePrimaryKey` VARCHAR(10),
    `textValueVarLength` VARCHAR(10),
    `IntValue` INT(3),
    `IntValueWithDefault` INT,
    `DateValue` DATE,
    `TimeValue` TIME,
    `TimestampValue` TIMESTAMP  NULL DEFAULT NULL,
    `BigIntValueWithLength` BIGINT(50),
    `BigIntValue` BIGINT,
    `decimalValue` DECIMAL,
    `DecimalValueWithLength` DECIMAL(10,2),
    `TextFixedValue` CHAR(3),
    `LongTextValue` TEXT(128),
    `blobObj` BLOB,
    `clobObj` TEXT,
    `AutoGenSequence` INT,
    `CREATE_AUTHOR` VARCHAR(32),
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `OPERATION_HISTORY_CATEGORY` CHAR(1) NOT NULL
);

