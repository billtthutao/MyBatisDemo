package tk.mybatis.web.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import tk.mybatis.web.model.SysDict;

public interface DictMapper {

	/**
	 * Select Dict by Id
	 * 
	 * @param id
	 * @return 
	 */
	SysDict selectDictByPrimaryKey(Long id);
	
	/**
	 * select a group of SysDict
	 * 
	 * @param sysDict
	 * @return
	 */
	List<SysDict> selectBySysDict(SysDict sysDict, RowBounds rowBounds);
	
	/**
	 * Insert SysDict
	 * 
	 * @param sysDict
	 * @return
	 */
	int insert(SysDict sysDict);
	
	/**
	 * Update SysDict
	 * 
	 * @param sysDict
	 * @return
	 */
	int updateById(SysDict sysDict);
	
	/**
	 * Delete SysDict using Id
	 * 
	 * @param id
	 * @return
	 */
	int deleteById(Long id);
}
