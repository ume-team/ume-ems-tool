package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmTblColCfgDto;
import com.ume.ems.entity.service.EmTblColCfgService;

/**
 * EM实体属性配置表:EM_TBL_COL_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmTblColCfgServiceImpl extends BaseDBComponent implements EmTblColCfgService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public Integer create(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmTblColCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblColCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmTblColCfgDto entity) {
        EmTblColCfgDto existed = getDao().queryForObject(EmTblColCfgDto.SQLID.FIND, entity, EmTblColCfgDto.class);
        if (existed == null) {
            return getDao().update(EmTblColCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmTblColCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmTblColCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblColCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public Integer update(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmTblColCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblColCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmTblColCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblColCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmTblColCfgDto entity) {
        return getDao().update(EmTblColCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmTblColCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTblColCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    public EmTblColCfgDto find(EmTblColCfgDto queryParam) {
        return getDao().queryForObject(EmTblColCfgDto.SQLID.FIND, queryParam, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    public List<EmTblColCfgDto> search(EmTblColCfgDto condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    public List<EmTblColCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.LIKE_SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    public List<EmTblColCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.DYNA_SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTblColCfgService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmTblColCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmTblColCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
