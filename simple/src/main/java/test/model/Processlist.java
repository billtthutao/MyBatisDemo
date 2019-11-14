package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table processlist
 */
public class Processlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.thd_id
     *
     * @mbg.generated
     */
    private Long thdId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.conn_id
     *
     * @mbg.generated
     */
    private Long connId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.command
     *
     * @mbg.generated
     */
    private String command;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.time
     *
     * @mbg.generated
     */
    private Long time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.progress
     *
     * @mbg.generated
     */
    private BigDecimal progress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.rows_examined
     *
     * @mbg.generated
     */
    private Long rowsExamined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.rows_sent
     *
     * @mbg.generated
     */
    private Long rowsSent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.rows_affected
     *
     * @mbg.generated
     */
    private Long rowsAffected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.tmp_tables
     *
     * @mbg.generated
     */
    private Long tmpTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    private Long tmpDiskTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.full_scan
     *
     * @mbg.generated
     */
    private String fullScan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.last_wait
     *
     * @mbg.generated
     */
    private String lastWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.trx_state
     *
     * @mbg.generated
     */
    private String trxState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.trx_autocommit
     *
     * @mbg.generated
     */
    private String trxAutocommit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.pid
     *
     * @mbg.generated
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.program_name
     *
     * @mbg.generated
     */
    private String programName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.current_statement
     *
     * @mbg.generated
     */
    private String currentStatement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.statement_latency
     *
     * @mbg.generated
     */
    private String statementLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.lock_latency
     *
     * @mbg.generated
     */
    private String lockLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.last_statement
     *
     * @mbg.generated
     */
    private String lastStatement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.last_statement_latency
     *
     * @mbg.generated
     */
    private String lastStatementLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.current_memory
     *
     * @mbg.generated
     */
    private String currentMemory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.last_wait_latency
     *
     * @mbg.generated
     */
    private String lastWaitLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column processlist.trx_latency
     *
     * @mbg.generated
     */
    private String trxLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.thd_id
     *
     * @return the value of processlist.thd_id
     *
     * @mbg.generated
     */
    public Long getThdId() {
        return thdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.thd_id
     *
     * @param thdId the value for processlist.thd_id
     *
     * @mbg.generated
     */
    public void setThdId(Long thdId) {
        this.thdId = thdId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.conn_id
     *
     * @return the value of processlist.conn_id
     *
     * @mbg.generated
     */
    public Long getConnId() {
        return connId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.conn_id
     *
     * @param connId the value for processlist.conn_id
     *
     * @mbg.generated
     */
    public void setConnId(Long connId) {
        this.connId = connId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.user
     *
     * @return the value of processlist.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.user
     *
     * @param user the value for processlist.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.db
     *
     * @return the value of processlist.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.db
     *
     * @param db the value for processlist.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.command
     *
     * @return the value of processlist.command
     *
     * @mbg.generated
     */
    public String getCommand() {
        return command;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.command
     *
     * @param command the value for processlist.command
     *
     * @mbg.generated
     */
    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.state
     *
     * @return the value of processlist.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.state
     *
     * @param state the value for processlist.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.time
     *
     * @return the value of processlist.time
     *
     * @mbg.generated
     */
    public Long getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.time
     *
     * @param time the value for processlist.time
     *
     * @mbg.generated
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.progress
     *
     * @return the value of processlist.progress
     *
     * @mbg.generated
     */
    public BigDecimal getProgress() {
        return progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.progress
     *
     * @param progress the value for processlist.progress
     *
     * @mbg.generated
     */
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.rows_examined
     *
     * @return the value of processlist.rows_examined
     *
     * @mbg.generated
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.rows_examined
     *
     * @param rowsExamined the value for processlist.rows_examined
     *
     * @mbg.generated
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.rows_sent
     *
     * @return the value of processlist.rows_sent
     *
     * @mbg.generated
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.rows_sent
     *
     * @param rowsSent the value for processlist.rows_sent
     *
     * @mbg.generated
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.rows_affected
     *
     * @return the value of processlist.rows_affected
     *
     * @mbg.generated
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.rows_affected
     *
     * @param rowsAffected the value for processlist.rows_affected
     *
     * @mbg.generated
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.tmp_tables
     *
     * @return the value of processlist.tmp_tables
     *
     * @mbg.generated
     */
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.tmp_tables
     *
     * @param tmpTables the value for processlist.tmp_tables
     *
     * @mbg.generated
     */
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.tmp_disk_tables
     *
     * @return the value of processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.tmp_disk_tables
     *
     * @param tmpDiskTables the value for processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.full_scan
     *
     * @return the value of processlist.full_scan
     *
     * @mbg.generated
     */
    public String getFullScan() {
        return fullScan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.full_scan
     *
     * @param fullScan the value for processlist.full_scan
     *
     * @mbg.generated
     */
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan == null ? null : fullScan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.last_wait
     *
     * @return the value of processlist.last_wait
     *
     * @mbg.generated
     */
    public String getLastWait() {
        return lastWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.last_wait
     *
     * @param lastWait the value for processlist.last_wait
     *
     * @mbg.generated
     */
    public void setLastWait(String lastWait) {
        this.lastWait = lastWait == null ? null : lastWait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.source
     *
     * @return the value of processlist.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.source
     *
     * @param source the value for processlist.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.trx_state
     *
     * @return the value of processlist.trx_state
     *
     * @mbg.generated
     */
    public String getTrxState() {
        return trxState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.trx_state
     *
     * @param trxState the value for processlist.trx_state
     *
     * @mbg.generated
     */
    public void setTrxState(String trxState) {
        this.trxState = trxState == null ? null : trxState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.trx_autocommit
     *
     * @return the value of processlist.trx_autocommit
     *
     * @mbg.generated
     */
    public String getTrxAutocommit() {
        return trxAutocommit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.trx_autocommit
     *
     * @param trxAutocommit the value for processlist.trx_autocommit
     *
     * @mbg.generated
     */
    public void setTrxAutocommit(String trxAutocommit) {
        this.trxAutocommit = trxAutocommit == null ? null : trxAutocommit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.pid
     *
     * @return the value of processlist.pid
     *
     * @mbg.generated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.pid
     *
     * @param pid the value for processlist.pid
     *
     * @mbg.generated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.program_name
     *
     * @return the value of processlist.program_name
     *
     * @mbg.generated
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.program_name
     *
     * @param programName the value for processlist.program_name
     *
     * @mbg.generated
     */
    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.current_statement
     *
     * @return the value of processlist.current_statement
     *
     * @mbg.generated
     */
    public String getCurrentStatement() {
        return currentStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.current_statement
     *
     * @param currentStatement the value for processlist.current_statement
     *
     * @mbg.generated
     */
    public void setCurrentStatement(String currentStatement) {
        this.currentStatement = currentStatement == null ? null : currentStatement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.statement_latency
     *
     * @return the value of processlist.statement_latency
     *
     * @mbg.generated
     */
    public String getStatementLatency() {
        return statementLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.statement_latency
     *
     * @param statementLatency the value for processlist.statement_latency
     *
     * @mbg.generated
     */
    public void setStatementLatency(String statementLatency) {
        this.statementLatency = statementLatency == null ? null : statementLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.lock_latency
     *
     * @return the value of processlist.lock_latency
     *
     * @mbg.generated
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.lock_latency
     *
     * @param lockLatency the value for processlist.lock_latency
     *
     * @mbg.generated
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency == null ? null : lockLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.last_statement
     *
     * @return the value of processlist.last_statement
     *
     * @mbg.generated
     */
    public String getLastStatement() {
        return lastStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.last_statement
     *
     * @param lastStatement the value for processlist.last_statement
     *
     * @mbg.generated
     */
    public void setLastStatement(String lastStatement) {
        this.lastStatement = lastStatement == null ? null : lastStatement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.last_statement_latency
     *
     * @return the value of processlist.last_statement_latency
     *
     * @mbg.generated
     */
    public String getLastStatementLatency() {
        return lastStatementLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.last_statement_latency
     *
     * @param lastStatementLatency the value for processlist.last_statement_latency
     *
     * @mbg.generated
     */
    public void setLastStatementLatency(String lastStatementLatency) {
        this.lastStatementLatency = lastStatementLatency == null ? null : lastStatementLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.current_memory
     *
     * @return the value of processlist.current_memory
     *
     * @mbg.generated
     */
    public String getCurrentMemory() {
        return currentMemory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.current_memory
     *
     * @param currentMemory the value for processlist.current_memory
     *
     * @mbg.generated
     */
    public void setCurrentMemory(String currentMemory) {
        this.currentMemory = currentMemory == null ? null : currentMemory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.last_wait_latency
     *
     * @return the value of processlist.last_wait_latency
     *
     * @mbg.generated
     */
    public String getLastWaitLatency() {
        return lastWaitLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.last_wait_latency
     *
     * @param lastWaitLatency the value for processlist.last_wait_latency
     *
     * @mbg.generated
     */
    public void setLastWaitLatency(String lastWaitLatency) {
        this.lastWaitLatency = lastWaitLatency == null ? null : lastWaitLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column processlist.trx_latency
     *
     * @return the value of processlist.trx_latency
     *
     * @mbg.generated
     */
    public String getTrxLatency() {
        return trxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column processlist.trx_latency
     *
     * @param trxLatency the value for processlist.trx_latency
     *
     * @mbg.generated
     */
    public void setTrxLatency(String trxLatency) {
        this.trxLatency = trxLatency == null ? null : trxLatency.trim();
    }
}