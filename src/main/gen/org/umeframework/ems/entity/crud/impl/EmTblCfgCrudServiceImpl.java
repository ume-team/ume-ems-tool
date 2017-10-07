package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmTblCfgDto;
import org.umeframework.ems.entity.crud.EmTblCfgCrudService;

/**
 * EM实体展示配置表:EM_TBL_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmTblCfgCrudServiceImpl extends BaseDBComponent implements EmTblCfgCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmTblCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmTblCfgDto entity) {
        return getDao().update(EmTblCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    public EmTblCfgDto find(EmTblCfgDto queryParam) {
        return getDao().queryForObject(EmTblCfgDto.SQLID.FIND, queryParam, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    public List<EmTblCfgDto> search(EmTblCfgDto condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    public List<EmTblCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.LIKE_SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
     */
    @Override
    public List<EmTblCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblCfgDto.SQLID.DYNA_SEARCH, condition, EmTblCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblCfgCrudService
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
