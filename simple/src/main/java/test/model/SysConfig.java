package test.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_config
 */
public class SysConfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.variable
     *
     * @mbg.generated
     */
    private String variable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.set_time
     *
     * @mbg.generated
     */
    private Date setTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.set_by
     *
     * @mbg.generated
     */
    private String setBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.variable
     *
     * @return the value of sys_config.variable
     *
     * @mbg.generated
     */
    public String getVariable() {
        return variable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.variable
     *
     * @param variable the value for sys_config.variable
     *
     * @mbg.generated
     */
    public void setVariable(String variable) {
        this.variable = variable == null ? null : variable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.value
     *
     * @return the value of sys_config.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.value
     *
     * @param value the value for sys_config.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.set_time
     *
     * @return the value of sys_config.set_time
     *
     * @mbg.generated
     */
    public Date getSetTime() {
        return setTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.set_time
     *
     * @param setTime the value for sys_config.set_time
     *
     * @mbg.generated
     */
    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.set_by
     *
     * @return the value of sys_config.set_by
     *
     * @mbg.generated
     */
    public String getSetBy() {
        return setBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.set_by
     *
     * @param setBy the value for sys_config.set_by
     *
     * @mbg.generated
     */
    public void setSetBy(String setBy) {
        this.setBy = setBy == null ? null : setBy.trim();
    }
}