
package com.ume.ems.entity;

import java.io.Serializable;
import com.dora.type.TableDesc;
import javax.persistence.Table;
import javax.persistence.Column;
import com.dora.validation.constraints.Size;
import com.dora.validation.constraints.ConstValue;
import javax.persistence.Entity;
import com.dora.type.ColumnDesc;
import com.dora.validation.constraints.TextFormat;
import com.dora.validation.constraints.Range;
import com.dora.bean.BeanUtil;
import com.dora.service.TableObject;

/**
 * Pojo mcom.umeing to table "EM数据类型测试表2.0"
 *
 * @author DORA.Generator
 */
@Entity
@Table(name="ZO_SAMPLE_002")
@TableDesc(label="EM数据类型测试表2.0")
public class ZoSample002Dto extends TableObject implements Serializable, Comparable<ZoSample002Dto> {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 文本字段1 
    */
    @Size(max=10)
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=1, type="AUTO-INCREMENT", label="文本字段1")
    @Column(name="TEST_COL_F01", nullable=true, length=10)
    private Long testColF01;

   /**
    * 文本字段2 
    */
    @Size(max=10)
    @TextFormat(TextFormat.Category.Ascii)
    @ColumnDesc(index=2, type="VARCHAR", label="文本字段2")
    @Column(name="TEST_COL_F02", nullable=true, length=10)
    private String testColF02;

   /**
    * 整数字段1 
    */
    @Size(max=3)
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=3, type="INT", label="整数字段1")
    @Column(name="TEST_COL_F03", nullable=true, length=3)
    private Integer testColF03;

   /**
    * 整数字段2 
    */
    @Range(min="16", max="65525")
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=4, type="INT", label="整数字段2")
    @Column(name="TEST_COL_F04", nullable=true)
    private Integer testColF04;

   /**
    * 日期字段 
    */
    @TextFormat(TextFormat.Category.Date)
    @ColumnDesc(index=5, type="DATE", label="日期字段")
    @Column(name="TEST_COL_F05", nullable=true)
    private java.sql.Date testColF05;

   /**
    * 时间字段 
    */
    @TextFormat(TextFormat.Category.Time)
    @ColumnDesc(index=6, type="TIME", label="时间字段")
    @Column(name="TEST_COL_F06", nullable=true)
    private java.sql.Time testColF06;

   /**
    * 时间戳字段 
    */
    @TextFormat(TextFormat.Category.Datetime)
    @ColumnDesc(index=7, type="TIMESTAMP", label="时间戳字段")
    @Column(name="TEST_COL_F07", nullable=true)
    private java.sql.Timestamp testColF07;

   /**
    * 大整数字段1 
    */
    @Size(max=50)
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=8, type="BIGINT", label="大整数字段1")
    @Column(name="TEST_COL_F08", nullable=true, length=50)
    private Long testColF08;

   /**
    * 大整数字段2 
    */
    @TextFormat(TextFormat.Category.Numeric)
    @ColumnDesc(index=9, type="BIGINT", label="大整数字段2")
    @Column(name="TEST_COL_F09", nullable=true)
    private Long testColF09;

   /**
    * 数值1 
    */
    @Size(max=10, precision=2)
    @ColumnDesc(index=10, type="DECIMAL", label="数值1")
    @Column(name="TEST_COL_F10", nullable=true, length=10, scale=10, precision=2)
    private java.math.BigDecimal testColF10;

   /**
    * 数值2 
    */
    @ColumnDesc(index=11, type="DECIMAL", label="数值2")
    @Column(name="TEST_COL_F11", nullable=true)
    private java.math.BigDecimal testColF11;

   /**
    * 定长字符1 
    */
    @Size(min=3, max=3)
    @ConstValue({"ABC","DEF"})
    @TextFormat(TextFormat.Category.ZipCode)
    @ColumnDesc(index=12, type="CHAR", label="定长字符1")
    @Column(name="TEST_COL_F12", nullable=true, length=3)
    private String testColF12;

   /**
    * 定长字符2 
    */
    @Size(min=3, max=3)
    @ConstValue({"DDD"})
    @ColumnDesc(index=13, type="CHAR", label="定长字符2")
    @Column(name="TEST_COL_F13", nullable=true, length=3)
    private String testColF13;

   /**
    * 长文本1 
    */
    @Size(max=128)
    @TextFormat(TextFormat.Category.MobileNumber)
    @ColumnDesc(index=14, type="TEXT", label="长文本1")
    @Column(name="TEST_COL_F14", nullable=true, length=128)
    private String testColF14;

   /**
    * 长文本2 
    */
    @Size(max=128)
    @TextFormat(TextFormat.Category.Email)
    @ColumnDesc(index=15, type="TEXT", label="长文本2")
    @Column(name="TEST_COL_F15", nullable=true, length=128)
    private String testColF15;

   /**
    * 二进制 
    */
    @ColumnDesc(index=16, type="BLOB", label="二进制")
    @Column(name="TEST_COL_F16", nullable=true)
    private java.sql.Blob testColF16;

   /**
    * 字符流 
    */
    @ColumnDesc(index=17, type="TEXT", label="字符流")
    @Column(name="TEST_COL_F17", nullable=true)
    private java.sql.Clob testColF17;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(17 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(17 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(17 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(17 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "文本字段1"
     */
    public Long getTestColF01() {
        return this.testColF01;
    }
    /**
     *　Set the "文本字段1"
     */
    public void setTestColF01(
            Long testColF01) {
        this.testColF01 = testColF01;
    }

    /**
     *　Get the "文本字段2"
     */
    public String getTestColF02() {
        return this.testColF02;
    }
    /**
     *　Set the "文本字段2"
     */
    public void setTestColF02(
            String testColF02) {
        this.testColF02 = testColF02;
    }

    /**
     *　Get the "整数字段1"
     */
    public Integer getTestColF03() {
        return this.testColF03;
    }
    /**
     *　Set the "整数字段1"
     */
    public void setTestColF03(
            Integer testColF03) {
        this.testColF03 = testColF03;
    }

    /**
     *　Get the "整数字段2"
     */
    public Integer getTestColF04() {
        return this.testColF04;
    }
    /**
     *　Set the "整数字段2"
     */
    public void setTestColF04(
            Integer testColF04) {
        this.testColF04 = testColF04;
    }

    /**
     *　Get the "日期字段"
     */
    public java.sql.Date getTestColF05() {
        return this.testColF05;
    }
    /**
     *　Set the "日期字段"
     */
    public void setTestColF05(
            java.sql.Date testColF05) {
        this.testColF05 = testColF05;
    }

    /**
     *　Get the "时间字段"
     */
    public java.sql.Time getTestColF06() {
        return this.testColF06;
    }
    /**
     *　Set the "时间字段"
     */
    public void setTestColF06(
            java.sql.Time testColF06) {
        this.testColF06 = testColF06;
    }

    /**
     *　Get the "时间戳字段"
     */
    public java.sql.Timestamp getTestColF07() {
        return this.testColF07;
    }
    /**
     *　Set the "时间戳字段"
     */
    public void setTestColF07(
            java.sql.Timestamp testColF07) {
        this.testColF07 = testColF07;
    }

    /**
     *　Get the "大整数字段1"
     */
    public Long getTestColF08() {
        return this.testColF08;
    }
    /**
     *　Set the "大整数字段1"
     */
    public void setTestColF08(
            Long testColF08) {
        this.testColF08 = testColF08;
    }

    /**
     *　Get the "大整数字段2"
     */
    public Long getTestColF09() {
        return this.testColF09;
    }
    /**
     *　Set the "大整数字段2"
     */
    public void setTestColF09(
            Long testColF09) {
        this.testColF09 = testColF09;
    }

    /**
     *　Get the "数值1"
     */
    public java.math.BigDecimal getTestColF10() {
        return this.testColF10;
    }
    /**
     *　Set the "数值1"
     */
    public void setTestColF10(
            java.math.BigDecimal testColF10) {
        this.testColF10 = testColF10;
    }

    /**
     *　Get the "数值2"
     */
    public java.math.BigDecimal getTestColF11() {
        return this.testColF11;
    }
    /**
     *　Set the "数值2"
     */
    public void setTestColF11(
            java.math.BigDecimal testColF11) {
        this.testColF11 = testColF11;
    }

    /**
     *　Get the "定长字符1"
     */
    public String getTestColF12() {
        return this.testColF12;
    }
    /**
     *　Set the "定长字符1"
     */
    public void setTestColF12(
            String testColF12) {
        this.testColF12 = testColF12;
    }

    /**
     *　Get the "定长字符2"
     */
    public String getTestColF13() {
        return this.testColF13;
    }
    /**
     *　Set the "定长字符2"
     */
    public void setTestColF13(
            String testColF13) {
        this.testColF13 = testColF13;
    }

    /**
     *　Get the "长文本1"
     */
    public String getTestColF14() {
        return this.testColF14;
    }
    /**
     *　Set the "长文本1"
     */
    public void setTestColF14(
            String testColF14) {
        this.testColF14 = testColF14;
    }

    /**
     *　Get the "长文本2"
     */
    public String getTestColF15() {
        return this.testColF15;
    }
    /**
     *　Set the "长文本2"
     */
    public void setTestColF15(
            String testColF15) {
        this.testColF15 = testColF15;
    }

    /**
     *　Get the "二进制"
     */
    public java.sql.Blob getTestColF16() {
        return this.testColF16;
    }
    /**
     *　Set the "二进制"
     */
    public void setTestColF16(
            java.sql.Blob testColF16) {
        this.testColF16 = testColF16;
    }

    /**
     *　Get the "字符流"
     */
    public java.sql.Clob getTestColF17() {
        return this.testColF17;
    }
    /**
     *　Set the "字符流"
     */
    public void setTestColF17(
            java.sql.Clob testColF17) {
        this.testColF17 = testColF17;
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
            ZoSample002Dto targetObj) {
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
    public ZoSample002Dto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        ZoSample002Dto newInstance = new ZoSample002Dto();
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
        public static final String INSERT = "TBL.ZO_SAMPLE_002_INSERT"; 
        public static final String UPDATE = "TBL.ZO_SAMPLE_002_UPDATE"; 
        public static final String SMART_UPDATE = "TBL.ZO_SAMPLE_002_SMART_UPDATE"; 
        public static final String DELETE = "TBL.ZO_SAMPLE_002_DELETE"; 
        public static final String FIND = "TBL.ZO_SAMPLE_002_FIND"; 
        public static final String FIND_FOR_UPDATE = "TBL.ZO_SAMPLE_002_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "TBL.ZO_SAMPLE_002_SEARCH"; 
        public static final String LIKE_SEARCH = "TBL.ZO_SAMPLE_002_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "TBL.ZO_SAMPLE_002_DYNA_SEARCH"; 
        public static final String COUNT = "TBL.ZO_SAMPLE_002_COUNT";
    } 

    /**
     * Enumerate all bean properties
     */
    public static class Property {
        public static final String testColF01 = "testColF01";
        public static final String testColF02 = "testColF02";
        public static final String testColF03 = "testColF03";
        public static final String testColF04 = "testColF04";
        public static final String testColF05 = "testColF05";
        public static final String testColF06 = "testColF06";
        public static final String testColF07 = "testColF07";
        public static final String testColF08 = "testColF08";
        public static final String testColF09 = "testColF09";
        public static final String testColF10 = "testColF10";
        public static final String testColF11 = "testColF11";
        public static final String testColF12 = "testColF12";
        public static final String testColF13 = "testColF13";
        public static final String testColF14 = "testColF14";
        public static final String testColF15 = "testColF15";
        public static final String testColF16 = "testColF16";
        public static final String testColF17 = "testColF17";
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
        public static final String TEST_COL_F01 = "TEST_COL_F01";
        public static final String TEST_COL_F02 = "TEST_COL_F02";
        public static final String TEST_COL_F03 = "TEST_COL_F03";
        public static final String TEST_COL_F04 = "TEST_COL_F04";
        public static final String TEST_COL_F05 = "TEST_COL_F05";
        public static final String TEST_COL_F06 = "TEST_COL_F06";
        public static final String TEST_COL_F07 = "TEST_COL_F07";
        public static final String TEST_COL_F08 = "TEST_COL_F08";
        public static final String TEST_COL_F09 = "TEST_COL_F09";
        public static final String TEST_COL_F10 = "TEST_COL_F10";
        public static final String TEST_COL_F11 = "TEST_COL_F11";
        public static final String TEST_COL_F12 = "TEST_COL_F12";
        public static final String TEST_COL_F13 = "TEST_COL_F13";
        public static final String TEST_COL_F14 = "TEST_COL_F14";
        public static final String TEST_COL_F15 = "TEST_COL_F15";
        public static final String TEST_COL_F16 = "TEST_COL_F16";
        public static final String TEST_COL_F17 = "TEST_COL_F17";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Enumerate table name
     */
    public static class TableName {
        public static final String ZO_SAMPLE_002 = "ZO_SAMPLE_002";
    }

}
