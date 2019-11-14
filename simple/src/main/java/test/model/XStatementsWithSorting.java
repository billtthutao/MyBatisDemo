package test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table x$statements_with_sorting
 */
public class XStatementsWithSorting {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.exec_count
     *
     * @mbg.generated
     */
    private Long execCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.total_latency
     *
     * @mbg.generated
     */
    private Long totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.sort_merge_passes
     *
     * @mbg.generated
     */
    private Long sortMergePasses;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.avg_sort_merges
     *
     * @mbg.generated
     */
    private BigDecimal avgSortMerges;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.sorts_using_scans
     *
     * @mbg.generated
     */
    private Long sortsUsingScans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.sort_using_range
     *
     * @mbg.generated
     */
    private Long sortUsingRange;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.rows_sorted
     *
     * @mbg.generated
     */
    private Long rowsSorted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.avg_rows_sorted
     *
     * @mbg.generated
     */
    private BigDecimal avgRowsSorted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.first_seen
     *
     * @mbg.generated
     */
    private Date firstSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.last_seen
     *
     * @mbg.generated
     */
    private Date lastSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.digest
     *
     * @mbg.generated
     */
    private String digest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$statements_with_sorting.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.db
     *
     * @return the value of x$statements_with_sorting.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.db
     *
     * @param db the value for x$statements_with_sorting.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.exec_count
     *
     * @return the value of x$statements_with_sorting.exec_count
     *
     * @mbg.generated
     */
    public Long getExecCount() {
        return execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.exec_count
     *
     * @param execCount the value for x$statements_with_sorting.exec_count
     *
     * @mbg.generated
     */
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.total_latency
     *
     * @return the value of x$statements_with_sorting.total_latency
     *
     * @mbg.generated
     */
    public Long getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.total_latency
     *
     * @param totalLatency the value for x$statements_with_sorting.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(Long totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.sort_merge_passes
     *
     * @return the value of x$statements_with_sorting.sort_merge_passes
     *
     * @mbg.generated
     */
    public Long getSortMergePasses() {
        return sortMergePasses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.sort_merge_passes
     *
     * @param sortMergePasses the value for x$statements_with_sorting.sort_merge_passes
     *
     * @mbg.generated
     */
    public void setSortMergePasses(Long sortMergePasses) {
        this.sortMergePasses = sortMergePasses;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.avg_sort_merges
     *
     * @return the value of x$statements_with_sorting.avg_sort_merges
     *
     * @mbg.generated
     */
    public BigDecimal getAvgSortMerges() {
        return avgSortMerges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.avg_sort_merges
     *
     * @param avgSortMerges the value for x$statements_with_sorting.avg_sort_merges
     *
     * @mbg.generated
     */
    public void setAvgSortMerges(BigDecimal avgSortMerges) {
        this.avgSortMerges = avgSortMerges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.sorts_using_scans
     *
     * @return the value of x$statements_with_sorting.sorts_using_scans
     *
     * @mbg.generated
     */
    public Long getSortsUsingScans() {
        return sortsUsingScans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.sorts_using_scans
     *
     * @param sortsUsingScans the value for x$statements_with_sorting.sorts_using_scans
     *
     * @mbg.generated
     */
    public void setSortsUsingScans(Long sortsUsingScans) {
        this.sortsUsingScans = sortsUsingScans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.sort_using_range
     *
     * @return the value of x$statements_with_sorting.sort_using_range
     *
     * @mbg.generated
     */
    public Long getSortUsingRange() {
        return sortUsingRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.sort_using_range
     *
     * @param sortUsingRange the value for x$statements_with_sorting.sort_using_range
     *
     * @mbg.generated
     */
    public void setSortUsingRange(Long sortUsingRange) {
        this.sortUsingRange = sortUsingRange;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.rows_sorted
     *
     * @return the value of x$statements_with_sorting.rows_sorted
     *
     * @mbg.generated
     */
    public Long getRowsSorted() {
        return rowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.rows_sorted
     *
     * @param rowsSorted the value for x$statements_with_sorting.rows_sorted
     *
     * @mbg.generated
     */
    public void setRowsSorted(Long rowsSorted) {
        this.rowsSorted = rowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.avg_rows_sorted
     *
     * @return the value of x$statements_with_sorting.avg_rows_sorted
     *
     * @mbg.generated
     */
    public BigDecimal getAvgRowsSorted() {
        return avgRowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.avg_rows_sorted
     *
     * @param avgRowsSorted the value for x$statements_with_sorting.avg_rows_sorted
     *
     * @mbg.generated
     */
    public void setAvgRowsSorted(BigDecimal avgRowsSorted) {
        this.avgRowsSorted = avgRowsSorted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.first_seen
     *
     * @return the value of x$statements_with_sorting.first_seen
     *
     * @mbg.generated
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.first_seen
     *
     * @param firstSeen the value for x$statements_with_sorting.first_seen
     *
     * @mbg.generated
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.last_seen
     *
     * @return the value of x$statements_with_sorting.last_seen
     *
     * @mbg.generated
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.last_seen
     *
     * @param lastSeen the value for x$statements_with_sorting.last_seen
     *
     * @mbg.generated
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.digest
     *
     * @return the value of x$statements_with_sorting.digest
     *
     * @mbg.generated
     */
    public String getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.digest
     *
     * @param digest the value for x$statements_with_sorting.digest
     *
     * @mbg.generated
     */
    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$statements_with_sorting.query
     *
     * @return the value of x$statements_with_sorting.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$statements_with_sorting.query
     *
     * @param query the value for x$statements_with_sorting.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }
}