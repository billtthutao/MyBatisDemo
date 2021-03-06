package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table schema_table_statistics
 */
public class SchemaTableStatistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    private Long rowsFetched;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    private Long rowsInserted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    private Long rowsUpdated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    private Long rowsDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    private BigDecimal ioReadRequests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    private BigDecimal ioWriteRequests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    private BigDecimal ioMiscRequests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    private String fetchLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    private String insertLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    private String updateLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    private String deleteLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    private String ioRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    private String ioReadLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    private String ioWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    private String ioWriteLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    private String ioMiscLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.table_schema
     *
     * @return the value of schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.table_schema
     *
     * @param tableSchema the value for schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.table_name
     *
     * @return the value of schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.table_name
     *
     * @param tableName the value for schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.rows_fetched
     *
     * @return the value of schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    public Long getRowsFetched() {
        return rowsFetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.rows_fetched
     *
     * @param rowsFetched the value for schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    public void setRowsFetched(Long rowsFetched) {
        this.rowsFetched = rowsFetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.rows_inserted
     *
     * @return the value of schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    public Long getRowsInserted() {
        return rowsInserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.rows_inserted
     *
     * @param rowsInserted the value for schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    public void setRowsInserted(Long rowsInserted) {
        this.rowsInserted = rowsInserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.rows_updated
     *
     * @return the value of schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    public Long getRowsUpdated() {
        return rowsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.rows_updated
     *
     * @param rowsUpdated the value for schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    public void setRowsUpdated(Long rowsUpdated) {
        this.rowsUpdated = rowsUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.rows_deleted
     *
     * @return the value of schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    public Long getRowsDeleted() {
        return rowsDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.rows_deleted
     *
     * @param rowsDeleted the value for schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    public void setRowsDeleted(Long rowsDeleted) {
        this.rowsDeleted = rowsDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_read_requests
     *
     * @return the value of schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIoReadRequests() {
        return ioReadRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_read_requests
     *
     * @param ioReadRequests the value for schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    public void setIoReadRequests(BigDecimal ioReadRequests) {
        this.ioReadRequests = ioReadRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_write_requests
     *
     * @return the value of schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIoWriteRequests() {
        return ioWriteRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_write_requests
     *
     * @param ioWriteRequests the value for schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    public void setIoWriteRequests(BigDecimal ioWriteRequests) {
        this.ioWriteRequests = ioWriteRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_misc_requests
     *
     * @return the value of schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIoMiscRequests() {
        return ioMiscRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_misc_requests
     *
     * @param ioMiscRequests the value for schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    public void setIoMiscRequests(BigDecimal ioMiscRequests) {
        this.ioMiscRequests = ioMiscRequests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.total_latency
     *
     * @return the value of schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.total_latency
     *
     * @param totalLatency the value for schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.fetch_latency
     *
     * @return the value of schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    public String getFetchLatency() {
        return fetchLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.fetch_latency
     *
     * @param fetchLatency the value for schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    public void setFetchLatency(String fetchLatency) {
        this.fetchLatency = fetchLatency == null ? null : fetchLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.insert_latency
     *
     * @return the value of schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    public String getInsertLatency() {
        return insertLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.insert_latency
     *
     * @param insertLatency the value for schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    public void setInsertLatency(String insertLatency) {
        this.insertLatency = insertLatency == null ? null : insertLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.update_latency
     *
     * @return the value of schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    public String getUpdateLatency() {
        return updateLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.update_latency
     *
     * @param updateLatency the value for schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    public void setUpdateLatency(String updateLatency) {
        this.updateLatency = updateLatency == null ? null : updateLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.delete_latency
     *
     * @return the value of schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    public String getDeleteLatency() {
        return deleteLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.delete_latency
     *
     * @param deleteLatency the value for schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    public void setDeleteLatency(String deleteLatency) {
        this.deleteLatency = deleteLatency == null ? null : deleteLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_read
     *
     * @return the value of schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    public String getIoRead() {
        return ioRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_read
     *
     * @param ioRead the value for schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    public void setIoRead(String ioRead) {
        this.ioRead = ioRead == null ? null : ioRead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_read_latency
     *
     * @return the value of schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    public String getIoReadLatency() {
        return ioReadLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_read_latency
     *
     * @param ioReadLatency the value for schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    public void setIoReadLatency(String ioReadLatency) {
        this.ioReadLatency = ioReadLatency == null ? null : ioReadLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_write
     *
     * @return the value of schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    public String getIoWrite() {
        return ioWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_write
     *
     * @param ioWrite the value for schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    public void setIoWrite(String ioWrite) {
        this.ioWrite = ioWrite == null ? null : ioWrite.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_write_latency
     *
     * @return the value of schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    public String getIoWriteLatency() {
        return ioWriteLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_write_latency
     *
     * @param ioWriteLatency the value for schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    public void setIoWriteLatency(String ioWriteLatency) {
        this.ioWriteLatency = ioWriteLatency == null ? null : ioWriteLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column schema_table_statistics.io_misc_latency
     *
     * @return the value of schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    public String getIoMiscLatency() {
        return ioMiscLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column schema_table_statistics.io_misc_latency
     *
     * @param ioMiscLatency the value for schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    public void setIoMiscLatency(String ioMiscLatency) {
        this.ioMiscLatency = ioMiscLatency == null ? null : ioMiscLatency.trim();
    }
}