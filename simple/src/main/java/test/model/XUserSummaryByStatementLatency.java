package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table x$user_summary_by_statement_latency
 */
public class XUserSummaryByStatementLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.total
     *
     * @mbg.generated
     */
    private BigDecimal total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.total_latency
     *
     * @mbg.generated
     */
    private BigDecimal totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.max_latency
     *
     * @mbg.generated
     */
    private BigDecimal maxLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.lock_latency
     *
     * @mbg.generated
     */
    private BigDecimal lockLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.rows_sent
     *
     * @mbg.generated
     */
    private BigDecimal rowsSent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.rows_examined
     *
     * @mbg.generated
     */
    private BigDecimal rowsExamined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.rows_affected
     *
     * @mbg.generated
     */
    private BigDecimal rowsAffected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$user_summary_by_statement_latency.full_scans
     *
     * @mbg.generated
     */
    private BigDecimal fullScans;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.user
     *
     * @return the value of x$user_summary_by_statement_latency.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.user
     *
     * @param user the value for x$user_summary_by_statement_latency.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.total
     *
     * @return the value of x$user_summary_by_statement_latency.total
     *
     * @mbg.generated
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.total
     *
     * @param total the value for x$user_summary_by_statement_latency.total
     *
     * @mbg.generated
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.total_latency
     *
     * @return the value of x$user_summary_by_statement_latency.total_latency
     *
     * @mbg.generated
     */
    public BigDecimal getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.total_latency
     *
     * @param totalLatency the value for x$user_summary_by_statement_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(BigDecimal totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.max_latency
     *
     * @return the value of x$user_summary_by_statement_latency.max_latency
     *
     * @mbg.generated
     */
    public BigDecimal getMaxLatency() {
        return maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.max_latency
     *
     * @param maxLatency the value for x$user_summary_by_statement_latency.max_latency
     *
     * @mbg.generated
     */
    public void setMaxLatency(BigDecimal maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.lock_latency
     *
     * @return the value of x$user_summary_by_statement_latency.lock_latency
     *
     * @mbg.generated
     */
    public BigDecimal getLockLatency() {
        return lockLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.lock_latency
     *
     * @param lockLatency the value for x$user_summary_by_statement_latency.lock_latency
     *
     * @mbg.generated
     */
    public void setLockLatency(BigDecimal lockLatency) {
        this.lockLatency = lockLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.rows_sent
     *
     * @return the value of x$user_summary_by_statement_latency.rows_sent
     *
     * @mbg.generated
     */
    public BigDecimal getRowsSent() {
        return rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.rows_sent
     *
     * @param rowsSent the value for x$user_summary_by_statement_latency.rows_sent
     *
     * @mbg.generated
     */
    public void setRowsSent(BigDecimal rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.rows_examined
     *
     * @return the value of x$user_summary_by_statement_latency.rows_examined
     *
     * @mbg.generated
     */
    public BigDecimal getRowsExamined() {
        return rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.rows_examined
     *
     * @param rowsExamined the value for x$user_summary_by_statement_latency.rows_examined
     *
     * @mbg.generated
     */
    public void setRowsExamined(BigDecimal rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.rows_affected
     *
     * @return the value of x$user_summary_by_statement_latency.rows_affected
     *
     * @mbg.generated
     */
    public BigDecimal getRowsAffected() {
        return rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.rows_affected
     *
     * @param rowsAffected the value for x$user_summary_by_statement_latency.rows_affected
     *
     * @mbg.generated
     */
    public void setRowsAffected(BigDecimal rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$user_summary_by_statement_latency.full_scans
     *
     * @return the value of x$user_summary_by_statement_latency.full_scans
     *
     * @mbg.generated
     */
    public BigDecimal getFullScans() {
        return fullScans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$user_summary_by_statement_latency.full_scans
     *
     * @param fullScans the value for x$user_summary_by_statement_latency.full_scans
     *
     * @mbg.generated
     */
    public void setFullScans(BigDecimal fullScans) {
        this.fullScans = fullScans;
    }
}