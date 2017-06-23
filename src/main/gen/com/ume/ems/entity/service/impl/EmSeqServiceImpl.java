package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmSeqDto;
import com.ume.ems.entity.service.EmSeqService;

/**
 * 采番表:EM_SEQ<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmSeqServiceImpl extends BaseDBComponent implements EmSeqService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public Integer create(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmSeqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmSeqDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmSeqDto entity) {
        EmSeqDto existed = getDao().queryForObject(EmSeqDto.SQLID.FIND, entity, EmSeqDto.class);
        if (existed == null) {
            return getDao().update(EmSeqDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmSeqDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmSeqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmSeqDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public Integer update(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmSeqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmSeqDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmSeqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmSeqDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmSeqDto entity) {
        return getDao().update(EmSeqDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmSeqDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmSeqDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    public EmSeqDto find(EmSeqDto queryParam) {
        return getDao().queryForObject(EmSeqDto.SQLID.FIND, queryParam, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    public List<EmSeqDto> search(EmSeqDto condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    public List<EmSeqDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.LIKE_SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    public List<EmSeqDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.DYNA_SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmSeqService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmSeqDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmSeqDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
