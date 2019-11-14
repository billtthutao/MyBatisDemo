package test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table statement_analysis
 */
public class StatementAnalysis {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.full_scan
     *
     * @mbg.generated
     */
    private String fullScan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.exec_count
     *
     * @mbg.generated
     */
    private Long execCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.err_count
     *
     * @mbg.generated
     */
    private Long errCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.warn_count
     *
     * @mbg.generated
     */
    private Long warnCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_sent
     *
     * @mbg.generated
     */
    private Long rowsSent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_sent_avg
     *
     * @mbg.generated
     */
    private BigDecimal rowsSentAvg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_examined
     *
     * @mbg.generated
     */
    private Long rowsExamined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_examined_avg
     *
     * @mbg.generated
     */
    private BigDecimal rowsExaminedAvg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_affected
     *
     * @mbg.generated
     */
    private Long rowsAffected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_affected_avg
     *
     * @mbg.generated
     */
    private BigDecimal rowsAffectedAvg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.tmp_tables
     *
     * @mbg.generated
     */
    private Long tmpTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.tmp_disk_tables
     *
     * @mbg.generated
     */
    private Long tmpDiskTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.rows_sorted
     *
     * @mbg.generated
     */
    private Long rowsSorted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.sort_merge_passes
     *
     * @mbg.generated
     */
    private Long sortMergePasses;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.digest
     *
     * @mbg.generated
     */
    private String digest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.first_seen
     *
     * @mbg.generated
     */
    private Date firstSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.last_seen
     *
     * @mbg.generated
     */
    private Date lastSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.max_latency
     *
     * @mbg.generated
     */
    private String maxLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.avg_latency
     *
     * @mbg.generated
     */
    private String avgLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statement_analysis.lock_latency
     *
     * @mbg.generated
     */
    private String lockLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.db
     *
     * @return the value of statement_analysis.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.db
     *
     * @param db the value for statement_analysis.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.full_scan
     *
     * @return the value of statement_analysis.full_scan
     *
     * @mbg.generated
     */
    public String getFullScan() {
        return fullScan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.full_scan
     *
     * @param fullScan the value for statement_analysis.full_scan
     *
     * @mbg.generated
     */
    public void setFullScan(String fullScan) {
        this.fullScan = fullScan == null ? null : fullScan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.exec_count
     *
     * @return the value of statement_analysis.exec_count
     *
     * @mbg.generated
     */
    public Long getExecCount() {
        return execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.exec_count
     *
     * @param execCount the value for statement_analysis.exec_count
     *
     * @mbg.generated
     */
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.err_count
     *
     * @return the value of statement_analysis.err_count
     *
     * @mbg.generated
     */
    public Long getErrCount() {
        return errCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.err_count
     *
     * @param errCount the value for statement_analysis.err_count
     *
     * @mbg.generated
     */
    public void setErrCount(Long errCount) {
        this.errCount = errCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.warn_count
     *
     * @return the value of statement_analysis.warn_count
     *
     * @mbg.generated
     */
    public Long getWarnCount() {
        return warnCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.warn_count
     *
     * @param warnCount the value for statement_analysis.warn_count
     *
     * @mbg.generated
     */
    public void setWarnCount(Long warnCount) {
        this.warnCount = warnCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_sent
     *
     * @return the value of statement_analysis.rows_sent
     *
     * @mbg.generated
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_sent
     *
     * @param rowsSent the value for statement_analysis.rows_sent
     *
     * @mbg.generated
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_sent_avg
     *
     * @return the value of statement_analysis.rows_sent_avg
     *
     * @mbg.generated
     */
    public BigDecimal getRowsSentAvg() {
        return rowsSentAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_sent_avg
     *
     * @param rowsSentAvg the value for statement_analysis.rows_sent_avg
     *
     * @mbg.generated
     */
    public void setRowsSentAvg(BigDecimal rowsSentAvg) {
        this.rowsSentAvg = rowsSentAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_examined
     *
     * @return the value of statement_analysis.rows_examined
     *
     * @mbg.generated
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_examined
     *
     * @param rowsExamined the value for statement_analysis.rows_examined
     *
     * @mbg.generated
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_examined_avg
     *
     * @return the value of statement_analysis.rows_examined_avg
     *
     * @mbg.generated
     */
    public BigDecimal getRowsExaminedAvg() {
        return rowsExaminedAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_examined_avg
     *
     * @param rowsExaminedAvg the value for statement_analysis.rows_examined_avg
     *
     * @mbg.generated
     */
    public void setRowsExaminedAvg(BigDecimal rowsExaminedAvg) {
        this.rowsExaminedAvg = rowsExaminedAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_affected
     *
     * @return the value of statement_analysis.rows_affected
     *
     * @mbg.generated
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_affected
     *
     * @param rowsAffected the value for statement_analysis.rows_affected
     *
     * @mbg.generated
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_affected_avg
     *
     * @return the value of statement_analysis.rows_affected_avg
     *
     * @mbg.generated
     */
    public BigDecimal getRowsAffectedAvg() {
        return rowsAffectedAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_affected_avg
     *
     * @param rowsAffectedAvg the value for statement_analysis.rows_affected_avg
     *
     * @mbg.generated
     */
    public void setRowsAffectedAvg(BigDecimal rowsAffectedAvg) {
        this.rowsAffectedAvg = rowsAffectedAvg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.tmp_tables
     *
     * @return the value of statement_analysis.tmp_tables
     *
     * @mbg.generated
     */
    public Long getTmpTables() {
        return tmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.tmp_tables
     *
     * @param tmpTables the value for statement_analysis.tmp_tables
     *
     * @mbg.generated
     */
    public void setTmpTables(Long tmpTables) {
        this.tmpTables = tmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.tmp_disk_tables
     *
     * @return the value of statement_analysis.tmp_disk_tables
     *
     * @mbg.generated
     */
    public Long getTmpDiskTables() {
        return tmpDiskTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.tmp_disk_tables
     *
     * @param tmpDiskTables the value for statement_analysis.tmp_disk_tables
     *
     * @mbg.generated
     */
    public void setTmpDiskTables(Long tmpDiskTables) {
        this.tmpDiskTables = tmpDiskTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.rows_sorted
     *
     * @return the value of statement_analysis.rows_sorted
     *
     * @mbg.generated
     */
    public Long getRowsSorted() {
        return rowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.rows_sorted
     *
     * @param rowsSorted the value for statement_analysis.rows_sorted
     *
     * @mbg.generated
     */
    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.sort_merge_passes
     *
     * @return the value of statement_analysis.sort_merge_passes
     *
     * @mbg.generated
     */
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.sort_merge_passes
     *
     * @param sortMergePasses the value for statement_analysis.sort_merge_passes
     *
     * @mbg.generated
     */
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.digest
     *
     * @return the value of statement_analysis.digest
     *
     * @mbg.generated
     */
    public String getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.digest
     *
     * @param digest the value for statement_analysis.digest
     *
     * @mbg.generated
     */
    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.first_seen
     *
     * @return the value of statement_analysis.first_seen
     *
     * @mbg.generated
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.first_seen
     *
     * @param firstSeen the value for statement_analysis.first_seen
     *
     * @mbg.generated
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.last_seen
     *
     * @return the value of statement_analysis.last_seen
     *
     * @mbg.generated
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.last_seen
     *
     * @param lastSeen the value for statement_analysis.last_seen
     *
     * @mbg.generated
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.query
     *
     * @return the value of statement_analysis.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.query
     *
     * @param query the value for statement_analysis.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.total_latency
     *
     * @return the value of statement_analysis.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.total_latency
     *
     * @param totalLatency the value for statement_analysis.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.max_latency
     *
     * @return the value of statement_analysis.max_latency
     *
     * @mbg.generated
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.max_latency
     *
     * @param maxLatency the value for statement_analysis.max_latency
     *
     * @mbg.generated
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.avg_latency
     *
     * @return the value of statement_analysis.avg_latency
     *
     * @mbg.generated
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.avg_latency
     *
     * @param avgLatency the value for statement_analysis.avg_latency
     *
     * @mbg.generated
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency == null ? null : avgLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statement_analysis.lock_latency
     *
     * @return the value of statement_analysis.lock_latency
     *
     * @mbg.generated
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statement_analysis.lock_latency
     *
     * @param lockLatency the value for statement_analysis.lock_latency
     *
     * @mbg.generated
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency == null ? null : lockLatency.trim();
    }
}