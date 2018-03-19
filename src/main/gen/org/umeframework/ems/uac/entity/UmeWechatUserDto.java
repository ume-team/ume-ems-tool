
package org.umeframework.ems.uac.entity;

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
 * Entity class map to table "微信用户属性表"
 *
 * @author ume-team
 */
@Entity
@Table(name="UME_WECHAT_USER")
@TableDesc(label="微信用户属性表")
public class UmeWechatUserDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * 用户识别ID 
    */
    @NotEmpty
    @Size(max=32)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="用户识别ID")
    @Column(name="USER_ID", nullable=false, length=32)
    private String userId;

   /**
    * 微信用户openid 
    */
    @NotEmpty
    @Size(max=32)
    @ColumnDesc(index=2, type="VARCHAR", label="微信用户openid")
    @Column(name="WECHAT_OPENID", nullable=false, length=32)
    private String wechatOpenid;

   /**
    * 微信用户所属城市 
    */
    @Size(max=64)
    @ColumnDesc(index=3, type="VARCHAR", label="微信用户所属城市")
    @Column(name="WECHAT_CITY", nullable=true, length=64)
    private String wechatCity;

   /**
    * 微信用户所属国家 
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="微信用户所属国家")
    @Column(name="WECHAT_COUNTRY", nullable=true, length=64)
    private String wechatCountry;

   /**
    * 微信用户头像 
    */
    @Size(max=512)
    @ColumnDesc(index=5, type="VARCHAR", label="微信用户头像")
    @Column(name="WECHAT_HEADIMGURL", nullable=true, length=512)
    private String wechatHeadimgurl;

   /**
    * 微信用户语言配置 
    */
    @Size(max=64)
    @ColumnDesc(index=6, type="VARCHAR", label="微信用户语言配置")
    @Column(name="WECHAT_LANGUAGE", nullable=true, length=64)
    private String wechatLanguage;

   /**
    * 微信用户昵称 
    */
    @NotEmpty
    @Size(max=1024)
    @ColumnDesc(index=7, type="VARCHAR", label="微信用户昵称")
    @Column(name="WECHAT_NICKNAME", nullable=false, length=1024)
    private String wechatNickname;

   /**
    * 微信用户省份 
    */
    @Size(max=64)
    @ColumnDesc(index=8, type="VARCHAR", label="微信用户省份")
    @Column(name="WECHAT_PROVINCE", nullable=true, length=64)
    private String wechatProvince;

   /**
    * 微信用户性别 
    */
    @Size(max=8)
    @ColumnDesc(index=9, type="VARCHAR", label="微信用户性别")
    @Column(name="WECHAT_SEX", nullable=true, length=8)
    private String wechatSex;

   /**
    * 微信用户unionid 
    */
    @Size(max=64)
    @ColumnDesc(index=10, type="VARCHAR", label="微信用户unionid")
    @Column(name="WECHAT_UNIONID", nullable=true, length=64)
    private String wechatUnionid;

   /**
    * 微信用户权限 
    */
    @Size(max=20)
    @ColumnDesc(index=11, type="VARCHAR", label="微信用户权限")
    @Column(name="WECHAT_PRIVILEGE", nullable=true, length=20)
    private String wechatPrivilege;

   /**
    * 微信用户组id 
    */
    @ColumnDesc(index=12, type="INT", label="微信用户组id")
    @Column(name="WECHAT_GROUPID", nullable=true)
    private Integer wechatGroupid;

   /**
    * 微信用户标签列表 
    */
    @Size(max=512)
    @ColumnDesc(index=13, type="VARCHAR", label="微信用户标签列表")
    @Column(name="WECHAT_TAGID_LIST", nullable=true, length=512)
    private String wechatTagidList;

   /**
    * 微信用户订阅信息 
    */
    @ColumnDesc(index=14, type="INT", label="微信用户订阅信息")
    @Column(name="WECHAT_SUBSCRIBE", nullable=true)
    private Integer wechatSubscribe;

   /**
    * 微信用户订阅时间 
    */
    @ColumnDesc(index=15, type="TIMESTAMP", label="微信用户订阅时间")
    @Column(name="WECHAT_SUBSCRIBE_TIME", nullable=true)
    private java.sql.Timestamp wechatSubscribeTime;

   /**
    * Create Author (default setting while insert)
    */
    @ColumnDesc(index=(15 + 1), type="VARCHAR", label="createAuthor")
    @Column(name="CREATE_AUTHOR", nullable=true, length=32)
    private String createAuthor;
   /**
    * Create Datetime (default setting while insert)
    */
    @ColumnDesc(index=(15 + 2), type="TIMESTAMP", label="createDatetime")
    @Column(name="CREATE_DATETIME", nullable=true)
    private java.sql.Timestamp createDatetime;
   /**
    * Update Author (refresh on each update)
    */
    @ColumnDesc(index=(15 + 3), type="VARCHAR", label="updateAuthor")
    @Column(name="UPDATE_AUTHOR", nullable=true, length=32)
    private String updateAuthor;
   /**
    * Update Datetime (refresh on each update)
    */
    @ColumnDesc(index=(15 + 4), type="TIMESTAMP", label="updateDatetime")
    @Column(name="UPDATE_DATETIME", nullable=true)
    private java.sql.Timestamp updateDatetime;

    /**
     *　Get the "用户识别ID"
     */
    public String getUserId() {
        return this.userId;
    }
    /**
     *　Set the "用户识别ID"
     */
    public void setUserId(
            String userId) {
        this.userId = userId;
    }

    /**
     *　Get the "微信用户openid"
     */
    public String getWechatOpenid() {
        return this.wechatOpenid;
    }
    /**
     *　Set the "微信用户openid"
     */
    public void setWechatOpenid(
            String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    /**
     *　Get the "微信用户所属城市"
     */
    public String getWechatCity() {
        return this.wechatCity;
    }
    /**
     *　Set the "微信用户所属城市"
     */
    public void setWechatCity(
            String wechatCity) {
        this.wechatCity = wechatCity;
    }

    /**
     *　Get the "微信用户所属国家"
     */
    public String getWechatCountry() {
        return this.wechatCountry;
    }
    /**
     *　Set the "微信用户所属国家"
     */
    public void setWechatCountry(
            String wechatCountry) {
        this.wechatCountry = wechatCountry;
    }

    /**
     *　Get the "微信用户头像"
     */
    public String getWechatHeadimgurl() {
        return this.wechatHeadimgurl;
    }
    /**
     *　Set the "微信用户头像"
     */
    public void setWechatHeadimgurl(
            String wechatHeadimgurl) {
        this.wechatHeadimgurl = wechatHeadimgurl;
    }

    /**
     *　Get the "微信用户语言配置"
     */
    public String getWechatLanguage() {
        return this.wechatLanguage;
    }
    /**
     *　Set the "微信用户语言配置"
     */
    public void setWechatLanguage(
            String wechatLanguage) {
        this.wechatLanguage = wechatLanguage;
    }

    /**
     *　Get the "微信用户昵称"
     */
    public String getWechatNickname() {
        return this.wechatNickname;
    }
    /**
     *　Set the "微信用户昵称"
     */
    public void setWechatNickname(
            String wechatNickname) {
        this.wechatNickname = wechatNickname;
    }

    /**
     *　Get the "微信用户省份"
     */
    public String getWechatProvince() {
        return this.wechatProvince;
    }
    /**
     *　Set the "微信用户省份"
     */
    public void setWechatProvince(
            String wechatProvince) {
        this.wechatProvince = wechatProvince;
    }

    /**
     *　Get the "微信用户性别"
     */
    public String getWechatSex() {
        return this.wechatSex;
    }
    /**
     *　Set the "微信用户性别"
     */
    public void setWechatSex(
            String wechatSex) {
        this.wechatSex = wechatSex;
    }

    /**
     *　Get the "微信用户unionid"
     */
    public String getWechatUnionid() {
        return this.wechatUnionid;
    }
    /**
     *　Set the "微信用户unionid"
     */
    public void setWechatUnionid(
            String wechatUnionid) {
        this.wechatUnionid = wechatUnionid;
    }

    /**
     *　Get the "微信用户权限"
     */
    public String getWechatPrivilege() {
        return this.wechatPrivilege;
    }
    /**
     *　Set the "微信用户权限"
     */
    public void setWechatPrivilege(
            String wechatPrivilege) {
        this.wechatPrivilege = wechatPrivilege;
    }

    /**
     *　Get the "微信用户组id"
     */
    public Integer getWechatGroupid() {
        return this.wechatGroupid;
    }
    /**
     *　Set the "微信用户组id"
     */
    public void setWechatGroupid(
            Integer wechatGroupid) {
        this.wechatGroupid = wechatGroupid;
    }

    /**
     *　Get the "微信用户标签列表"
     */
    public String getWechatTagidList() {
        return this.wechatTagidList;
    }
    /**
     *　Set the "微信用户标签列表"
     */
    public void setWechatTagidList(
            String wechatTagidList) {
        this.wechatTagidList = wechatTagidList;
    }

    /**
     *　Get the "微信用户订阅信息"
     */
    public Integer getWechatSubscribe() {
        return this.wechatSubscribe;
    }
    /**
     *　Set the "微信用户订阅信息"
     */
    public void setWechatSubscribe(
            Integer wechatSubscribe) {
        this.wechatSubscribe = wechatSubscribe;
    }

    /**
     *　Get the "微信用户订阅时间"
     */
    public java.sql.Timestamp getWechatSubscribeTime() {
        return this.wechatSubscribeTime;
    }
    /**
     *　Set the "微信用户订阅时间"
     */
    public void setWechatSubscribeTime(
            java.sql.Timestamp wechatSubscribeTime) {
        this.wechatSubscribeTime = wechatSubscribeTime;
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
    public UmeWechatUserDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        UmeWechatUserDto newInstance = new UmeWechatUserDto();
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
        public static final String INSERT = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_INSERT"; 
        public static final String UPDATE = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_UPDATE"; 
        public static final String SMART_UPDATE = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_SMART_UPDATE"; 
        public static final String DELETE = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_DELETE"; 
        public static final String DELETE_ALL = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_DELETE_ALL"; 
        public static final String FIND = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_FIND"; 
        public static final String FIND_FOR_UPDATE = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_FIND_FOR_UPDATE"; 
        public static final String FIND_LIST = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_FIND_LIST"; 
        public static final String FIND_LIST_LIKE = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_FIND_LIST_LIKE"; 
        public static final String FIND_LIST_MATCH = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_FIND_LIST_MATCH"; 
        public static final String COUNT = "org.umeframework.ems.uac.entity.UME_WECHAT_USER_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String userId = "userId";
        public static final String wechatOpenid = "wechatOpenid";
        public static final String wechatCity = "wechatCity";
        public static final String wechatCountry = "wechatCountry";
        public static final String wechatHeadimgurl = "wechatHeadimgurl";
        public static final String wechatLanguage = "wechatLanguage";
        public static final String wechatNickname = "wechatNickname";
        public static final String wechatProvince = "wechatProvince";
        public static final String wechatSex = "wechatSex";
        public static final String wechatUnionid = "wechatUnionid";
        public static final String wechatPrivilege = "wechatPrivilege";
        public static final String wechatGroupid = "wechatGroupid";
        public static final String wechatTagidList = "wechatTagidList";
        public static final String wechatSubscribe = "wechatSubscribe";
        public static final String wechatSubscribeTime = "wechatSubscribeTime";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String USER_ID = "USER_ID";
        public static final String WECHAT_OPENID = "WECHAT_OPENID";
        public static final String WECHAT_CITY = "WECHAT_CITY";
        public static final String WECHAT_COUNTRY = "WECHAT_COUNTRY";
        public static final String WECHAT_HEADIMGURL = "WECHAT_HEADIMGURL";
        public static final String WECHAT_LANGUAGE = "WECHAT_LANGUAGE";
        public static final String WECHAT_NICKNAME = "WECHAT_NICKNAME";
        public static final String WECHAT_PROVINCE = "WECHAT_PROVINCE";
        public static final String WECHAT_SEX = "WECHAT_SEX";
        public static final String WECHAT_UNIONID = "WECHAT_UNIONID";
        public static final String WECHAT_PRIVILEGE = "WECHAT_PRIVILEGE";
        public static final String WECHAT_GROUPID = "WECHAT_GROUPID";
        public static final String WECHAT_TAGID_LIST = "WECHAT_TAGID_LIST";
        public static final String WECHAT_SUBSCRIBE = "WECHAT_SUBSCRIBE";
        public static final String WECHAT_SUBSCRIBE_TIME = "WECHAT_SUBSCRIBE_TIME";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "UME_WECHAT_USER";

}
