
/* UME_ROLE_ACL : UME角色资源访问权限关系表 */
DROP TABLE IF EXISTS `UME_ROLE_ACL` ;
CREATE TABLE `UME_ROLE_ACL` (
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '角色ID',
    `ACC_RES_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '角色可访问的资源ID',
    `ACC_RES_TYPE` INT(2) NOT NULL	 COMMENT '角色可访问的资源ID',
    `ACC_LEVEL` INT(2) NOT NULL	DEFAULT 1 COMMENT '访问级别',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'UME角色资源访问权限关系表' ;
ALTER TABLE `UME_ROLE_ACL` ADD CONSTRAINT `PK_UME_ROLE_ACL` PRIMARY KEY ( ROLE_ID ,ACC_RES_ID ,ACC_RES_TYPE ,ACC_LEVEL ) ;

