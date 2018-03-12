package org.umeframework.ems.test.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.test.entity.ZoSample002Dto;
import org.umeframework.ems.test.entity.crud.ZoSample002CrudService;

/**
 * EM数据类型测试表2.0:ZO_SAMPLE_002 CRUD service implementation.<br>
 *
 * @author UME-Generator
 */
@org.springframework.stereotype.Service
public class ZoSample002CrudServiceImpl extends BaseDBComponent implements ZoSample002CrudService {

    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#create
     */
    @Override
    @TransactionRequired
    public Integer create(ZoSample002Dto entity) {
        validate(entity);
        if (entity.getCreateAuthor() == null) {
            entity.setCreateAuthor(super.getUid());
        }
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZoSample002Dto.SQLID.INSERT, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#createList
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(this.create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#createOrUpdate
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ZoSample002Dto entity) {
        ZoSample002Dto existed = super.getDao().queryForObject(ZoSample002Dto.SQLID.FIND, entity, ZoSample002Dto.class);
        if (existed == null) {
            return this.create(entity);
        } else {
            validate(entity);
            return this.update(entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#createOrUpdateList
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(this.createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#update
     */
    @Override
    @TransactionRequired
    public Integer update(ZoSample002Dto entity) {
        validate(entity);
        if (entity.getUpdateAuthor() == null) {
            entity.setUpdateAuthor(super.getUid());
        }
        int result = super.getDao().update(ZoSample002Dto.SQLID.SMART_UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#updateList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(this.update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#updateFully
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ZoSample002Dto entity) {
        validate(entity);
        int result = super.getDao().update(ZoSample002Dto.SQLID.UPDATE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#updateFullyList
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(this.updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#delete
     */
    @Override
    @TransactionRequired
    public Integer delete(ZoSample002Dto entity) {
        int result = super.getDao().update(ZoSample002Dto.SQLID.DELETE, entity);
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#deleteList
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(this.delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#find
     */
    @Override
    public ZoSample002Dto find(ZoSample002Dto queryParam) {
        return super.getDao().queryForObject(ZoSample002Dto.SQLID.FIND, queryParam, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#findList
     */
    @Override
    public List<ZoSample002Dto> findList(ZoSample002Dto condition) {
        return super.getDao().queryForObjectList(ZoSample002Dto.SQLID.FIND_LIST, condition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#findListLike
     */
    @Override
    public List<ZoSample002Dto> findListLike(Map<String, String> condition) {
        return super.getDao().queryForObjectList(ZoSample002Dto.SQLID.FIND_LIST_LIKE, condition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService#findListMatch
     */
    @Override
    public List<ZoSample002Dto> findListMatch(Map<String, String> dynaCondition) {
        return super.getDao().queryForObjectList(ZoSample002Dto.SQLID.FIND_LIST_MATCH, dynaCondition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.test.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return super.getDao().count(ZoSample002Dto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(ZoSample002Dto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
