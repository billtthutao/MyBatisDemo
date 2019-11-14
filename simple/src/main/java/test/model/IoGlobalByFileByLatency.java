package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table io_global_by_file_by_latency
 */
public class IoGlobalByFileByLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.file
     *
     * @mbg.generated
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.total
     *
     * @mbg.generated
     */
    private Long total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.count_read
     *
     * @mbg.generated
     */
    private Long countRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.count_write
     *
     * @mbg.generated
     */
    private Long countWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.count_misc
     *
     * @mbg.generated
     */
    private Long countMisc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    private String readLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    private String writeLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    private String miscLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.file
     *
     * @return the value of io_global_by_file_by_latency.file
     *
     * @mbg.generated
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.file
     *
     * @param file the value for io_global_by_file_by_latency.file
     *
     * @mbg.generated
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.total
     *
     * @return the value of io_global_by_file_by_latency.total
     *
     * @mbg.generated
     */
    public Long getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.total
     *
     * @param total the value for io_global_by_file_by_latency.total
     *
     * @mbg.generated
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.count_read
     *
     * @return the value of io_global_by_file_by_latency.count_read
     *
     * @mbg.generated
     */
    public Long getCountRead() {
        return countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.count_read
     *
     * @param countRead the value for io_global_by_file_by_latency.count_read
     *
     * @mbg.generated
     */
    public void setCountRead(Long countRead) {
        this.countRead = countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.count_write
     *
     * @return the value of io_global_by_file_by_latency.count_write
     *
     * @mbg.generated
     */
    public Long getCountWrite() {
        return countWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.count_write
     *
     * @param countWrite the value for io_global_by_file_by_latency.count_write
     *
     * @mbg.generated
     */
    public void setCountWrite(Long countWrite) {
        this.countWrite = countWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.count_misc
     *
     * @return the value of io_global_by_file_by_latency.count_misc
     *
     * @mbg.generated
     */
    public Long getCountMisc() {
        return countMisc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.count_misc
     *
     * @param countMisc the value for io_global_by_file_by_latency.count_misc
     *
     * @mbg.generated
     */
    public void setCountMisc(Long countMisc) {
        this.countMisc = countMisc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.total_latency
     *
     * @return the value of io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.total_latency
     *
     * @param totalLatency the value for io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.read_latency
     *
     * @return the value of io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    public String getReadLatency() {
        return readLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.read_latency
     *
     * @param readLatency the value for io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    public void setReadLatency(String readLatency) {
        this.readLatency = readLatency == null ? null : readLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.write_latency
     *
     * @return the value of io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    public String getWriteLatency() {
        return writeLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.write_latency
     *
     * @param writeLatency the value for io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    public void setWriteLatency(String writeLatency) {
        this.writeLatency = writeLatency == null ? null : writeLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.misc_latency
     *
     * @return the value of io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    public String getMiscLatency() {
        return miscLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.misc_latency
     *
     * @param miscLatency the value for io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    public void setMiscLatency(String miscLatency) {
        this.miscLatency = miscLatency == null ? null : miscLatency.trim();
    }
}