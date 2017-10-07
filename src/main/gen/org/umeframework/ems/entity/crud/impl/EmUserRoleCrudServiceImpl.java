package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmUserRoleDto;
import org.umeframework.ems.entity.crud.EmUserRoleCrudService;

/**
 * EM用户角色分配表:EM_USER_ROLE<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmUserRoleCrudServiceImpl extends BaseDBComponent implements EmUserRoleCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmUserRoleDto entity) {
        validate(entity);
        return getDao().update(EmUserRoleDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmUserRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserRoleDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmUserRoleDto entity) {
        EmUserRoleDto existed = getDao().queryForObject(EmUserRoleDto.SQLID.FIND, entity, EmUserRoleDto.class);
        if (existed == null) {
            return getDao().update(EmUserRoleDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmUserRoleDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmUserRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserRoleDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmUserRoleDto entity) {
        validate(entity);
        return getDao().update(EmUserRoleDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmUserRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserRoleDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmUserRoleDto entity) {
        validate(entity);
        return getDao().update(EmUserRoleDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmUserRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserRoleDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmUserRoleDto entity) {
        return getDao().update(EmUserRoleDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmUserRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmUserRoleDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    public EmUserRoleDto find(EmUserRoleDto queryParam) {
        return getDao().queryForObject(EmUserRoleDto.SQLID.FIND, queryParam, EmUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    public List<EmUserRoleDto> search(EmUserRoleDto condition) {
        return getDao().queryForObjectList(EmUserRoleDto.SQLID.SEARCH, condition, EmUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    public List<EmUserRoleDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmUserRoleDto.SQLID.LIKE_SEARCH, condition, EmUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    public List<EmUserRoleDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmUserRoleDto.SQLID.DYNA_SEARCH, condition, EmUserRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmUserRoleCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmUserRoleDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmUserRoleDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
