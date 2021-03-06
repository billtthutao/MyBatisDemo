package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.RoleEdges;

public interface RoleEdgesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_edges
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("fromHost") String fromHost, @Param("fromUser") String fromUser, @Param("toHost") String toHost, @Param("toUser") String toUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_edges
     *
     * @mbg.generated
     */
    int insert(RoleEdges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_edges
     *
     * @mbg.generated
     */
    RoleEdges selectByPrimaryKey(@Param("fromHost") String fromHost, @Param("fromUser") String fromUser, @Param("toHost") String toHost, @Param("toUser") String toUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_edges
     *
     * @mbg.generated
     */
    List<RoleEdges> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_edges
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RoleEdges record);
}