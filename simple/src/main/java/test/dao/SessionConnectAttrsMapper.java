package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.SessionConnectAttrs;

public interface SessionConnectAttrsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int insert(SessionConnectAttrs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    SessionConnectAttrs selectByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    List<SessionConnectAttrs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SessionConnectAttrs record);
}