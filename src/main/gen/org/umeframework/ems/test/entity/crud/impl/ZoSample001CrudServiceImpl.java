package org.umeframework.ems.test.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.test.entity.ZoSample001Dto;
import org.umeframework.ems.test.entity.crud.ZoSample001CrudService;

/**
 * EM数据类型测试表2.0:ZO_SAMPLE_001 CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ZoSample001CrudServiceImpl extends BaseDBComponent implements ZoSample001CrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ZoSample001Dto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZoSample001Dto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ZoSample001Dto entity) {
        ZoSample001Dto existed = super.getDao().queryForObject(ZoSample001Dto.SQLID.FIND, entity, ZoSample001Dto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ZoSample001Dto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZoSample001Dto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ZoSample001Dto entity) {
        validate(entity);
        int result = super.getDao().update(ZoSample001Dto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ZoSample001Dto entity) {
        int result = super.getDao().update(ZoSample001Dto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#find
     */
    @Override
    public ZoSample001Dto find(ZoSample001Dto queryParam) {
        return super.getDao().queryForObject(ZoSample001Dto.SQLID.FIND, queryParam, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#findList
     */
    @Override
    public List<ZoSample001Dto> findList(ZoSample001Dto condition) {
        return super.getDao().queryForObjectList(ZoSample001Dto.SQLID.FIND_LIST, condition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#findListLike
     */
    @Override
    public List<ZoSample001Dto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ZoSample001Dto.SQLID.FIND_LIST_LIKE, condition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService#findListMatch
     */
    @Override
    public List<ZoSample001Dto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ZoSample001Dto.SQLID.FIND_LIST_MATCH, dynaCondition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ZoSample001Dto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ZoSample001Dto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
