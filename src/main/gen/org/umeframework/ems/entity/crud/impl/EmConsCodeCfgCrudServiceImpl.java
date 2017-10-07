package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmConsCodeCfgDto;
import org.umeframework.ems.entity.crud.EmConsCodeCfgCrudService;

/**
 * EM 编码配置表:EM_CONS_CODE_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmConsCodeCfgCrudServiceImpl extends BaseDBComponent implements EmConsCodeCfgCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmConsCodeCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsCodeCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmConsCodeCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsCodeCfgDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmConsCodeCfgDto entity) {
        EmConsCodeCfgDto existed = getDao().queryForObject(EmConsCodeCfgDto.SQLID.FIND, entity, EmConsCodeCfgDto.class);
        if (existed == null) {
            return getDao().update(EmConsCodeCfgDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmConsCodeCfgDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmConsCodeCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsCodeCfgDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmConsCodeCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsCodeCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmConsCodeCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsCodeCfgDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmConsCodeCfgDto entity) {
        validate(entity);
        return getDao().update(EmConsCodeCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmConsCodeCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsCodeCfgDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmConsCodeCfgDto entity) {
        return getDao().update(EmConsCodeCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmConsCodeCfgDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmConsCodeCfgDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    public EmConsCodeCfgDto find(EmConsCodeCfgDto queryParam) {
        return getDao().queryForObject(EmConsCodeCfgDto.SQLID.FIND, queryParam, EmConsCodeCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    public List<EmConsCodeCfgDto> search(EmConsCodeCfgDto condition) {
        return getDao().queryForObjectList(EmConsCodeCfgDto.SQLID.SEARCH, condition, EmConsCodeCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    public List<EmConsCodeCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmConsCodeCfgDto.SQLID.LIKE_SEARCH, condition, EmConsCodeCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    public List<EmConsCodeCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmConsCodeCfgDto.SQLID.DYNA_SEARCH, condition, EmConsCodeCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmConsCodeCfgCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmConsCodeCfgDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmConsCodeCfgDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
