package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table wait_classes_global_by_avg_latency
 */
public class WaitClassesGlobalByAvgLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.event_class
     *
     * @mbg.generated
     */
    private String eventClass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.total
     *
     * @mbg.generated
     */
    private BigDecimal total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.min_latency
     *
     * @mbg.generated
     */
    private String minLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.avg_latency
     *
     * @mbg.generated
     */
    private String avgLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wait_classes_global_by_avg_latency.max_latency
     *
     * @mbg.generated
     */
    private String maxLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.event_class
     *
     * @return the value of wait_classes_global_by_avg_latency.event_class
     *
     * @mbg.generated
     */
    public String getEventClass() {
        return eventClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.event_class
     *
     * @param eventClass the value for wait_classes_global_by_avg_latency.event_class
     *
     * @mbg.generated
     */
    public void setEventClass(String eventClass) {
        this.eventClass = eventClass == null ? null : eventClass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.total
     *
     * @return the value of wait_classes_global_by_avg_latency.total
     *
     * @mbg.generated
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.total
     *
     * @param total the value for wait_classes_global_by_avg_latency.total
     *
     * @mbg.generated
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.total_latency
     *
     * @return the value of wait_classes_global_by_avg_latency.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.total_latency
     *
     * @param totalLatency the value for wait_classes_global_by_avg_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.min_latency
     *
     * @return the value of wait_classes_global_by_avg_latency.min_latency
     *
     * @mbg.generated
     */
    public String getMinLatency() {
        return minLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.min_latency
     *
     * @param minLatency the value for wait_classes_global_by_avg_latency.min_latency
     *
     * @mbg.generated
     */
    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency == null ? null : minLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.avg_latency
     *
     * @return the value of wait_classes_global_by_avg_latency.avg_latency
     *
     * @mbg.generated
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.avg_latency
     *
     * @param avgLatency the value for wait_classes_global_by_avg_latency.avg_latency
     *
     * @mbg.generated
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency == null ? null : avgLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wait_classes_global_by_avg_latency.max_latency
     *
     * @return the value of wait_classes_global_by_avg_latency.max_latency
     *
     * @mbg.generated
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wait_classes_global_by_avg_latency.max_latency
     *
     * @param maxLatency the value for wait_classes_global_by_avg_latency.max_latency
     *
     * @mbg.generated
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }
}