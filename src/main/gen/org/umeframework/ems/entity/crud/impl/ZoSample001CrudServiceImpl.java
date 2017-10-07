package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.ZoSample001Dto;
import org.umeframework.ems.entity.crud.ZoSample001CrudService;

/**
 * EM数据类型测试表2.0:ZO_SAMPLE_001<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class ZoSample001CrudServiceImpl extends BaseDBComponent implements ZoSample001CrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public Integer create(ZoSample001Dto entity) {
        validate(entity);
        return getDao().update(ZoSample001Dto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(ZoSample001Dto entity) {
        ZoSample001Dto existed = getDao().queryForObject(ZoSample001Dto.SQLID.FIND, entity, ZoSample001Dto.class);
        if (existed == null) {
            return getDao().update(ZoSample001Dto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(ZoSample001Dto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public Integer update(ZoSample001Dto entity) {
        validate(entity);
        return getDao().update(ZoSample001Dto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(ZoSample001Dto entity) {
        validate(entity);
        return getDao().update(ZoSample001Dto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(ZoSample001Dto entity) {
        return getDao().update(ZoSample001Dto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<ZoSample001Dto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (ZoSample001Dto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public ZoSample001Dto find(ZoSample001Dto queryParam) {
        return getDao().queryForObject(ZoSample001Dto.SQLID.FIND, queryParam, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public List<ZoSample001Dto> search(ZoSample001Dto condition) {
        return getDao().queryForObjectList(ZoSample001Dto.SQLID.SEARCH, condition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public List<ZoSample001Dto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ZoSample001Dto.SQLID.LIKE_SEARCH, condition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public List<ZoSample001Dto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(ZoSample001Dto.SQLID.DYNA_SEARCH, condition, ZoSample001Dto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.ZoSample001CrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(ZoSample001Dto.SQLID.COUNT, condition);
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
