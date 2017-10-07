package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmRoleDto;
import org.umeframework.ems.entity.crud.EmRoleCrudService;

/**
 * EM角色定义表:EM_ROLE<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmRoleCrudServiceImpl extends BaseDBComponent implements EmRoleCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmRoleDto entity) {
        validate(entity);
        return getDao().update(EmRoleDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmRoleDto entity) {
        EmRoleDto existed = getDao().queryForObject(EmRoleDto.SQLID.FIND, entity, EmRoleDto.class);
        if (existed == null) {
            return getDao().update(EmRoleDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmRoleDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmRoleDto entity) {
        validate(entity);
        return getDao().update(EmRoleDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmRoleDto entity) {
        validate(entity);
        return getDao().update(EmRoleDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmRoleDto entity) {
        return getDao().update(EmRoleDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmRoleDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    public EmRoleDto find(EmRoleDto queryParam) {
        return getDao().queryForObject(EmRoleDto.SQLID.FIND, queryParam, EmRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    public List<EmRoleDto> search(EmRoleDto condition) {
        return getDao().queryForObjectList(EmRoleDto.SQLID.SEARCH, condition, EmRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    public List<EmRoleDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmRoleDto.SQLID.LIKE_SEARCH, condition, EmRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    public List<EmRoleDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmRoleDto.SQLID.DYNA_SEARCH, condition, EmRoleDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmRoleDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmRoleDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
