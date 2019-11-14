package test.dao;

import java.util.List;
import test.model.TimeZoneLeapSecond;

public interface TimeZoneLeapSecondMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long transitionTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int insert(TimeZoneLeapSecond record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    TimeZoneLeapSecond selectByPrimaryKey(Long transitionTime);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    List<TimeZoneLeapSecond> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZoneLeapSecond record);
}