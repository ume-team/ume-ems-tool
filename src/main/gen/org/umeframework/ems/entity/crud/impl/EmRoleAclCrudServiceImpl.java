package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmRoleAclDto;
import org.umeframework.ems.entity.crud.EmRoleAclCrudService;

/**
 * EM角色访问控制表:EM_ROLE_ACL<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmRoleAclCrudServiceImpl extends BaseDBComponent implements EmRoleAclCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmRoleAclDto entity) {
        validate(entity);
        return getDao().update(EmRoleAclDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createList(List<EmRoleAclDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleAclDto entity : entityList) {
            result.add(create(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public Integer createOrUpdate(EmRoleAclDto entity) {
        EmRoleAclDto existed = getDao().queryForObject(EmRoleAclDto.SQLID.FIND, entity, EmRoleAclDto.class);
        if (existed == null) {
            return getDao().update(EmRoleAclDto.SQLID.INSERT, entity);
        } else {
            validate(entity);
            return getDao().update(EmRoleAclDto.SQLID.SMART_UPDATE, entity);
        }
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> createOrUpdateList(List<EmRoleAclDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleAclDto entity : entityList) {
            result.add(createOrUpdate(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmRoleAclDto entity) {
        validate(entity);
        return getDao().update(EmRoleAclDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateList(List<EmRoleAclDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleAclDto entity : entityList) {
            result.add(update(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmRoleAclDto entity) {
        validate(entity);
        return getDao().update(EmRoleAclDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> updateFullyList(List<EmRoleAclDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleAclDto entity : entityList) {
            result.add(updateFully(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmRoleAclDto entity) {
        return getDao().update(EmRoleAclDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    @TransactionRequired
    public List<Integer> deleteList(List<EmRoleAclDto> entityList) {
        List<Integer> result = new ArrayList<Integer>(entityList.size());
        for (EmRoleAclDto entity : entityList) {
            result.add(delete(entity));
        }
        return result;
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    public EmRoleAclDto find(EmRoleAclDto queryParam) {
        return getDao().queryForObject(EmRoleAclDto.SQLID.FIND, queryParam, EmRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    public List<EmRoleAclDto> search(EmRoleAclDto condition) {
        return getDao().queryForObjectList(EmRoleAclDto.SQLID.SEARCH, condition, EmRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    public List<EmRoleAclDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmRoleAclDto.SQLID.LIKE_SEARCH, condition, EmRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    public List<EmRoleAclDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmRoleAclDto.SQLID.DYNA_SEARCH, condition, EmRoleAclDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmRoleAclCrudService
     */
    @Override
    public Integer count(Map<String, String> condition) {
        return getDao().count(EmRoleAclDto.SQLID.COUNT, condition);
    }

    /**
     * Do entity validation before doUpdate
     * 
     * @param entity - Target doUpdate Entity
     */
    protected void validate(EmRoleAclDto entity) {
        // Here invoke the default entity check logic
        BeanValidator beanValidator = new BeanValidator();
        // Invoke validation rule
        beanValidator.validate(entity);
    }
}
