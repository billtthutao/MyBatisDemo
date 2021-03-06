package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_stages_current
 */
public class EventsStagesCurrent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.THREAD_ID
     *
     * @mbg.generated
     */
    private Long threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.EVENT_ID
     *
     * @mbg.generated
     */
    private Long eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    private Long endEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.EVENT_NAME
     *
     * @mbg.generated
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.SOURCE
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.TIMER_START
     *
     * @mbg.generated
     */
    private Long timerStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.TIMER_END
     *
     * @mbg.generated
     */
    private Long timerEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long timerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.WORK_COMPLETED
     *
     * @mbg.generated
     */
    private Long workCompleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.WORK_ESTIMATED
     *
     * @mbg.generated
     */
    private Long workEstimated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    private Long nestingEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_stages_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    private String nestingEventType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.THREAD_ID
     *
     * @return the value of events_stages_current.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.THREAD_ID
     *
     * @param threadId the value for events_stages_current.THREAD_ID
     *
     * @mbg.generated
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.EVENT_ID
     *
     * @return the value of events_stages_current.EVENT_ID
     *
     * @mbg.generated
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.EVENT_ID
     *
     * @param eventId the value for events_stages_current.EVENT_ID
     *
     * @mbg.generated
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.END_EVENT_ID
     *
     * @return the value of events_stages_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getEndEventId() {
        return endEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.END_EVENT_ID
     *
     * @param endEventId the value for events_stages_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.EVENT_NAME
     *
     * @return the value of events_stages_current.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.EVENT_NAME
     *
     * @param eventName the value for events_stages_current.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.SOURCE
     *
     * @return the value of events_stages_current.SOURCE
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.SOURCE
     *
     * @param source the value for events_stages_current.SOURCE
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.TIMER_START
     *
     * @return the value of events_stages_current.TIMER_START
     *
     * @mbg.generated
     */
    public Long getTimerStart() {
        return timerStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.TIMER_START
     *
     * @param timerStart the value for events_stages_current.TIMER_START
     *
     * @mbg.generated
     */
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.TIMER_END
     *
     * @return the value of events_stages_current.TIMER_END
     *
     * @mbg.generated
     */
    public Long getTimerEnd() {
        return timerEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.TIMER_END
     *
     * @param timerEnd the value for events_stages_current.TIMER_END
     *
     * @mbg.generated
     */
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.TIMER_WAIT
     *
     * @return the value of events_stages_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getTimerWait() {
        return timerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.TIMER_WAIT
     *
     * @param timerWait the value for events_stages_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.WORK_COMPLETED
     *
     * @return the value of events_stages_current.WORK_COMPLETED
     *
     * @mbg.generated
     */
    public Long getWorkCompleted() {
        return workCompleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.WORK_COMPLETED
     *
     * @param workCompleted the value for events_stages_current.WORK_COMPLETED
     *
     * @mbg.generated
     */
    public void setWorkCompleted(Long workCompleted) {
        this.workCompleted = workCompleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.WORK_ESTIMATED
     *
     * @return the value of events_stages_current.WORK_ESTIMATED
     *
     * @mbg.generated
     */
    public Long getWorkEstimated() {
        return workEstimated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.WORK_ESTIMATED
     *
     * @param workEstimated the value for events_stages_current.WORK_ESTIMATED
     *
     * @mbg.generated
     */
    public void setWorkEstimated(Long workEstimated) {
        this.workEstimated = workEstimated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.NESTING_EVENT_ID
     *
     * @return the value of events_stages_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getNestingEventId() {
        return nestingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.NESTING_EVENT_ID
     *
     * @param nestingEventId the value for events_stages_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_stages_current.NESTING_EVENT_TYPE
     *
     * @return the value of events_stages_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    public String getNestingEventType() {
        return nestingEventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_stages_current.NESTING_EVENT_TYPE
     *
     * @param nestingEventType the value for events_stages_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType == null ? null : nestingEventType.trim();
    }
}