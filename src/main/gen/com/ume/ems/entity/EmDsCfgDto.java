
package com.ume.ems.entity;

import java.io.Serializable;
import com.dora.type.TableDesc;
import javax.persistence.Table;
import javax.persistence.Column;
import com.dora.validation.constraints.Size;
import javax.persistence.Entity;
import com.dora.validation.constraints.NotEmpty;
import com.dora.type.ColumnDesc;
import javax.persistence.Id;
import com.dora.validation.constraints.TextFormat;
import com.dora.bean.BeanUtil;
import com.dora.service.TableObject;

/**
 * Pojo mcom.umeing to table "EM数据源配置表"
 *
 * @author DORA.Generator
 */
@Entity
@Table(name="EM_DS_CFG")
@TableDesc(label="EM数据源配置表")
public class EmDsCfgDto extends TableObject implements Serializable, Comparable<EmDsCfgDto> {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 实体ID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @TextFormat(TextFormat.Category.AlphaNumeric)
    @ColumnDesc(index=1, type="VARCHAR", label="实体ID")
    @Column(name="ID", nullable=false, length=32)
    private String id;

   /**
    * 数据源名称 
    */
    @Size(max=128)
    @ColumnDesc(index=2, type="VARCHAR", label="数据源名称")
    @Column(name="NAME", nullable=true, length=128)
    private String name;

   /**
    * 数据源连接URL 
    */
    @NotEmpty
    @Size(max=128)
    @ColumnDesc(index=3, type="VARCHAR", label="数据源连接URL")
    @Column(name="URL", nullable=false, length=128)
    private String url;

   /**
    * 数据源JDBC驱动类名 
    */
    @NotEmpty
    @Size(max=128)
    @ColumnDesc(index=4, type="VARCHAR", label="数据源JDBC驱动类名")
    @Column(name="DRIVER_CLASS", nullable=false, length=128)
    private String driverClass;

   /**
    * 数据源用户名 
    */
    @NotEmpty
    @Size(max=32)
    @ColumnDesc(index=5, type="VARCHAR", label="数据源用户名")
    @Column(name="USERNAME", nullable=false, length=32)
    private String username;

   /**
    * 数据源密码 
    */
    @NotEmpty
    @Size(max=32)
    @ColumnDesc(index=6, type="VARCHAR", label="数据源密码")
    @Column(name="PASSWORD", nullable=false, length=32)
    private String password;

   /**
    * 连接池最大等待时间 
    */
    @Size(max=8)
    @ColumnDesc(index=7, type="VARCHAR", label="连接池最大等待时间")
    @Column(name="MAX_WAIT", nullable=true, length=8)
    private String maxWait;

   /**
    * 连接池最小闲置数 
    */
    @Size(max=8)
    @ColumnDesc(index=8, type="VARCHAR", label="连接池最小闲置数")
    @Column(name="MIN_IDLE", nullable=true, length=8)
    private String minIdle;

   /**
    * 连接池最大闲置数 
    */
    @Size(max=8)
    @ColumnDesc(index=9, type="VARCHAR", label="连接池最大闲置数")
    @Column(name="MAX_IDLE", nullable=true, length=8)
    private String maxIdle;

   /**
    * 连接池最大活跃数 
    */
    @Size(max=8)
    @ColumnDesc(index=10, type="VARCHAR", label="连接池最大活跃数")
    @Column(name="MAX_ACTIVE", nullable=true, length=8)
    private String maxActive;

   /**
    * 连接池初始化连接数 
    */
    @Size(max=8)
    @ColumnDesc(index=11, type="VARCHAR", label="连接池初始化连接数")
    @Column(name="INITIAL_SIZE", nullable=true, length=8)
    private String initialSize;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(11 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(11 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(11 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(11 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "实体ID"
     */
    public String getId() {
        return this.id;
    }
    /**
     *　Set the "实体ID"
     */
    public void setId(
            String id) {
        this.id = id;
    }

    /**
     *　Get the "数据源名称"
     */
    public String getName() {
        return this.name;
    }
    /**
     *　Set the "数据源名称"
     */
    public void setName(
            String name) {
        this.name = name;
    }

    /**
     *　Get the "数据源连接URL"
     */
    public String getUrl() {
        return this.url;
    }
    /**
     *　Set the "数据源连接URL"
     */
    public void setUrl(
            String url) {
        this.url = url;
    }

    /**
     *　Get the "数据源JDBC驱动类名"
     */
    public String getDriverClass() {
        return this.driverClass;
    }
    /**
     *　Set the "数据源JDBC驱动类名"
     */
    public void setDriverClass(
            String driverClass) {
        this.driverClass = driverClass;
    }

    /**
     *　Get the "数据源用户名"
     */
    public String getUsername() {
        return this.username;
    }
    /**
     *　Set the "数据源用户名"
     */
    public void setUsername(
            String username) {
        this.username = username;
    }

    /**
     *　Get the "数据源密码"
     */
    public String getPassword() {
        return this.password;
    }
    /**
     *　Set the "数据源密码"
     */
    public void setPassword(
            String password) {
        this.password = password;
    }

    /**
     *　Get the "连接池最大等待时间"
     */
    public String getMaxWait() {
        return this.maxWait;
    }
    /**
     *　Set the "连接池最大等待时间"
     */
    public void setMaxWait(
            String maxWait) {
        this.maxWait = maxWait;
    }

    /**
     *　Get the "连接池最小闲置数"
     */
    public String getMinIdle() {
        return this.minIdle;
    }
    /**
     *　Set the "连接池最小闲置数"
     */
    public void setMinIdle(
            String minIdle) {
        this.minIdle = minIdle;
    }

    /**
     *　Get the "连接池最大闲置数"
     */
    public String getMaxIdle() {
        return this.maxIdle;
    }
    /**
     *　Set the "连接池最大闲置数"
     */
    public void setMaxIdle(
            String maxIdle) {
        this.maxIdle = maxIdle;
    }

    /**
     *　Get the "连接池最大活跃数"
     */
    public String getMaxActive() {
        return this.maxActive;
    }
    /**
     *　Set the "连接池最大活跃数"
     */
    public void setMaxActive(
            String maxActive) {
        this.maxActive = maxActive;
    }

    /**
     *　Get the "连接池初始化连接数"
     */
    public String getInitialSize() {
        return this.initialSize;
    }
    /**
     *　Set the "连接池初始化连接数"
     */
    public void setInitialSize(
            String initialSize) {
        this.initialSize = initialSize;
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

    /* (non-Javadoc)
     * @see java.lang.Comparable compareTo(Object})
     */
    @Override
    public int compareTo(
            EmDsCfgDto targetObj) {
        // default 0 no support sort
        return 0;
    }

    /**
     * Create bean instance copy with selected properties
     * 
     * @param selectProperties
     *            - properties which copy to new instance
     * @return
     */
    public EmDsCfgDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        EmDsCfgDto newInstance = new EmDsCfgDto();
        for (Property property : selectProperties) {
            String name = property.toString();
            Object value = BeanUtil.getBeanProperty(this, name);
            BeanUtil.setBeanProperty(newInstance, name, value);
        }
        return newInstance;
    }
    
    /**
     * Enumerate all SQL ID define in SQL-MAP
     */
    public static class SQLID {
        public static final String INSERT = "TBL.EM_DS_CFG_INSERT"; 
        public static final String UPDATE = "TBL.EM_DS_CFG_UPDATE"; 
        public static final String SMART_UPDATE = "TBL.EM_DS_CFG_SMART_UPDATE"; 
        public static final String DELETE = "TBL.EM_DS_CFG_DELETE"; 
        public static final String FIND = "TBL.EM_DS_CFG_FIND"; 
        public static final String FIND_FOR_UPDATE = "TBL.EM_DS_CFG_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "TBL.EM_DS_CFG_SEARCH"; 
        public static final String LIKE_SEARCH = "TBL.EM_DS_CFG_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "TBL.EM_DS_CFG_DYNA_SEARCH"; 
        public static final String COUNT = "TBL.EM_DS_CFG_COUNT";
    } 

    /**
     * Enumerate all bean properties
     */
    public static class Property {
        public static final String id = "id";
        public static final String name = "name";
        public static final String url = "url";
        public static final String driverClass = "driverClass";
        public static final String username = "username";
        public static final String password = "password";
        public static final String maxWait = "maxWait";
        public static final String minIdle = "minIdle";
        public static final String maxIdle = "maxIdle";
        public static final String maxActive = "maxActive";
        public static final String initialSize = "initialSize";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
        public static final String theSchema = "theSchema";
        public static final String theDivision = "theDivision";
        public static final String theOrderByCondition = "theOrderByCondition";
        public static final String theGroupByCondition = "theGroupByCondition";
        public static final String theSQLCondition = "theSQLCondition";
        public static final String theFetchSize = "theFetchSize";
        public static final String theFetchStart = "theFetchStart";   
    }
    
    /**
     * Enumerate all table column names which map to bean properties
     */
    public static class ColumnName {
        public static final String ID = "ID";
        public static final String NAME = "NAME";
        public static final String URL = "URL";
        public static final String DRIVER_CLASS = "DRIVER_CLASS";
        public static final String USERNAME = "USERNAME";
        public static final String PASSWORD = "PASSWORD";
        public static final String MAX_WAIT = "MAX_WAIT";
        public static final String MIN_IDLE = "MIN_IDLE";
        public static final String MAX_IDLE = "MAX_IDLE";
        public static final String MAX_ACTIVE = "MAX_ACTIVE";
        public static final String INITIAL_SIZE = "INITIAL_SIZE";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Enumerate table name
     */
    public static class TableName {
        public static final String EM_DS_CFG = "EM_DS_CFG";
    }

}
