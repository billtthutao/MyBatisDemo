package test.dao;

import java.util.List;
import test.model.TimeZone;

public interface TimeZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer timeZoneId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone
     *
     * @mbg.generated
     */
    int insert(TimeZone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone
     *
     * @mbg.generated
     */
    TimeZone selectByPrimaryKey(Integer timeZoneId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone
     *
     * @mbg.generated
     */
    List<TimeZone> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZone record);
}