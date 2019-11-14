package tk.mybatis.simple.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import org.junit.Assert;
import tk.mybatis.simple.model.SysRole;

public class CacheTest extends BaseMapperTest{

	@Test
	public void testL2Cache() {
		SqlSession sqlSession = getSqlSession();
		SysRole role1 = null;
		
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			role1 = roleMapper.selectRoleById(1l);
			
			role1.setRoleName("New Name");
			
			SysRole role2 = roleMapper.selectRoleById(1l);
			
			Assert.assertEquals("New Name", role2.getRoleName());
			Assert.assertEquals(role1, role2);
		}finally {
			//sqlSession.rollback();
			sqlSession.close();
		}
		
		System.out.println("Open New SQL Session:");
		
		sqlSession = getSqlSession();
		
		try {
			RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			SysRole role2 = roleMapper.selectRoleById(1l);
			
			Assert.assertEquals("New Name", role2.getRoleName());
			//Assert.assertNotEquals(role1, role2);
			
			SysRole role3 = roleMapper.selectRoleById(1l);
			Assert.assertNotEquals(role2, role3);
		}finally {
			//sqlSession.rollback();
			sqlSession.close();
		}
	}
}
