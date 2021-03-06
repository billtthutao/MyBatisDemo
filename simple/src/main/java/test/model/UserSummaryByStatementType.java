package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_summary_by_statement_type
 */
public class UserSummaryByStatementType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.statement
     *
     * @mbg.generated
     */
    private String statement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.total
     *
     * @mbg.generated
     */
    private Long total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.rows_sent
     *
     * @mbg.generated
     */
    private Long rowsSent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.rows_examined
     *
     * @mbg.generated
     */
    private Long rowsExamined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.rows_affected
     *
     * @mbg.generated
     */
    private Long rowsAffected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.full_scans
     *
     * @mbg.generated
     */
    private Long fullScans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.max_latency
     *
     * @mbg.generated
     */
    private String maxLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_statement_type.lock_latency
     *
     * @mbg.generated
     */
    private String lockLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.user
     *
     * @return the value of user_summary_by_statement_type.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.user
     *
     * @param user the value for user_summary_by_statement_type.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.statement
     *
     * @return the value of user_summary_by_statement_type.statement
     *
     * @mbg.generated
     */
    public String getStatement() {
        return statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.statement
     *
     * @param statement the value for user_summary_by_statement_type.statement
     *
     * @mbg.generated
     */
    public void setStatement(String statement) {
        this.statement = statement == null ? null : statement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.total
     *
     * @return the value of user_summary_by_statement_type.total
     *
     * @mbg.generated
     */
    public Long getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.total
     *
     * @param total the value for user_summary_by_statement_type.total
     *
     * @mbg.generated
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.rows_sent
     *
     * @return the value of user_summary_by_statement_type.rows_sent
     *
     * @mbg.generated
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.rows_sent
     *
     * @param rowsSent the value for user_summary_by_statement_type.rows_sent
     *
     * @mbg.generated
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.rows_examined
     *
     * @return the value of user_summary_by_statement_type.rows_examined
     *
     * @mbg.generated
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.rows_examined
     *
     * @param rowsExamined the value for user_summary_by_statement_type.rows_examined
     *
     * @mbg.generated
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.rows_affected
     *
     * @return the value of user_summary_by_statement_type.rows_affected
     *
     * @mbg.generated
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.rows_affected
     *
     * @param rowsAffected the value for user_summary_by_statement_type.rows_affected
     *
     * @mbg.generated
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.full_scans
     *
     * @return the value of user_summary_by_statement_type.full_scans
     *
     * @mbg.generated
     */
    public Long getFullScans() {
        return fullScans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.full_scans
     *
     * @param fullScans the value for user_summary_by_statement_type.full_scans
     *
     * @mbg.generated
     */
    public void setFullScans(Long fullScans) {
        this.fullScans = fullScans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.total_latency
     *
     * @return the value of user_summary_by_statement_type.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.total_latency
     *
     * @param totalLatency the value for user_summary_by_statement_type.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.max_latency
     *
     * @return the value of user_summary_by_statement_type.max_latency
     *
     * @mbg.generated
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.max_latency
     *
     * @param maxLatency the value for user_summary_by_statement_type.max_latency
     *
     * @mbg.generated
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_statement_type.lock_latency
     *
     * @return the value of user_summary_by_statement_type.lock_latency
     *
     * @mbg.generated
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_statement_type.lock_latency
     *
     * @param lockLatency the value for user_summary_by_statement_type.lock_latency
     *
     * @mbg.generated
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency == null ? null : lockLatency.trim();
    }
}