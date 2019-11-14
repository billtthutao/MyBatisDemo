package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.ProxiesPriv;

public interface ProxiesPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("proxiedHost") String proxiedHost, @Param("proxiedUser") String proxiedUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    int insert(ProxiesPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    ProxiesPriv selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("proxiedHost") String proxiedHost, @Param("proxiedUser") String proxiedUser);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    List<ProxiesPriv> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProxiesPriv record);
}