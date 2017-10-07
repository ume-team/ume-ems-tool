
package org.umeframework.ems.entity;

import java.io.Serializable;
import org.umeframework.dora.validation.constraints.Size;
import org.umeframework.dora.type.ColumnDesc;
import org.umeframework.dora.validation.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.umeframework.dora.type.TableDesc;
import javax.persistence.Id;
import org.umeframework.dora.bean.BeanUtil;
import org.umeframework.dora.service.TableEntity;

/**
 * Entity class map to table "EM角色定义表"
 *
 * @author ume-team
 */
@Entity
@Table(name="EM_ROLE")
@TableDesc(label="EM角色定义表")
public class EmRoleDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 角色ID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="角色ID")
    @Column(name="ROLE_ID", nullable=false, length=32)
    private String roleId;

   /**
    * 角色名称 
    */
    @Size(max=64)
    @ColumnDesc(index=2, type="VARCHAR", label="角色名称")
    @Column(name="ROLE_NAME", nullable=true, length=64)
    private String roleName;

   /**
    * 角色描述 
    */
    @Size(max=128)
    @ColumnDesc(index=3, type="VARCHAR", label="角色描述")
    @Column(name="ROLE_DESC", nullable=true, length=128)
    private String roleDesc;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(3 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(3 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(3 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(3 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "角色ID"
     */
    public String getRoleId() {
        return this.roleId;
    }
    /**
     *　Set the "角色ID"
     */
    public void setRoleId(
            String roleId) {
        this.roleId = roleId;
    }

    /**
     *　Get the "角色名称"
     */
    public String getRoleName() {
        return this.roleName;
    }
    /**
     *　Set the "角色名称"
     */
    public void setRoleName(
            String roleName) {
        this.roleName = roleName;
    }

    /**
     *　Get the "角色描述"
     */
    public String getRoleDesc() {
        return this.roleDesc;
    }
    /**
     *　Set the "角色描述"
     */
    public void setRoleDesc(
            String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * Get the "Create Auther"
     */
    public String getCreateAuthor() {
        return createAuthor;
    }
    /**
     * Set the "Create Auther"
     */
    public void setCreateAuthor(
            String createAuthor) {
        this.createAuthor = createAuthor;
    }

    /**
     * Get the "Create Datetime"
     */
    public java.sql.Timestamp getCreateDatetime() {
        return createDatetime;
    }
    /**
     * Set the "Create Datetime"
     */
    public void setCreateDatetime(
            java.sql.Timestamp createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * Get the "Update Auther"
     */
    public String getUpdateAuthor() {
        return updateAuthor;
    }
    /**
     * Set the "Update Auther"
     */
    public void setUpdateAuthor(
            String updateAuthor) {
        this.updateAuthor = updateAuthor;
    }

    /**
     * Get the "Update Datetime"
     */
    public java.sql.Timestamp getUpdateDatetime() {
        return updateDatetime;
    }
    /**
     * Set the "Update Datetime"
     */
    public void setUpdateDatetime(
            java.sql.Timestamp updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    /**
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    public EmRoleDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        EmRoleDto newInstance = new EmRoleDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = BeanUtil.getBeanProperty(this, name);
            BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    }
    
    /**
     * Constant declare: SQL ID in config file
     */
    public static class SQLID {
        public static final String INSERT = "org.umeframework.ems.entity.EM_ROLE_INSERT"; 
        public static final String UPDATE = "org.umeframework.ems.entity.EM_ROLE_UPDATE"; 
        public static final String SMART_UPDATE = "org.umeframework.ems.entity.EM_ROLE_SMART_UPDATE"; 
        public static final String DELETE = "org.umeframework.ems.entity.EM_ROLE_DELETE"; 
        public static final String FIND = "org.umeframework.ems.entity.EM_ROLE_FIND"; 
        public static final String FIND_FOR_UPDATE = "org.umeframework.ems.entity.EM_ROLE_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "org.umeframework.ems.entity.EM_ROLE_SEARCH"; 
        public static final String LIKE_SEARCH = "org.umeframework.ems.entity.EM_ROLE_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "org.umeframework.ems.entity.EM_ROLE_DYNA_SEARCH"; 
        public static final String COUNT = "org.umeframework.ems.entity.EM_ROLE_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String roleId = "roleId";
        public static final String roleName = "roleName";
        public static final String roleDesc = "roleDesc";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String ROLE_ID = "ROLE_ID";
        public static final String ROLE_NAME = "ROLE_NAME";
        public static final String ROLE_DESC = "ROLE_DESC";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "EM_ROLE";

}
