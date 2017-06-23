
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
import com.dora.bean.BeanUtil;
import com.dora.service.TableObject;

/**
 * Pojo mcom.umeing to table "EM资源管理表"
 *
 * @author DORA.Generator
 */
@Entity
@Table(name="EM_RESOURCE")
@TableDesc(label="EM资源管理表")
public class EmResourceDto extends TableObject implements Serializable, Comparable<EmResourceDto> {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 资源ID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="资源ID")
    @Column(name="RES_ID", nullable=false, length=32)
    private String resId;

   /**
    * 资源类型 
    * 0：系统运维
90：菜单 91：URL  92：SysId
    */
    @NotEmpty
    @Size(max=2)
    @Id
    @ColumnDesc(index=2, type="INT", label="资源类型")
    @Column(name="RES_TYPE", nullable=false, length=2)
    private Integer resType;

   /**
    * 资源名称 
    * 自定义名称
    */
    @Size(max=64)
    @ColumnDesc(index=3, type="VARCHAR", label="资源名称")
    @Column(name="RES_NAME", nullable=true, length=64)
    private String resName;

   /**
    * 资源分组 
    * 分组用名称
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="资源分组")
    @Column(name="RES_GROUP", nullable=true, length=64)
    private String resGroup;

   /**
    * 资源链接 
    * 需要参照外部资源时可使用
    */
    @Size(max=1024)
    @ColumnDesc(index=5, type="VARCHAR", label="资源链接")
    @Column(name="RES_LINK", nullable=true, length=1024)
    private String resLink;

   /**
    * 资源排序序号 
    * 排序用
    */
    @Size(max=8)
    @ColumnDesc(index=6, type="INT", label="资源排序序号")
    @Column(name="RES_INDEX", nullable=true, length=8)
    private Integer resIndex;

   /**
    * 资源状态 
    * 不可用:0
    */
    @Size(max=1)
    @ColumnDesc(index=7, type="INT", label="资源状态")
    @Column(name="RES_STATUS", nullable=true, length=1)
    private Integer resStatus;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(7 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(7 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(7 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(7 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "资源ID"
     */
    public String getResId() {
        return this.resId;
    }
    /**
     *　Set the "资源ID"
     */
    public void setResId(
            String resId) {
        this.resId = resId;
    }

    /**
     *　Get the "资源类型"
     */
    public Integer getResType() {
        return this.resType;
    }
    /**
     *　Set the "资源类型"
     */
    public void setResType(
            Integer resType) {
        this.resType = resType;
    }

    /**
     *　Get the "资源名称"
     */
    public String getResName() {
        return this.resName;
    }
    /**
     *　Set the "资源名称"
     */
    public void setResName(
            String resName) {
        this.resName = resName;
    }

    /**
     *　Get the "资源分组"
     */
    public String getResGroup() {
        return this.resGroup;
    }
    /**
     *　Set the "资源分组"
     */
    public void setResGroup(
            String resGroup) {
        this.resGroup = resGroup;
    }

    /**
     *　Get the "资源链接"
     */
    public String getResLink() {
        return this.resLink;
    }
    /**
     *　Set the "资源链接"
     */
    public void setResLink(
            String resLink) {
        this.resLink = resLink;
    }

    /**
     *　Get the "资源排序序号"
     */
    public Integer getResIndex() {
        return this.resIndex;
    }
    /**
     *　Set the "资源排序序号"
     */
    public void setResIndex(
            Integer resIndex) {
        this.resIndex = resIndex;
    }

    /**
     *　Get the "资源状态"
     */
    public Integer getResStatus() {
        return this.resStatus;
    }
    /**
     *　Set the "资源状态"
     */
    public void setResStatus(
            Integer resStatus) {
        this.resStatus = resStatus;
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
            EmResourceDto targetObj) {
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
    public EmResourceDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        EmResourceDto newInstance = new EmResourceDto();
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
        public static final String INSERT = "TBL.EM_RESOURCE_INSERT"; 
        public static final String UPDATE = "TBL.EM_RESOURCE_UPDATE"; 
        public static final String SMART_UPDATE = "TBL.EM_RESOURCE_SMART_UPDATE"; 
        public static final String DELETE = "TBL.EM_RESOURCE_DELETE"; 
        public static final String FIND = "TBL.EM_RESOURCE_FIND"; 
        public static final String FIND_FOR_UPDATE = "TBL.EM_RESOURCE_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "TBL.EM_RESOURCE_SEARCH"; 
        public static final String LIKE_SEARCH = "TBL.EM_RESOURCE_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "TBL.EM_RESOURCE_DYNA_SEARCH"; 
        public static final String COUNT = "TBL.EM_RESOURCE_COUNT";
    } 

    /**
     * Enumerate all bean properties
     */
    public static class Property {
        public static final String resId = "resId";
        public static final String resType = "resType";
        public static final String resName = "resName";
        public static final String resGroup = "resGroup";
        public static final String resLink = "resLink";
        public static final String resIndex = "resIndex";
        public static final String resStatus = "resStatus";
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
        public static final String RES_ID = "RES_ID";
        public static final String RES_TYPE = "RES_TYPE";
        public static final String RES_NAME = "RES_NAME";
        public static final String RES_GROUP = "RES_GROUP";
        public static final String RES_LINK = "RES_LINK";
        public static final String RES_INDEX = "RES_INDEX";
        public static final String RES_STATUS = "RES_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Enumerate table name
     */
    public static class TableName {
        public static final String EM_RESOURCE = "EM_RESOURCE";
    }

}
