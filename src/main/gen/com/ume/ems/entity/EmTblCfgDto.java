
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
 * Pojo mcom.umeing to table "EM实体展示配置表"
 *
 * @author DORA.Generator
 */
@Entity
@Table(name="EM_TBL_CFG")
@TableDesc(label="EM实体展示配置表")
public class EmTblCfgDto extends TableObject implements Serializable, Comparable<EmTblCfgDto> {
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
    @Column(name="ENT_ID", nullable=false, length=32)
    private String entId;

   /**
    * 实体名称 
    */
    @Size(max=64)
    @ColumnDesc(index=2, type="VARCHAR", label="实体名称")
    @Column(name="ENT_NAME", nullable=true, length=64)
    private String entName;

   /**
    * 实体类别 
    * 0:TABLE
    */
    @Size(max=2)
    @ColumnDesc(index=3, type="INT", label="实体类别")
    @Column(name="ENT_TYPE", nullable=true, length=2)
    private Integer entType;

   /**
    * 实体布局模版 
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="实体布局模版")
    @Column(name="ENT_LAYOUT", nullable=true, length=64)
    private String entLayout;

   /**
    * 实体参照表名 
    */
    @Size(max=32)
    @TextFormat(TextFormat.Category.AlphaNumeric)
    @ColumnDesc(index=5, type="VARCHAR", label="实体参照表名")
    @Column(name="REF_TBL_ID", nullable=true, length=32)
    private String refTblId;

   /**
    * 实体参照表数据源 
    */
    @Size(max=32)
    @TextFormat(TextFormat.Category.AlphaNumeric)
    @ColumnDesc(index=6, type="VARCHAR", label="实体参照表数据源")
    @Column(name="REF_TBL_DATASOURCE", nullable=true, length=32)
    private String refTblDatasource;

   /**
    * 参照表的只读属性值 
    */
    @Size(max=256)
    @ColumnDesc(index=7, type="VARCHAR", label="参照表的只读属性值")
    @Column(name="REF_TBL_READONLY_COLS", nullable=true, length=256)
    private String refTblReadonlyCols;

   /**
    * 实体参照表的隐藏属性集 
    */
    @Size(max=256)
    @ColumnDesc(index=8, type="VARCHAR", label="实体参照表的隐藏属性集")
    @Column(name="REF_TBL_HIDE_COLS", nullable=true, length=256)
    private String refTblHideCols;

   /**
    * 实体参照表的不可用属性集 
    */
    @Size(max=256)
    @ColumnDesc(index=9, type="VARCHAR", label="实体参照表的不可用属性集")
    @Column(name="REF_TBL_DISABLE_COLS", nullable=true, length=256)
    private String refTblDisableCols;

   /**
    * 实体自定义显示前处理的ID 
    * 实现PreHandler的类，由dataConvertor.properties定义
    */
    @Size(max=128)
    @ColumnDesc(index=10, type="VARCHAR", label="实体自定义显示前处理的ID")
    @Column(name="PRE_PROC_DISP", nullable=true, length=128)
    private String preProcDisp;

   /**
    * 实体自定义保存前处理的ID 
    * 实现PreHandler的类，由dataConvertor.properties定义
    */
    @Size(max=128)
    @ColumnDesc(index=11, type="VARCHAR", label="实体自定义保存前处理的ID")
    @Column(name="PRE_PROC_SAVE", nullable=true, length=128)
    private String preProcSave;

   /**
    * 实体自定义验证器的ID 
    * 实现PreHandler的类，由dataValidator.properties定义
    */
    @Size(max=128)
    @ColumnDesc(index=12, type="VARCHAR", label="实体自定义验证器的ID")
    @Column(name="PRE_PROC_VALIDATE", nullable=true, length=128)
    private String preProcValidate;

   /**
    * 实体自定义EntityManager的ID 
    * 自定义EntityManager的Bean ID，由AppContext定义
    */
    @Size(max=128)
    @ColumnDesc(index=13, type="VARCHAR", label="实体自定义EntityManager的ID")
    @Column(name="CUS_ENTITY_MANAGER", nullable=true, length=128)
    private String cusEntityManager;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(13 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(13 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(13 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(13 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "实体ID"
     */
    public String getEntId() {
        return this.entId;
    }
    /**
     *　Set the "实体ID"
     */
    public void setEntId(
            String entId) {
        this.entId = entId;
    }

    /**
     *　Get the "实体名称"
     */
    public String getEntName() {
        return this.entName;
    }
    /**
     *　Set the "实体名称"
     */
    public void setEntName(
            String entName) {
        this.entName = entName;
    }

    /**
     *　Get the "实体类别"
     */
    public Integer getEntType() {
        return this.entType;
    }
    /**
     *　Set the "实体类别"
     */
    public void setEntType(
            Integer entType) {
        this.entType = entType;
    }

    /**
     *　Get the "实体布局模版"
     */
    public String getEntLayout() {
        return this.entLayout;
    }
    /**
     *　Set the "实体布局模版"
     */
    public void setEntLayout(
            String entLayout) {
        this.entLayout = entLayout;
    }

    /**
     *　Get the "实体参照表名"
     */
    public String getRefTblId() {
        return this.refTblId;
    }
    /**
     *　Set the "实体参照表名"
     */
    public void setRefTblId(
            String refTblId) {
        this.refTblId = refTblId;
    }

    /**
     *　Get the "实体参照表数据源"
     */
    public String getRefTblDatasource() {
        return this.refTblDatasource;
    }
    /**
     *　Set the "实体参照表数据源"
     */
    public void setRefTblDatasource(
            String refTblDatasource) {
        this.refTblDatasource = refTblDatasource;
    }

    /**
     *　Get the "参照表的只读属性值"
     */
    public String getRefTblReadonlyCols() {
        return this.refTblReadonlyCols;
    }
    /**
     *　Set the "参照表的只读属性值"
     */
    public void setRefTblReadonlyCols(
            String refTblReadonlyCols) {
        this.refTblReadonlyCols = refTblReadonlyCols;
    }

    /**
     *　Get the "实体参照表的隐藏属性集"
     */
    public String getRefTblHideCols() {
        return this.refTblHideCols;
    }
    /**
     *　Set the "实体参照表的隐藏属性集"
     */
    public void setRefTblHideCols(
            String refTblHideCols) {
        this.refTblHideCols = refTblHideCols;
    }

    /**
     *　Get the "实体参照表的不可用属性集"
     */
    public String getRefTblDisableCols() {
        return this.refTblDisableCols;
    }
    /**
     *　Set the "实体参照表的不可用属性集"
     */
    public void setRefTblDisableCols(
            String refTblDisableCols) {
        this.refTblDisableCols = refTblDisableCols;
    }

    /**
     *　Get the "实体自定义显示前处理的ID"
     */
    public String getPreProcDisp() {
        return this.preProcDisp;
    }
    /**
     *　Set the "实体自定义显示前处理的ID"
     */
    public void setPreProcDisp(
            String preProcDisp) {
        this.preProcDisp = preProcDisp;
    }

    /**
     *　Get the "实体自定义保存前处理的ID"
     */
    public String getPreProcSave() {
        return this.preProcSave;
    }
    /**
     *　Set the "实体自定义保存前处理的ID"
     */
    public void setPreProcSave(
            String preProcSave) {
        this.preProcSave = preProcSave;
    }

    /**
     *　Get the "实体自定义验证器的ID"
     */
    public String getPreProcValidate() {
        return this.preProcValidate;
    }
    /**
     *　Set the "实体自定义验证器的ID"
     */
    public void setPreProcValidate(
            String preProcValidate) {
        this.preProcValidate = preProcValidate;
    }

    /**
     *　Get the "实体自定义EntityManager的ID"
     */
    public String getCusEntityManager() {
        return this.cusEntityManager;
    }
    /**
     *　Set the "实体自定义EntityManager的ID"
     */
    public void setCusEntityManager(
            String cusEntityManager) {
        this.cusEntityManager = cusEntityManager;
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
            EmTblCfgDto targetObj) {
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
    public EmTblCfgDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        EmTblCfgDto newInstance = new EmTblCfgDto();
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
        public static final String INSERT = "TBL.EM_TBL_CFG_INSERT"; 
        public static final String UPDATE = "TBL.EM_TBL_CFG_UPDATE"; 
        public static final String SMART_UPDATE = "TBL.EM_TBL_CFG_SMART_UPDATE"; 
        public static final String DELETE = "TBL.EM_TBL_CFG_DELETE"; 
        public static final String FIND = "TBL.EM_TBL_CFG_FIND"; 
        public static final String FIND_FOR_UPDATE = "TBL.EM_TBL_CFG_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "TBL.EM_TBL_CFG_SEARCH"; 
        public static final String LIKE_SEARCH = "TBL.EM_TBL_CFG_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "TBL.EM_TBL_CFG_DYNA_SEARCH"; 
        public static final String COUNT = "TBL.EM_TBL_CFG_COUNT";
    } 

    /**
     * Enumerate all bean properties
     */
    public static class Property {
        public static final String entId = "entId";
        public static final String entName = "entName";
        public static final String entType = "entType";
        public static final String entLayout = "entLayout";
        public static final String refTblId = "refTblId";
        public static final String refTblDatasource = "refTblDatasource";
        public static final String refTblReadonlyCols = "refTblReadonlyCols";
        public static final String refTblHideCols = "refTblHideCols";
        public static final String refTblDisableCols = "refTblDisableCols";
        public static final String preProcDisp = "preProcDisp";
        public static final String preProcSave = "preProcSave";
        public static final String preProcValidate = "preProcValidate";
        public static final String cusEntityManager = "cusEntityManager";
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
        public static final String ENT_ID = "ENT_ID";
        public static final String ENT_NAME = "ENT_NAME";
        public static final String ENT_TYPE = "ENT_TYPE";
        public static final String ENT_LAYOUT = "ENT_LAYOUT";
        public static final String REF_TBL_ID = "REF_TBL_ID";
        public static final String REF_TBL_DATASOURCE = "REF_TBL_DATASOURCE";
        public static final String REF_TBL_READONLY_COLS = "REF_TBL_READONLY_COLS";
        public static final String REF_TBL_HIDE_COLS = "REF_TBL_HIDE_COLS";
        public static final String REF_TBL_DISABLE_COLS = "REF_TBL_DISABLE_COLS";
        public static final String PRE_PROC_DISP = "PRE_PROC_DISP";
        public static final String PRE_PROC_SAVE = "PRE_PROC_SAVE";
        public static final String PRE_PROC_VALIDATE = "PRE_PROC_VALIDATE";
        public static final String CUS_ENTITY_MANAGER = "CUS_ENTITY_MANAGER";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Enumerate table name
     */
    public static class TableName {
        public static final String EM_TBL_CFG = "EM_TBL_CFG";
    }

}
