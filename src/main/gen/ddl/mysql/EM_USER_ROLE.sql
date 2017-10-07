
/* EM_USER_ROLE : EM用户角色分配表 */
DROP TABLE IF EXISTS `EM_USER_ROLE` ;
CREATE TABLE `EM_USER_ROLE` (
    `USER_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '用户ID',
    `ROLE_ID` VARCHAR(32) BINARY NOT NULL	 COMMENT '用户持有角色ID',
    `CREATE_AUTHOR` VARCHAR(32) BINARY COMMENT '创建者',
    `CREATE_DATETIME` TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `UPDATE_AUTHOR` VARCHAR(32) BINARY COMMENT '更新者',
    `UPDATE_DATETIME` TIMESTAMP  DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
) COMMENT 'EM用户角色分配表' ;
ALTER TABLE `EM_USER_ROLE` ADD CONSTRAINT `PK_EM_USER_ROLE` PRIMARY KEY ( USER_ID ,ROLE_ID ) ;
