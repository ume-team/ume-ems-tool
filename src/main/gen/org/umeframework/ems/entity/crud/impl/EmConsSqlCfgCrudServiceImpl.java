package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmConsSqlCfgDto;
import org.umeframework.ems.entity.crud.EmConsSqlCfgCrudService;

/**
 * EM 制约（SQL）配置表:EM_CONS_SQL_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmConsSqlCfgCrudServiceImpl extends BaseDBComponent implements EmConsSqlCfgCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmConsSqlCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsSqlCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmConsSqlCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsSqlCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmConsSqlCfgDto entity) {
        EmConsSqlCfgDto existed = getDao().queryForObject(EmConsSqlCfgDto.SQLID.FIND, entity, EmConsSqlCfgDto.class);
        if (existed == null) {
            return getDao().update(EmConsSqlCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmConsSqlCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmConsSqlCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsSqlCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmConsSqlCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsSqlCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmConsSqlCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsSqlCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmConsSqlCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsSqlCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmConsSqlCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsSqlCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmConsSqlCfgDto entity) {
        return getDao().update(EmConsSqlCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmConsSqlCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsSqlCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    public EmConsSqlCfgDto find(EmConsSqlCfgDto queryParam) {
        return getDao().queryForObject(EmConsSqlCfgDto.SQLID.FIND, queryParam, EmConsSqlCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    public List<EmConsSqlCfgDto> search(EmConsSqlCfgDto condition) {
        return getDao().queryForObjectList(EmConsSqlCfgDto.SQLID.SEARCH, condition, EmConsSqlCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    public List<EmConsSqlCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmConsSqlCfgDto.SQLID.LIKE_SEARCH, condition, EmConsSqlCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    public List<EmConsSqlCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmConsSqlCfgDto.SQLID.DYNA_SEARCH, condition, EmConsSqlCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsSqlCfgCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmConsSqlCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmConsSqlCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
