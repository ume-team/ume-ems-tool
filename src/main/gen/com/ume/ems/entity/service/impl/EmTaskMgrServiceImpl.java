package com.ume.ems.entity.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.dora.bean.BeanValidator;
import com.dora.transaction.TransactionRequired;
import com.dora.service.BaseDBComponent;
import com.ume.ems.entity.EmTaskMgrDto;
import com.ume.ems.entity.service.EmTaskMgrService;

/**
 * 定时任务管理表:EM_TASK_MGR<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmTaskMgrServiceImpl extends BaseDBComponent implements EmTaskMgrService {
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public Integer create(EmTaskMgrDto entity) {
        validate(entity);
        return getDao().update(EmTaskMgrDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmTaskMgrDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTaskMgrDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmTaskMgrDto entity) {
        EmTaskMgrDto existed = getDao().queryForObject(EmTaskMgrDto.SQLID.FIND, entity, EmTaskMgrDto.class);
        if (existed == null) {
            return getDao().update(EmTaskMgrDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmTaskMgrDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmTaskMgrDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTaskMgrDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public Integer update(EmTaskMgrDto entity) {
        validate(entity);
        return getDao().update(EmTaskMgrDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmTaskMgrDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTaskMgrDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmTaskMgrDto entity) {
        validate(entity);
        return getDao().update(EmTaskMgrDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmTaskMgrDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTaskMgrDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmTaskMgrDto entity) {
        return getDao().update(EmTaskMgrDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmTaskMgrDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmTaskMgrDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    public EmTaskMgrDto find(EmTaskMgrDto queryParam) {
        return getDao().queryForObject(EmTaskMgrDto.SQLID.FIND, queryParam, EmTaskMgrDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    public List<EmTaskMgrDto> search(EmTaskMgrDto condition) {
        return getDao().queryForObjectList(EmTaskMgrDto.SQLID.SEARCH, condition, EmTaskMgrDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    public List<EmTaskMgrDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTaskMgrDto.SQLID.LIKE_SEARCH, condition, EmTaskMgrDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    public List<EmTaskMgrDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTaskMgrDto.SQLID.DYNA_SEARCH, condition, EmTaskMgrDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see com.ume.ems.entity.service.impl.EmTaskMgrService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmTaskMgrDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmTaskMgrDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
