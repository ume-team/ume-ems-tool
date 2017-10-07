package org.umeframework.ems.entity.crud;

import java.util.List;
import java.util.Map;
import org.umeframework.ems.entity.EmTblCfgDto;

/*
 * EM实体展示配置表:EM_TBL_CFG<br>
 * Crud service interface declare.<br>
 *
 * @author DORA.Generator
 */
public interface EmTblCfgCrudService {
    /**
     * Insert entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer create(EmTblCfgDto entity);
    
    /**
     * Insert entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createList(List<EmTblCfgDto> entityList);
    
    /**
     * Update entity when exist, insert new record if not exist.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer createOrUpdate(EmTblCfgDto entity);
    
    /**
     * Update entity list when exist, insert new records if not exist.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> createOrUpdateList(List<EmTblCfgDto> entityList);
    
    /**
     * Update entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer update(EmTblCfgDto entity);
    
    /**
     * Update entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateList(List<EmTblCfgDto> entityList);
    
    /**
     * Update entity (full filed update include null value).<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer updateFully(EmTblCfgDto entity);
    
    /**
     * Update entity list (full filed update include null value).<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> updateFullyList(List<EmTblCfgDto> entityList);

    /**
     * Delete entity.<br>
     * 
     * @param entity - entity instance
     * @return
     */
    Integer delete(EmTblCfgDto entity);
    
    /**
     * Delete entity list.<br>
     * 
     * @param entityList - entity instance list
     * @return
     */
    List<Integer> deleteList(List<EmTblCfgDto> entityList);
    
    /**
     * Find entity by primary key set.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance
     */
    EmTblCfgDto find(EmTblCfgDto condition);
    
    /**
     * Search entity list use equal match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<EmTblCfgDto> search(EmTblCfgDto condition);
    
    /**
     * Search entity list use like (%var%) match.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<EmTblCfgDto> likeSearch(Map<String, String> condition);
    
    /**
     * Search entity list use dynamic condition.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    List<EmTblCfgDto> dynaSearch(Map<String, String> condition);
    
    /**
     * Count.<br>
     * 
     * @param condition - query parameter
     * @return - matched entity instance list
     */
    Integer count(Map<String, String> condition);

}
