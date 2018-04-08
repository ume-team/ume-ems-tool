package org.umeframework.ems.test.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.test.entity.ZooDatatypeDemoDto;
import org.umeframework.ems.test.entity.crud.ZooDatatypeDemoCrudService;

/**
 * 数据类型测试·DEMO表:ZOO_DATATYPE_DEMO CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ZooDatatypeDemoCrudServiceImpl extends BaseDBComponent implements ZooDatatypeDemoCrudService {
    /**
     * Enable operation history table automatic insert flag.<br>
     */
    private boolean enableOperationHistory = true;
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#setEnableOperationHistory
     */
    @Override
    public void setEnableOperationHistory(boolean enable) {
        this.enableOperationHistory = enable;
    }

    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ZooDatatypeDemoDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ZooDatatypeDemoDto.SQLID.INSERT_HISTORY_C, entity);
        }
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZooDatatypeDemoDto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ZooDatatypeDemoDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZooDatatypeDemoDto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ZooDatatypeDemoDto entity) {
        ZooDatatypeDemoDto existed = super.getDao().queryForObject(ZooDatatypeDemoDto.SQLID.FIND, entity, ZooDatatypeDemoDto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ZooDatatypeDemoDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZooDatatypeDemoDto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ZooDatatypeDemoDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ZooDatatypeDemoDto.SQLID.INSERT_HISTORY_U, this.find(entity));
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZooDatatypeDemoDto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ZooDatatypeDemoDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZooDatatypeDemoDto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ZooDatatypeDemoDto entity) {
        validate(entity);
        if (this.enableOperationHistory) {
            // insert modified history
            super.getDao().update(ZooDatatypeDemoDto.SQLID.INSERT_HISTORY_U, entity);
        }
        int result = super.getDao().update(ZooDatatypeDemoDto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ZooDatatypeDemoDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZooDatatypeDemoDto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ZooDatatypeDemoDto entity) {
        if (this.enableOperationHistory) {
            // insert modified history
            if (entity.getCreateAuthor() == null) {
                entity.setCreateAuthor(super.getUid());
            }
            super.getDao().update(ZooDatatypeDemoDto.SQLID.INSERT_HISTORY_D, this.find(entity));
        }
        int result = super.getDao().update(ZooDatatypeDemoDto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ZooDatatypeDemoDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZooDatatypeDemoDto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#find
     */
    @Override
    public ZooDatatypeDemoDto find(ZooDatatypeDemoDto queryParam) {
        return super.getDao().queryForObject(ZooDatatypeDemoDto.SQLID.FIND, queryParam, ZooDatatypeDemoDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#findList
     */
    @Override
    public List<ZooDatatypeDemoDto> findList(ZooDatatypeDemoDto condition) {
        return super.getDao().queryForObjectList(ZooDatatypeDemoDto.SQLID.FIND_LIST, condition, ZooDatatypeDemoDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#findListLike
     */
    @Override
    public List<ZooDatatypeDemoDto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ZooDatatypeDemoDto.SQLID.FIND_LIST_LIKE, condition, ZooDatatypeDemoDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService#findListMatch
     */
    @Override
    public List<ZooDatatypeDemoDto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ZooDatatypeDemoDto.SQLID.FIND_LIST_MATCH, dynaCondition, ZooDatatypeDemoDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZooDatatypeDemoCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ZooDatatypeDemoDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ZooDatatypeDemoDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
