package org.umeframework.ems.entity.crud.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.umeframework.dora.bean.BeanValidator;
import org.umeframework.dora.transaction.TransactionRequired;
import org.umeframework.dora.service.BaseDBComponent;
import org.umeframework.ems.entity.EmSeqDto;
import org.umeframework.ems.entity.crud.EmSeqCrudService;

/**
 * 采番表:EM_SEQ<br>
 * Crud service implementation class.<br>
 *
 * @author DORA.Generator
 */
@org.springframework.stereotype.Service
public class EmSeqCrudServiceImpl extends BaseDBComponent implements EmSeqCrudService {
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    @TransactionRequired
    public Integer create(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.INSERT, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    @TransactionRequired
    public Integer update(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.SMART_UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    @TransactionRequired
    public Integer updateFully(EmSeqDto entity) {
        validate(entity);
        return getDao().update(EmSeqDto.SQLID.UPDATE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    @TransactionRequired
    public Integer delete(EmSeqDto entity) {
        return getDao().update(EmSeqDto.SQLID.DELETE, entity);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    public EmSeqDto find(EmSeqDto queryParam) {
        return getDao().queryForObject(EmSeqDto.SQLID.FIND, queryParam, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    public List<EmSeqDto> search(EmSeqDto condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    public List<EmSeqDto> likeSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.LIKE_SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
     */
    @Override
    public List<EmSeqDto> dynaSearch(Map<String, String> condition) {
        return getDao().queryForObjectList(EmSeqDto.SQLID.DYNA_SEARCH, condition, EmSeqDto.class);
    }
    
    /* (non-Javadoc)
     * 
     * @see org.umeframework.ems.entity.crud.impl.EmSeqCrudService
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
