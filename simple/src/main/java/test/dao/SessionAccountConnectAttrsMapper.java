package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.SessionAccountConnectAttrs;

public interface SessionAccountConnectAttrsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_account_connect_attrs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_account_connect_attrs
     *
     * @mbg.generated
     */
    int insert(SessionAccountConnectAttrs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_account_connect_attrs
     *
     * @mbg.generated
     */
    SessionAccountConnectAttrs selectByPrimaryKey(@Param("processlistId") Long processlistId, @Param("attrName") String attrName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_account_connect_attrs
     *
     * @mbg.generated
     */
    List<SessionAccountConnectAttrs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_account_connect_attrs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SessionAccountConnectAttrs record);
}