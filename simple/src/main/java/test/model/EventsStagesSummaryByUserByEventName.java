package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_stages_summary_by_user_by_event_name
 */
public class EventsStagesSummaryByUserByEventName {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.USER
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    private Long countStar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long sumTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long minTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long avgTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long maxTimerWait;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.USER
     *
     * @return the value of events_stages_summary_by_user_by_event_name.USER
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.USER
     *
     * @param user the value for events_stages_summary_by_user_by_event_name.USER
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.EVENT_NAME
     *
     * @return the value of events_stages_summary_by_user_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.EVENT_NAME
     *
     * @param eventName the value for events_stages_summary_by_user_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.COUNT_STAR
     *
     * @return the value of events_stages_summary_by_user_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.COUNT_STAR
     *
     * @param countStar the value for events_stages_summary_by_user_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT
     *
     * @return the value of events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT
     *
     * @param sumTimerWait the value for events_stages_summary_by_user_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT
     *
     * @return the value of events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT
     *
     * @param minTimerWait the value for events_stages_summary_by_user_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT
     *
     * @return the value of events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT
     *
     * @param avgTimerWait the value for events_stages_summary_by_user_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT
     *
     * @return the value of events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT
     *
     * @param maxTimerWait the value for events_stages_summary_by_user_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }
}