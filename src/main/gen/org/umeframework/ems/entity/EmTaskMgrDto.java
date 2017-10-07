
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
 * Entity class map to table "定时任务管理表"
 *
 * @author ume-team
 */
@Entity
@Table(name="EM_TASK_MGR")
@TableDesc(label="定时任务管理表")
public class EmTaskMgrDto extends TableEntity implements Serializable {
   /**
    * Default serial version code
    */
    private static final long serialVersionUID = 1L;

   /**
    * JOB ID 
    */
    @NotEmpty
    @Size(max=8)
    @Id
    @ColumnDesc(index=1, type="VARCHAR", label="JOB ID")
    @Column(name="TASK_ID", nullable=false, length=8)
    private String taskId;

   /**
    * JOB名称 
    */
    @Size(max=64)
    @ColumnDesc(index=2, type="VARCHAR", label="JOB名称")
    @Column(name="TASK_NAME", nullable=true, length=64)
    private String taskName;

   /**
    * JOB是否可用标志 
    * 0:失效 1:有效
    */
    @Size(max=1)
    @ColumnDesc(index=3, type="INT", label="JOB是否可用标志")
    @Column(name="TASK_ENABLE", nullable=true, length=1)
    private Integer taskEnable;

   /**
    * JOB运行状态 
    */
    @Size(max=64)
    @ColumnDesc(index=4, type="VARCHAR", label="JOB运行状态")
    @Column(name="TASK_STATUS", nullable=true, length=64)
    private String taskStatus;

   /**
    * Create Author (default setting while insert)
    */
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
     *　Get the "JOB ID"
     */
    public String getTaskId() {
        return this.taskId;
    }
    /**
     *　Set the "JOB ID"
     */
    public void setTaskId(
            String taskId) {
        this.taskId = taskId;
    }

    /**
     *　Get the "JOB名称"
     */
    public String getTaskName() {
        return this.taskName;
    }
    /**
     *　Set the "JOB名称"
     */
    public void setTaskName(
            String taskName) {
        this.taskName = taskName;
    }

    /**
     *　Get the "JOB是否可用标志"
     */
    public Integer getTaskEnable() {
        return this.taskEnable;
    }
    /**
     *　Set the "JOB是否可用标志"
     */
    public void setTaskEnable(
            Integer taskEnable) {
        this.taskEnable = taskEnable;
    }

    /**
     *　Get the "JOB运行状态"
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }
    /**
     *　Set the "JOB运行状态"
     */
    public void setTaskStatus(
            String taskStatus) {
        this.taskStatus = taskStatus;
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
    public EmTaskMgrDto copyFrom(
            Property... selectProperties) {
        if (selectProperties == null) {
            return null;
        }
        EmTaskMgrDto newInstance = new EmTaskMgrDto();
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
        public static final String INSERT = "org.umeframework.ems.entity.EM_TASK_MGR_INSERT"; 
        public static final String UPDATE = "org.umeframework.ems.entity.EM_TASK_MGR_UPDATE"; 
        public static final String SMART_UPDATE = "org.umeframework.ems.entity.EM_TASK_MGR_SMART_UPDATE"; 
        public static final String DELETE = "org.umeframework.ems.entity.EM_TASK_MGR_DELETE"; 
        public static final String FIND = "org.umeframework.ems.entity.EM_TASK_MGR_FIND"; 
        public static final String FIND_FOR_UPDATE = "org.umeframework.ems.entity.EM_TASK_MGR_FIND_FOR_UPDATE"; 
        public static final String SEARCH = "org.umeframework.ems.entity.EM_TASK_MGR_SEARCH"; 
        public static final String LIKE_SEARCH = "org.umeframework.ems.entity.EM_TASK_MGR_LIKE_SEARCH"; 
        public static final String DYNA_SEARCH = "org.umeframework.ems.entity.EM_TASK_MGR_DYNA_SEARCH"; 
        public static final String COUNT = "org.umeframework.ems.entity.EM_TASK_MGR_COUNT";
    } 

    /**
     * Constant declare: entity property name.<br>
     */
    public static class Property {
        public static final String taskId = "taskId";
        public static final String taskName = "taskName";
        public static final String taskEnable = "taskEnable";
        public static final String taskStatus = "taskStatus";
        public static final String createAuthor = "createAuthor";
        public static final String createDatetime = "createDatetime";
        public static final String updateAuthor = "updateAuthor";
        public static final String updateDatetime = "updateDatetime";
    }
    
    /**
     * Constant declare: column name map with bean property.<br>
     */
    public static class ColumnName {
        public static final String TASK_ID = "TASK_ID";
        public static final String TASK_NAME = "TASK_NAME";
        public static final String TASK_ENABLE = "TASK_ENABLE";
        public static final String TASK_STATUS = "TASK_STATUS";
        public static final String CREATE_AUTHOR = "CREATE_AUTHOR";
        public static final String CREATE_DATETIME = "CREATE_DATETIME";
        public static final String UPDATE_AUTHOR = "UPDATE_AUTHOR";
        public static final String UPDATE_DATETIME = "UPDATE_DATETIME";
    }
    /**
     * Constant declare: table name.<br>
     */
    public static String TableName = "EM_TASK_MGR";

}
