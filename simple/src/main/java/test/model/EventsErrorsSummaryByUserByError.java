package test.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_errors_summary_by_user_by_error
 */
public class EventsErrorsSummaryByUserByError {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.USER
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    private Integer errorNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    private String errorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    private String sqlState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    private Long sumErrorRaised;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    private Long sumErrorHandled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    private Date firstSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_user_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    private Date lastSeen;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.USER
     *
     * @return the value of events_errors_summary_by_user_by_error.USER
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.USER
     *
     * @param user the value for events_errors_summary_by_user_by_error.USER
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.ERROR_NUMBER
     *
     * @return the value of events_errors_summary_by_user_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    public Integer getErrorNumber() {
        return errorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.ERROR_NUMBER
     *
     * @param errorNumber the value for events_errors_summary_by_user_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    public void setErrorNumber(Integer errorNumber) {
        this.errorNumber = errorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.ERROR_NAME
     *
     * @return the value of events_errors_summary_by_user_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    public String getErrorName() {
        return errorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.ERROR_NAME
     *
     * @param errorName the value for events_errors_summary_by_user_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    public void setErrorName(String errorName) {
        this.errorName = errorName == null ? null : errorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.SQL_STATE
     *
     * @return the value of events_errors_summary_by_user_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    public String getSqlState() {
        return sqlState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.SQL_STATE
     *
     * @param sqlState the value for events_errors_summary_by_user_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    public void setSqlState(String sqlState) {
        this.sqlState = sqlState == null ? null : sqlState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.SUM_ERROR_RAISED
     *
     * @return the value of events_errors_summary_by_user_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    public Long getSumErrorRaised() {
        return sumErrorRaised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.SUM_ERROR_RAISED
     *
     * @param sumErrorRaised the value for events_errors_summary_by_user_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    public void setSumErrorRaised(Long sumErrorRaised) {
        this.sumErrorRaised = sumErrorRaised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED
     *
     * @return the value of events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    public Long getSumErrorHandled() {
        return sumErrorHandled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED
     *
     * @param sumErrorHandled the value for events_errors_summary_by_user_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    public void setSumErrorHandled(Long sumErrorHandled) {
        this.sumErrorHandled = sumErrorHandled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.FIRST_SEEN
     *
     * @return the value of events_errors_summary_by_user_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.FIRST_SEEN
     *
     * @param firstSeen the value for events_errors_summary_by_user_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_user_by_error.LAST_SEEN
     *
     * @return the value of events_errors_summary_by_user_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_user_by_error.LAST_SEEN
     *
     * @param lastSeen the value for events_errors_summary_by_user_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }
}