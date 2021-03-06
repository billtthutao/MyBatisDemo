package test.dao;

import java.util.List;
import test.model.HostCache;

public interface HostCacheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_cache
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String ip);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_cache
     *
     * @mbg.generated
     */
    int insert(HostCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_cache
     *
     * @mbg.generated
     */
    HostCache selectByPrimaryKey(String ip);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_cache
     *
     * @mbg.generated
     */
    List<HostCache> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_cache
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HostCache record);
}