package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmResourceDto;
import com.ume.ems.entity.service.EmResourceService;

/**
 * EM资源管理表:EM_RESOURCE<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmResourceServiceImpl extends BaseDBComponent implements EmResourceService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public Integer create(EmResourceDto entity) {
        validate(entity);
        return getDao().update(EmResourceDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmResourceDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmResourceDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmResourceDto entity) {
        EmResourceDto existed = getDao().queryForObject(EmResourceDto.SQLID.FIND, entity, EmResourceDto.class);
        if (existed == null) {
            return getDao().update(EmResourceDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmResourceDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmResourceDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmResourceDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public Integer update(EmResourceDto entity) {
        validate(entity);
        return getDao().update(EmResourceDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmResourceDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmResourceDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmResourceDto entity) {
        validate(entity);
        return getDao().update(EmResourceDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmResourceDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmResourceDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmResourceDto entity) {
        return getDao().update(EmResourceDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmResourceDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmResourceDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    public EmResourceDto find(EmResourceDto queryParam) {
        return getDao().queryForObject(EmResourceDto.SQLID.FIND, queryParam, EmResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    public List<EmResourceDto> search(EmResourceDto condition) {
        return getDao().queryForObjectList(EmResourceDto.SQLID.SEARCH, condition, EmResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    public List<EmResourceDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmResourceDto.SQLID.LIKE_SEARCH, condition, EmResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    public List<EmResourceDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmResourceDto.SQLID.DYNA_SEARCH, condition, EmResourceDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmResourceService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmResourceDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmResourceDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
