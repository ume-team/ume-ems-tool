package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmDsCfgDto;
import com.ume.ems.entity.service.EmDsCfgService;

/**
 * EM数据源配置表:EM_DS_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmDsCfgServiceImpl extends BaseDBComponent implements EmDsCfgService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public Integer create(EmDsCfgDto entity) {
        validate(entity);
        return getDao().update(EmDsCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmDsCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmDsCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmDsCfgDto entity) {
        EmDsCfgDto existed = getDao().queryForObject(EmDsCfgDto.SQLID.FIND, entity, EmDsCfgDto.class);
        if (existed == null) {
            return getDao().update(EmDsCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmDsCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmDsCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmDsCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public Integer update(EmDsCfgDto entity) {
        validate(entity);
        return getDao().update(EmDsCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmDsCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmDsCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmDsCfgDto entity) {
        validate(entity);
        return getDao().update(EmDsCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmDsCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmDsCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmDsCfgDto entity) {
        return getDao().update(EmDsCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmDsCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmDsCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    public EmDsCfgDto find(EmDsCfgDto queryParam) {
        return getDao().queryForObject(EmDsCfgDto.SQLID.FIND, queryParam, EmDsCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    public List<EmDsCfgDto> search(EmDsCfgDto condition) {
        return getDao().queryForObjectList(EmDsCfgDto.SQLID.SEARCH, condition, EmDsCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    public List<EmDsCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmDsCfgDto.SQLID.LIKE_SEARCH, condition, EmDsCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    public List<EmDsCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmDsCfgDto.SQLID.DYNA_SEARCH, condition, EmDsCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmDsCfgService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmDsCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmDsCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
