package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.ZoSample002Dto;
import org.umeframework.ems.entity.crud.ZoSample002CrudService;

/**
 * EM数据类型测试表2.0:ZO_SAMPLE_002<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class ZoSample002CrudServiceImpl extends BaseDBComponent implements ZoSample002CrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public Integer create(ZoSample002Dto entity) {
        validate(entity);
        return getDao().update(ZoSample002Dto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ZoSample002Dto entity) {
        ZoSample002Dto existed = getDao().queryForObject(ZoSample002Dto.SQLID.FIND, entity, ZoSample002Dto.class);
        if (existed == null) {
            return getDao().update(ZoSample002Dto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(ZoSample002Dto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public Integer update(ZoSample002Dto entity) {
        validate(entity);
        return getDao().update(ZoSample002Dto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ZoSample002Dto entity) {
        validate(entity);
        return getDao().update(ZoSample002Dto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(ZoSample002Dto entity) {
        return getDao().update(ZoSample002Dto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ZoSample002Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample002Dto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public ZoSample002Dto find(ZoSample002Dto queryParam) {
        return getDao().queryForObject(ZoSample002Dto.SQLID.FIND, queryParam, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public List<ZoSample002Dto> search(ZoSample002Dto condition) {
        return getDao().queryForObjectList(ZoSample002Dto.SQLID.SEARCH, condition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public List<ZoSample002Dto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ZoSample002Dto.SQLID.LIKE_SEARCH, condition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public List<ZoSample002Dto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ZoSample002Dto.SQLID.DYNA_SEARCH, condition, ZoSample002Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample002CrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(ZoSample002Dto.SQLID.COUNT, condition);
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
