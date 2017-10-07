package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmUserDto;
import org.umeframework.ems.entity.crud.EmUserCrudService;

/**
 * EM用户表:EM_USER<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmUserCrudServiceImpl extends BaseDBComponent implements EmUserCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmUserDto entity) {
        validate(entity);
        return getDao().update(EmUserDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmUserDto entity) {
        EmUserDto existed = getDao().queryForObject(EmUserDto.SQLID.FIND, entity, EmUserDto.class);
        if (existed == null) {
            return getDao().update(EmUserDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmUserDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmUserDto entity) {
        validate(entity);
        return getDao().update(EmUserDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmUserDto entity) {
        validate(entity);
        return getDao().update(EmUserDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmUserDto entity) {
        return getDao().update(EmUserDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmUserDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    public EmUserDto find(EmUserDto queryParam) {
        return getDao().queryForObject(EmUserDto.SQLID.FIND, queryParam, EmUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    public List<EmUserDto> search(EmUserDto condition) {
        return getDao().queryForObjectList(EmUserDto.SQLID.SEARCH, condition, EmUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    public List<EmUserDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmUserDto.SQLID.LIKE_SEARCH, condition, EmUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    public List<EmUserDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmUserDto.SQLID.DYNA_SEARCH, condition, EmUserDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmUserDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmUserDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
