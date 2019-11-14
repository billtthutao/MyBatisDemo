package test.model;

/**
 * Database Table Remarks:
 *   Time zone names
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table time_zone_name
 */
public class TimeZoneName {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_name.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_name.Time_zone_id
     *
     * @mbg.generated
     */
    private Integer timeZoneId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_name.Name
     *
     * @return the value of time_zone_name.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_name.Name
     *
     * @param name the value for time_zone_name.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_name.Time_zone_id
     *
     * @return the value of time_zone_name.Time_zone_id
     *
     * @mbg.generated
     */
    public Integer getTimeZoneId() {
        return timeZoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_name.Time_zone_id
     *
     * @param timeZoneId the value for time_zone_name.Time_zone_id
     *
     * @mbg.generated
     */
    public void setTimeZoneId(Integer timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}