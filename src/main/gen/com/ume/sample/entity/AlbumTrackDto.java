
package com.ume.sample.entity;

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
 * Pojo mcom.umeing to table "唱片曲目信息"
 *
 * @author DORA.Generator
 */
@Entity
@Table(name="ALBUM_TRACK")
@TableDesc(label="唱片曲目信息")
public class AlbumTrackDto extends TableObject implements Serializable, Comparable<AlbumTrackDto> {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 唱片编号 
    */
    @NotEmpty
    @Size(max=8)
    @Id
    @ColumnDesc(index=1, type="BIGINT", label="唱片编号")
    @Column(name="ALBUM_CODE", nullable=false, length=8)
    private Long albumCode;

   /**
    * 曲目顺序 
    */
    @NotEmpty
    @Id
    @ColumnDesc(index=2, type="INT", label="曲目顺序")
    @Column(name="TRACK_NO", nullable=false)
    private Integer trackNo;

   /**
    * 歌名 
    */
    @NotEmpty
    @Size(max=128)
    @ColumnDesc(index=3, type="VARCHAR", label="歌名")
    @Column(name="TRACK_NAME", nullable=false, length=128)
    private String trackName;

   /**
    * 备注 
    */
    @Size(max=128)
    @ColumnDesc(index=4, type="VARCHAR", label="备注")
    @Column(name="REMARK", nullable=true, length=128)
    private String remark;

   /**
    * Create Author (default setting while insert)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(4 + 1), type="VARCHAR", label="Create Auther")
    @Column(name="CREATE_AUTHER", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(4 + 2), type="TIMESTAMP", label="Create Datetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @Size(min=32, max=32)
    @ColumnDesc(index=(4 + 3), type="VARCHAR", label="Update Auther")
    @Column(name="UPDATE_AUTHER", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(4 + 4), type="TIMESTAMP", label="Update Datetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "唱片编号"
     */
    public Long getAlbumCode() {
        return this.albumCode;
    }
    /**
     *　Set the "唱片编号"
     */
    public void setAlbumCode(
            Long albumCode) {
        this.albumCode = albumCode;
    }

    /**
     *　Get the "曲目顺序"
     */
    public Integer getTrackNo() {
        return this.trackNo;
    }
    /**
     *　Set the "曲目顺序"
     */
    public void setTrackNo(
            Integer trackNo) {
        this.trackNo = trackNo;
    }

    /**
     *　Get the "歌名"
     */
    public String getTrackName() {
        return this.trackName;
    }
    /**
     *　Set the "歌名"
     */
    public void setTrackName(
            String trackName) {
        this.trackName = trackName;
    }

    /**
     *　Get the "备注"
     */
    public String getRemark() {
        return this.remark;
    }
    /**
     *　Set the "备注"
     */
    public void setRemark(
            String remark) {
        this.remark = remark;
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
            AlbumTrackDto targetObj) {
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
    public AlbumTrackDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        AlbumTrackDto newInstance = new AlbumTrackDto();
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
        public static final String INSERT = "TBL.ALBUM_TRACK_INSERT"; 
        public static final String UPDATE = "TBL.ALBUM_TRACK_UPDATE"; 
        public static final String SMART_UPDATE = "TBL.ALBUM_TRACK_SMART_UPDATE"; 
        public static final String DELETE = "TBL.ALBUM_TRACK_DELETE"; 
        public static final String FIND = "TBL.ALBUM_TRACK_FIND"; 
        public static final String FIND_FOR_UPDATE = "TBL.ALBUM_TRACK_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "TBL.ALBUM_TRACK_SEARCH"; 
        public static final String LIKE_SEARCH = "TBL.ALBUM_TRACK_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "TBL.ALBUM_TRACK_DYNA_SEARCH"; 
        public static final String COUNT = "TBL.ALBUM_TRACK_COUNT";
    } 

    /**
     * Enumerate all bean properties
     */
    public static class Property {
        public static final String albumCode = "albumCode";
        public static final String trackNo = "trackNo";
        public static final String trackName = "trackName";
        public static final String remark = "remark";
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
        public static final String ALBUM_CODE = "ALBUM_CODE";
        public static final String TRACK_NO = "TRACK_NO";
        public static final String TRACK_NAME = "TRACK_NAME";
        public static final String REMARK = "REMARK";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Enumerate table name
     */
    public static class TableName {
        public static final String ALBUM_TRACK = "ALBUM_TRACK";
    }

}
