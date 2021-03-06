package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table io_global_by_file_by_bytes
 */
public class IoGlobalByFileByBytes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.file
     *
     * @mbg.generated
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.count_read
     *
     * @mbg.generated
     */
    private Long countRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.count_write
     *
     * @mbg.generated
     */
    private Long countWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.write_pct
     *
     * @mbg.generated
     */
    private BigDecimal writePct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.total_read
     *
     * @mbg.generated
     */
    private String totalRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.avg_read
     *
     * @mbg.generated
     */
    private String avgRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.total_written
     *
     * @mbg.generated
     */
    private String totalWritten;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.avg_write
     *
     * @mbg.generated
     */
    private String avgWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_bytes.total
     *
     * @mbg.generated
     */
    private String total;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.file
     *
     * @return the value of io_global_by_file_by_bytes.file
     *
     * @mbg.generated
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.file
     *
     * @param file the value for io_global_by_file_by_bytes.file
     *
     * @mbg.generated
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.count_read
     *
     * @return the value of io_global_by_file_by_bytes.count_read
     *
     * @mbg.generated
     */
    public Long getCountRead() {
        return countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.count_read
     *
     * @param countRead the value for io_global_by_file_by_bytes.count_read
     *
     * @mbg.generated
     */
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.count_write
     *
     * @return the value of io_global_by_file_by_bytes.count_write
     *
     * @mbg.generated
     */
    public Long getCountWrite() {
        return countWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.count_write
     *
     * @param countWrite the value for io_global_by_file_by_bytes.count_write
     *
     * @mbg.generated
     */
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.write_pct
     *
     * @return the value of io_global_by_file_by_bytes.write_pct
     *
     * @mbg.generated
     */
    public BigDecimal getWritePct() {
        return writePct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.write_pct
     *
     * @param writePct the value for io_global_by_file_by_bytes.write_pct
     *
     * @mbg.generated
     */
    public void setWritePct(BigDecimal writePct) {
        this.writePct = writePct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.total_read
     *
     * @return the value of io_global_by_file_by_bytes.total_read
     *
     * @mbg.generated
     */
    public String getTotalRead() {
        return totalRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.total_read
     *
     * @param totalRead the value for io_global_by_file_by_bytes.total_read
     *
     * @mbg.generated
     */
    public void setTotalRead(String totalRead) {
        this.totalRead = totalRead == null ? null : totalRead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.avg_read
     *
     * @return the value of io_global_by_file_by_bytes.avg_read
     *
     * @mbg.generated
     */
    public String getAvgRead() {
        return avgRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.avg_read
     *
     * @param avgRead the value for io_global_by_file_by_bytes.avg_read
     *
     * @mbg.generated
     */
    public void setAvgRead(String avgRead) {
        this.avgRead = avgRead == null ? null : avgRead.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.total_written
     *
     * @return the value of io_global_by_file_by_bytes.total_written
     *
     * @mbg.generated
     */
    public String getTotalWritten() {
        return totalWritten;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.total_written
     *
     * @param totalWritten the value for io_global_by_file_by_bytes.total_written
     *
     * @mbg.generated
     */
    public void setTotalWritten(String totalWritten) {
        this.totalWritten = totalWritten == null ? null : totalWritten.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.avg_write
     *
     * @return the value of io_global_by_file_by_bytes.avg_write
     *
     * @mbg.generated
     */
    public String getAvgWrite() {
        return avgWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.avg_write
     *
     * @param avgWrite the value for io_global_by_file_by_bytes.avg_write
     *
     * @mbg.generated
     */
    public void setAvgWrite(String avgWrite) {
        this.avgWrite = avgWrite == null ? null : avgWrite.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_bytes.total
     *
     * @return the value of io_global_by_file_by_bytes.total
     *
     * @mbg.generated
     */
    public String getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_bytes.total
     *
     * @param total the value for io_global_by_file_by_bytes.total
     *
     * @mbg.generated
     */
    public void setTotal(String total) {
        this.total = total == null ? null : total.trim();
    }
}