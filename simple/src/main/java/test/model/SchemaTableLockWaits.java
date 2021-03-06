package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table schema_table_lock_waits
 */
public class SchemaTableLockWaits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.object_schema
     *
     * @mbg.generated
     */
    private String objectSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.object_name
     *
     * @mbg.generated
     */
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_thread_id
     *
     * @mbg.generated
     */
    private Long waitingThreadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    private Long waitingPid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_lock_type
     *
     * @mbg.generated
     */
    private String waitingLockType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_lock_duration
     *
     * @mbg.generated
     */
    private String waitingLockDuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_query_secs
     *
     * @mbg.generated
     */
    private Long waitingQuerySecs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_query_rows_affected
     *
     * @mbg.generated
     */
    private Long waitingQueryRowsAffected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_query_rows_examined
     *
     * @mbg.generated
     */
    private Long waitingQueryRowsExamined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.blocking_thread_id
     *
     * @mbg.generated
     */
    private Long blockingThreadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    private Long blockingPid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.blocking_lock_type
     *
     * @mbg.generated
     */
    private String blockingLockType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.blocking_lock_duration
     *
     * @mbg.generated
     */
    private String blockingLockDuration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    private String sqlKillBlockingQuery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    private String sqlKillBlockingConnection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_account
     *
     * @mbg.generated
     */
    private String waitingAccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    private String waitingQuery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_lock_waits.blocking_account
     *
     * @mbg.generated
     */
    private String blockingAccount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.object_schema
     *
     * @return the value of schema_table_lock_waits.object_schema
     *
     * @mbg.generated
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.object_schema
     *
     * @param objectSchema the value for schema_table_lock_waits.object_schema
     *
     * @mbg.generated
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.object_name
     *
     * @return the value of schema_table_lock_waits.object_name
     *
     * @mbg.generated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.object_name
     *
     * @param objectName the value for schema_table_lock_waits.object_name
     *
     * @mbg.generated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_thread_id
     *
     * @return the value of schema_table_lock_waits.waiting_thread_id
     *
     * @mbg.generated
     */
    public Long getWaitingThreadId() {
        return waitingThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_thread_id
     *
     * @param waitingThreadId the value for schema_table_lock_waits.waiting_thread_id
     *
     * @mbg.generated
     */
    public void setWaitingThreadId(Long waitingThreadId) {
        this.waitingThreadId = waitingThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_pid
     *
     * @return the value of schema_table_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    public Long getWaitingPid() {
        return waitingPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_pid
     *
     * @param waitingPid the value for schema_table_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    public void setWaitingPid(Long waitingPid) {
        this.waitingPid = waitingPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_lock_type
     *
     * @return the value of schema_table_lock_waits.waiting_lock_type
     *
     * @mbg.generated
     */
    public String getWaitingLockType() {
        return waitingLockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_lock_type
     *
     * @param waitingLockType the value for schema_table_lock_waits.waiting_lock_type
     *
     * @mbg.generated
     */
    public void setWaitingLockType(String waitingLockType) {
        this.waitingLockType = waitingLockType == null ? null : waitingLockType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_lock_duration
     *
     * @return the value of schema_table_lock_waits.waiting_lock_duration
     *
     * @mbg.generated
     */
    public String getWaitingLockDuration() {
        return waitingLockDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_lock_duration
     *
     * @param waitingLockDuration the value for schema_table_lock_waits.waiting_lock_duration
     *
     * @mbg.generated
     */
    public void setWaitingLockDuration(String waitingLockDuration) {
        this.waitingLockDuration = waitingLockDuration == null ? null : waitingLockDuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_query_secs
     *
     * @return the value of schema_table_lock_waits.waiting_query_secs
     *
     * @mbg.generated
     */
    public Long getWaitingQuerySecs() {
        return waitingQuerySecs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_query_secs
     *
     * @param waitingQuerySecs the value for schema_table_lock_waits.waiting_query_secs
     *
     * @mbg.generated
     */
    public void setWaitingQuerySecs(Long waitingQuerySecs) {
        this.waitingQuerySecs = waitingQuerySecs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_query_rows_affected
     *
     * @return the value of schema_table_lock_waits.waiting_query_rows_affected
     *
     * @mbg.generated
     */
    public Long getWaitingQueryRowsAffected() {
        return waitingQueryRowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_query_rows_affected
     *
     * @param waitingQueryRowsAffected the value for schema_table_lock_waits.waiting_query_rows_affected
     *
     * @mbg.generated
     */
    public void setWaitingQueryRowsAffected(Long waitingQueryRowsAffected) {
        this.waitingQueryRowsAffected = waitingQueryRowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_query_rows_examined
     *
     * @return the value of schema_table_lock_waits.waiting_query_rows_examined
     *
     * @mbg.generated
     */
    public Long getWaitingQueryRowsExamined() {
        return waitingQueryRowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_query_rows_examined
     *
     * @param waitingQueryRowsExamined the value for schema_table_lock_waits.waiting_query_rows_examined
     *
     * @mbg.generated
     */
    public void setWaitingQueryRowsExamined(Long waitingQueryRowsExamined) {
        this.waitingQueryRowsExamined = waitingQueryRowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.blocking_thread_id
     *
     * @return the value of schema_table_lock_waits.blocking_thread_id
     *
     * @mbg.generated
     */
    public Long getBlockingThreadId() {
        return blockingThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.blocking_thread_id
     *
     * @param blockingThreadId the value for schema_table_lock_waits.blocking_thread_id
     *
     * @mbg.generated
     */
    public void setBlockingThreadId(Long blockingThreadId) {
        this.blockingThreadId = blockingThreadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.blocking_pid
     *
     * @return the value of schema_table_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    public Long getBlockingPid() {
        return blockingPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.blocking_pid
     *
     * @param blockingPid the value for schema_table_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    public void setBlockingPid(Long blockingPid) {
        this.blockingPid = blockingPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.blocking_lock_type
     *
     * @return the value of schema_table_lock_waits.blocking_lock_type
     *
     * @mbg.generated
     */
    public String getBlockingLockType() {
        return blockingLockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.blocking_lock_type
     *
     * @param blockingLockType the value for schema_table_lock_waits.blocking_lock_type
     *
     * @mbg.generated
     */
    public void setBlockingLockType(String blockingLockType) {
        this.blockingLockType = blockingLockType == null ? null : blockingLockType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.blocking_lock_duration
     *
     * @return the value of schema_table_lock_waits.blocking_lock_duration
     *
     * @mbg.generated
     */
    public String getBlockingLockDuration() {
        return blockingLockDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.blocking_lock_duration
     *
     * @param blockingLockDuration the value for schema_table_lock_waits.blocking_lock_duration
     *
     * @mbg.generated
     */
    public void setBlockingLockDuration(String blockingLockDuration) {
        this.blockingLockDuration = blockingLockDuration == null ? null : blockingLockDuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.sql_kill_blocking_query
     *
     * @return the value of schema_table_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    public String getSqlKillBlockingQuery() {
        return sqlKillBlockingQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.sql_kill_blocking_query
     *
     * @param sqlKillBlockingQuery the value for schema_table_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    public void setSqlKillBlockingQuery(String sqlKillBlockingQuery) {
        this.sqlKillBlockingQuery = sqlKillBlockingQuery == null ? null : sqlKillBlockingQuery.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.sql_kill_blocking_connection
     *
     * @return the value of schema_table_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    public String getSqlKillBlockingConnection() {
        return sqlKillBlockingConnection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.sql_kill_blocking_connection
     *
     * @param sqlKillBlockingConnection the value for schema_table_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    public void setSqlKillBlockingConnection(String sqlKillBlockingConnection) {
        this.sqlKillBlockingConnection = sqlKillBlockingConnection == null ? null : sqlKillBlockingConnection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_account
     *
     * @return the value of schema_table_lock_waits.waiting_account
     *
     * @mbg.generated
     */
    public String getWaitingAccount() {
        return waitingAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_account
     *
     * @param waitingAccount the value for schema_table_lock_waits.waiting_account
     *
     * @mbg.generated
     */
    public void setWaitingAccount(String waitingAccount) {
        this.waitingAccount = waitingAccount == null ? null : waitingAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.waiting_query
     *
     * @return the value of schema_table_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    public String getWaitingQuery() {
        return waitingQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.waiting_query
     *
     * @param waitingQuery the value for schema_table_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    public void setWaitingQuery(String waitingQuery) {
        this.waitingQuery = waitingQuery == null ? null : waitingQuery.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_lock_waits.blocking_account
     *
     * @return the value of schema_table_lock_waits.blocking_account
     *
     * @mbg.generated
     */
    public String getBlockingAccount() {
        return blockingAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_lock_waits.blocking_account
     *
     * @param blockingAccount the value for schema_table_lock_waits.blocking_account
     *
     * @mbg.generated
     */
    public void setBlockingAccount(String blockingAccount) {
        this.blockingAccount = blockingAccount == null ? null : blockingAccount.trim();
    }
}