package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmEntityCfgDto;
import com.ume.ems.entity.service.EmEntityCfgService;

/**
 * EM实体展示配置表:EM_ENTITY_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmEntityCfgServiceImpl extends BaseDBComponent implements EmEntityCfgService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public Integer create(EmEntityCfgDto entity) {
        validate(entity);
        return getDao().update(EmEntityCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmEntityCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmEntityCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmEntityCfgDto entity) {
        EmEntityCfgDto existed = getDao().queryForObject(EmEntityCfgDto.SQLID.FIND, entity, EmEntityCfgDto.class);
        if (existed == null) {
            return getDao().update(EmEntityCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmEntityCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmEntityCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmEntityCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public Integer update(EmEntityCfgDto entity) {
        validate(entity);
        return getDao().update(EmEntityCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmEntityCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmEntityCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmEntityCfgDto entity) {
        validate(entity);
        return getDao().update(EmEntityCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmEntityCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmEntityCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmEntityCfgDto entity) {
        return getDao().update(EmEntityCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmEntityCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmEntityCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    public EmEntityCfgDto find(EmEntityCfgDto queryParam) {
        return getDao().queryForObject(EmEntityCfgDto.SQLID.FIND, queryParam, EmEntityCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    public List<EmEntityCfgDto> search(EmEntityCfgDto condition) {
        return getDao().queryForObjectList(EmEntityCfgDto.SQLID.SEARCH, condition, EmEntityCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    public List<EmEntityCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmEntityCfgDto.SQLID.LIKE_SEARCH, condition, EmEntityCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    public List<EmEntityCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmEntityCfgDto.SQLID.DYNA_SEARCH, condition, EmEntityCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmEntityCfgService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmEntityCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmEntityCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
