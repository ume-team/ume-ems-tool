package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmTblCfgDto;
import com.ume.ems.entity.service.EmTblCfgService;

/**
 * EM实体展示配置表:EM_TBL_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmTblCfgServiceImpl extends BaseDBComponent implements EmTblCfgService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public Integer create(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmTblCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmTblCfgDto entity) {
        EmTblCfgDto existed = getDao().queryForObject(EmTblCfgDto.SQLID.FIND, entity, EmTblCfgDto.class);
        if (existed == null) {
            return getDao().update(EmTblCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmTblCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmTblCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public Integer update(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmTblCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmTblCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmTblCfgDto entity) {
        return getDao().update(EmTblCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmTblCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    public EmTblCfgDto find(EmTblCfgDto queryParam) {
        return getDao().queryForObject(EmTblCfgDto.SQLID.FIND, queryParam, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    public List<EmTblCfgDto> search(EmTblCfgDto condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    public List<EmTblCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.LIKE_SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    public List<EmTblCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.DYNA_SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblCfgService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmTblCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmTblCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
