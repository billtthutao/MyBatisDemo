package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.GtidExecuted;

public interface GtidExecutedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gtid_executed
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("sourceUuid") String sourceUuid, @Param("intervalStart") Long intervalStart);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gtid_executed
     *
     * @mbg.generated
     */
    int insert(GtidExecuted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gtid_executed
     *
     * @mbg.generated
     */
    GtidExecuted selectByPrimaryKey(@Param("sourceUuid") String sourceUuid, @Param("intervalStart") Long intervalStart);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gtid_executed
     *
     * @mbg.generated
     */
    List<GtidExecuted> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gtid_executed
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GtidExecuted record);
}