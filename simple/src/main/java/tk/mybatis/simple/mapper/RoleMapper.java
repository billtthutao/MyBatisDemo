package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.CacheNamespaceRef;

import tk.mybatis.simple.model.SysRole;

//@CacheNamespace(
//		eviction = FifoCache.class,
//		flushInterval = 60000,
//		size = 512,
//		readWrite = true
//		)
@CacheNamespaceRef(RoleMapper.class)
public interface RoleMapper {

	SysRole selectRoleById(Long id);
}
