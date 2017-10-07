package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmTblColCfgDto;
import org.umeframework.ems.entity.crud.EmTblColCfgCrudService;

/**
 * EM实体属性配置表:EM_TBL_COL_CFG<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmTblColCfgCrudServiceImpl extends BaseDBComponent implements EmTblColCfgCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmTblColCfgDto entity) {
        validate(entity);
        return getDao().update(EmTblColCfgDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmTblColCfgDto entity) {
        return getDao().update(EmTblColCfgDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    public EmTblColCfgDto find(EmTblColCfgDto queryParam) {
        return getDao().queryForObject(EmTblColCfgDto.SQLID.FIND, queryParam, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    public List<EmTblColCfgDto> search(EmTblColCfgDto condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    public List<EmTblColCfgDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.LIKE_SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
     */
    @Override
    public List<EmTblColCfgDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmTblColCfgDto.SQLID.DYNA_SEARCH, condition, EmTblColCfgDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmTblColCfgCrudService
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
