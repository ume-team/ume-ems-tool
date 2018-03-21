
package org.umeframework.ems.test.entity;

import java.io.Serializable;
import org.umeframework.dora.validation.constraints.Range;
import org.umeframework.dora.validation.constraints.Size;
import org.umeframework.dora.type.ColumnDesc;
import org.umeframework.dora.validation.constraints.TextFormat;
import org.umeframework.dora.validation.constraints.ConstValue;
import org.umeframework.dora.validation.constraints.NotEmpty;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import org.umeframework.dora.type.TableDesc;
import javax.persistence.Id;
import org.umeframework.dora.bean.BeanUtil;
import org.umeframework.dora.service.TableEntity;

/**
 * Entity class map to table "数据类型测试·DEMO表"
 *
 * @author ume-team
 */
@Entity
@Table(name="ZOO_DATATYPE_DEMO")
@TableDesc(label="数据类型测试·DEMO表")
public class ZooDatatypeDemoDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 文本字段1 
    */
    @NotEmpty
    @Size(max=10)
    @Id
    @TextFormat(TextFormat.Category.AsciiNoneSpace)
    @ColumnDesc(index=1, type="VARCHAR", label="文本字段1")
    @Column(name="textValuePrimaryKey", nullable=false, length=10)
    private String textvalueprimarykey;

   /**
    * 文本字段2 
    */
    @NotEmpty
    @Size(max=10)
    @Id
    @TextFormat(TextFormat.Category.Ascii)
    @ColumnDesc(index=2, type="VARCHAR", label="文本字段2")
    @Column(name="textValueVarLength", nullable=false, length=10)
    private String textvaluevarlength;

   /**
    * 整数字段1 
    */
    @Size(max=3)
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=3, type="INT", label="整数字段1")
    @Column(name="IntValue", nullable=true, length=3)
    private Integer intvalue;

   /**
    * 整数字段2 
    */
    @Range(min="16", max="65525")
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=4, type="INT", label="整数字段2")
    @Column(name="IntValueWithDefault", nullable=true)
    private Integer intvaluewithdefault;

   /**
    * 日期字段 
    */
    @TextFormat(TextFormat.Category.Date)
    @ColumnDesc(index=5, type="DATE", label="日期字段")
    @Column(name="DateValue", nullable=true)
    private java.sql.Date datevalue;

   /**
    * 时间字段 
    */
    @TextFormat(TextFormat.Category.Time)
    @ColumnDesc(index=6, type="TIME", label="时间字段")
    @Column(name="TimeValue", nullable=true)
    private java.sql.Time timevalue;

   /**
    * 时间戳字段 
    */
    @TextFormat(TextFormat.Category.Datetime)
    @ColumnDesc(index=7, type="TIMESTAMP", label="时间戳字段")
    @Column(name="TimestampValue", nullable=true)
    private java.sql.Timestamp timestampvalue;

   /**
    * 大整数字段1 
    */
    @Size(max=50)
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=8, type="BIGINT", label="大整数字段1")
    @Column(name="BigIntValueWithLength", nullable=true, length=50)
    private java.math.BigInteger bigintvaluewithlength;

   /**
    * 大整数字段2 
    */
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=9, type="BIGINT", label="大整数字段2")
    @Column(name="BigIntValue", nullable=true)
    private java.math.BigInteger bigintvalue;

   /**
    * 数值1 
    */
    @ColumnDesc(index=10, type="DECIMAL", label="数值1")
    @Column(name="decimalValue", nullable=true)
    private Double decimalvalue;

   /**
    * 数值2 
    */
    @Size(max=10, precision=2)
    @ColumnDesc(index=11, type="DECIMAL", label="数值2")
    @Column(name="DecimalValueWithLength", nullable=true, length=10, scale=10, precision=2)
    private Double decimalvaluewithlength;

   /**
    * 定长字符1 
    */
    @Size(min=3, max=3)
    @ConstValue({"ABC","DEF"})
    @TextFormat(TextFormat.Category.ZipCode)
    @ColumnDesc(index=12, type="CHAR", label="定长字符1")
    @Column(name="TextFixedValue", nullable=true, length=3)
    private String textfixedvalue;

   /**
    * 长文本1 
    */
    @Size(max=128)
    @TextFormat(TextFormat.Category.MobileNumber)
    @ColumnDesc(index=13, type="TEXT", label="长文本1")
    @Column(name="LongTextValue", nullable=true, length=128)
    private String longtextvalue;

   /**
    * 二进制 
    */
    @ColumnDesc(index=14, type="BLOB", label="二进制")
    @Column(name="blobObj", nullable=true)
    private java.sql.Blob blobobj;

   /**
    * 字符流 
    */
    @ColumnDesc(index=15, type="TEXT", label="字符流")
    @Column(name="clobObj", nullable=true)
    private java.sql.Clob clobobj;

   /**
    * 自增长序列 
    */
    @ColumnDesc(index=16, type="AUTO-INCREMENT", label="自增长序列")
    @Column(name="AutoGenSequence", nullable=true)
    private Long autogensequence;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(16 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(16 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(16 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(16 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "文本字段1"
     */
    public String getTextvalueprimarykey() {
        return this.textvalueprimarykey;
    }
    /**
     *　Set the "文本字段1"
     */
    public void setTextvalueprimarykey(
            String textvalueprimarykey) {
        this.textvalueprimarykey = textvalueprimarykey;
    }

    /**
     *　Get the "文本字段2"
     */
    public String getTextvaluevarlength() {
        return this.textvaluevarlength;
    }
    /**
     *　Set the "文本字段2"
     */
    public void setTextvaluevarlength(
            String textvaluevarlength) {
        this.textvaluevarlength = textvaluevarlength;
    }

    /**
     *　Get the "整数字段1"
     */
    public Integer getIntvalue() {
        return this.intvalue;
    }
    /**
     *　Set the "整数字段1"
     */
    public void setIntvalue(
            Integer intvalue) {
        this.intvalue = intvalue;
    }

    /**
     *　Get the "整数字段2"
     */
    public Integer getIntvaluewithdefault() {
        return this.intvaluewithdefault;
    }
    /**
     *　Set the "整数字段2"
     */
    public void setIntvaluewithdefault(
            Integer intvaluewithdefault) {
        this.intvaluewithdefault = intvaluewithdefault;
    }

    /**
     *　Get the "日期字段"
     */
    public java.sql.Date getDatevalue() {
        return this.datevalue;
    }
    /**
     *　Set the "日期字段"
     */
    public void setDatevalue(
            java.sql.Date datevalue) {
        this.datevalue = datevalue;
    }

    /**
     *　Get the "时间字段"
     */
    public java.sql.Time getTimevalue() {
        return this.timevalue;
    }
    /**
     *　Set the "时间字段"
     */
    public void setTimevalue(
            java.sql.Time timevalue) {
        this.timevalue = timevalue;
    }

    /**
     *　Get the "时间戳字段"
     */
    public java.sql.Timestamp getTimestampvalue() {
        return this.timestampvalue;
    }
    /**
     *　Set the "时间戳字段"
     */
    public void setTimestampvalue(
            java.sql.Timestamp timestampvalue) {
        this.timestampvalue = timestampvalue;
    }

    /**
     *　Get the "大整数字段1"
     */
    public java.math.BigInteger getBigintvaluewithlength() {
        return this.bigintvaluewithlength;
    }
    /**
     *　Set the "大整数字段1"
     */
    public void setBigintvaluewithlength(
            java.math.BigInteger bigintvaluewithlength) {
        this.bigintvaluewithlength = bigintvaluewithlength;
    }

    /**
     *　Get the "大整数字段2"
     */
    public java.math.BigInteger getBigintvalue() {
        return this.bigintvalue;
    }
    /**
     *　Set the "大整数字段2"
     */
    public void setBigintvalue(
            java.math.BigInteger bigintvalue) {
        this.bigintvalue = bigintvalue;
    }

    /**
     *　Get the "数值1"
     */
    public Double getDecimalvalue() {
        return this.decimalvalue;
    }
    /**
     *　Set the "数值1"
     */
    public void setDecimalvalue(
            Double decimalvalue) {
        this.decimalvalue = decimalvalue;
    }

    /**
     *　Get the "数值2"
     */
    public Double getDecimalvaluewithlength() {
        return this.decimalvaluewithlength;
    }
    /**
     *　Set the "数值2"
     */
    public void setDecimalvaluewithlength(
            Double decimalvaluewithlength) {
        this.decimalvaluewithlength = decimalvaluewithlength;
    }

    /**
     *　Get the "定长字符1"
     */
    public String getTextfixedvalue() {
        return this.textfixedvalue;
    }
    /**
     *　Set the "定长字符1"
     */
    public void setTextfixedvalue(
            String textfixedvalue) {
        this.textfixedvalue = textfixedvalue;
    }

    /**
     *　Get the "长文本1"
     */
    public String getLongtextvalue() {
        return this.longtextvalue;
    }
    /**
     *　Set the "长文本1"
     */
    public void setLongtextvalue(
            String longtextvalue) {
        this.longtextvalue = longtextvalue;
    }

    /**
     *　Get the "二进制"
     */
    public java.sql.Blob getBlobobj() {
        return this.blobobj;
    }
    /**
     *　Set the "二进制"
     */
    public void setBlobobj(
            java.sql.Blob blobobj) {
        this.blobobj = blobobj;
    }

    /**
     *　Get the "字符流"
     */
    public java.sql.Clob getClobobj() {
        return this.clobobj;
    }
    /**
     *　Set the "字符流"
     */
    public void setClobobj(
            java.sql.Clob clobobj) {
        this.clobobj = clobobj;
    }

    /**
     *　Get the "自增长序列"
     */
    public Long getAutogensequence() {
        return this.autogensequence;
    }
    /**
     *　Set the "自增长序列"
     */
    public void setAutogensequence(
            Long autogensequence) {
        this.autogensequence = autogensequence;
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
    public ZooDatatypeDemoDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ZooDatatypeDemoDto newInstance = new ZooDatatypeDemoDto();
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
        public static final String INSERT = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_INSERT"; 
        public static final String UPDATE = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_UPDATE"; 
        public static final String SMART_UPDATE = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_SMART_UPDATE"; 
        public static final String DELETE = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_DELETE"; 
        public static final String DELETE_ALL = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_DELETE_ALL"; 
        public static final String FIND = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_FIND"; 
        public static final String FIND_FOR_UPDATE = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_FIND_FOR_UPDATE"; 
        public static final String FIND_LIST = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_FIND_LIST"; 
        public static final String FIND_LIST_LIKE = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_FIND_LIST_LIKE"; 
        public static final String FIND_LIST_MATCH = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_FIND_LIST_MATCH"; 
        public static final String COUNT = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_COUNT";
        public static final String INSERT_HISTORY_C = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_HT_INSERT_C"; 
        public static final String INSERT_HISTORY_U = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_HT_INSERT_U"; 
        public static final String INSERT_HISTORY_D = "org.umeframework.ems.test.entity.ZOO_DATATYPE_DEMO_HT_INSERT_D"; 
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String textvalueprimarykey = "textvalueprimarykey";
        public static final String textvaluevarlength = "textvaluevarlength";
        public static final String intvalue = "intvalue";
        public static final String intvaluewithdefault = "intvaluewithdefault";
        public static final String datevalue = "datevalue";
        public static final String timevalue = "timevalue";
        public static final String timestampvalue = "timestampvalue";
        public static final String bigintvaluewithlength = "bigintvaluewithlength";
        public static final String bigintvalue = "bigintvalue";
        public static final String decimalvalue = "decimalvalue";
        public static final String decimalvaluewithlength = "decimalvaluewithlength";
        public static final String textfixedvalue = "textfixedvalue";
        public static final String longtextvalue = "longtextvalue";
        public static final String blobobj = "blobobj";
        public static final String clobobj = "clobobj";
        public static final String autogensequence = "autogensequence";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String textValuePrimaryKey = "textValuePrimaryKey";
        public static final String textValueVarLength = "textValueVarLength";
        public static final String IntValue = "IntValue";
        public static final String IntValueWithDefault = "IntValueWithDefault";
        public static final String DateValue = "DateValue";
        public static final String TimeValue = "TimeValue";
        public static final String TimestampValue = "TimestampValue";
        public static final String BigIntValueWithLength = "BigIntValueWithLength";
        public static final String BigIntValue = "BigIntValue";
        public static final String decimalValue = "decimalValue";
        public static final String DecimalValueWithLength = "DecimalValueWithLength";
        public static final String TextFixedValue = "TextFixedValue";
        public static final String LongTextValue = "LongTextValue";
        public static final String blobObj = "blobObj";
        public static final String clobObj = "clobObj";
        public static final String AutoGenSequence = "AutoGenSequence";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "ZOO_DATATYPE_DEMO";

}
