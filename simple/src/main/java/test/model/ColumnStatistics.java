package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table COLUMN_STATISTICS
 */
public class ColumnStatistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_STATISTICS.SCHEMA_NAME
     *
     * @mbg.generated
     */
    private String schemaName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_STATISTICS.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_STATISTICS.COLUMN_NAME
     *
     * @mbg.generated
     */
    private String columnName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLUMN_STATISTICS.HISTOGRAM
     *
     * @mbg.generated
     */
    private String histogram;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_STATISTICS.SCHEMA_NAME
     *
     * @return the value of COLUMN_STATISTICS.SCHEMA_NAME
     *
     * @mbg.generated
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_STATISTICS.SCHEMA_NAME
     *
     * @param schemaName the value for COLUMN_STATISTICS.SCHEMA_NAME
     *
     * @mbg.generated
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName == null ? null : schemaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_STATISTICS.TABLE_NAME
     *
     * @return the value of COLUMN_STATISTICS.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_STATISTICS.TABLE_NAME
     *
     * @param tableName the value for COLUMN_STATISTICS.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_STATISTICS.COLUMN_NAME
     *
     * @return the value of COLUMN_STATISTICS.COLUMN_NAME
     *
     * @mbg.generated
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_STATISTICS.COLUMN_NAME
     *
     * @param columnName the value for COLUMN_STATISTICS.COLUMN_NAME
     *
     * @mbg.generated
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLUMN_STATISTICS.HISTOGRAM
     *
     * @return the value of COLUMN_STATISTICS.HISTOGRAM
     *
     * @mbg.generated
     */
    public String getHistogram() {
        return histogram;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLUMN_STATISTICS.HISTOGRAM
     *
     * @param histogram the value for COLUMN_STATISTICS.HISTOGRAM
     *
     * @mbg.generated
     */
    public void setHistogram(String histogram) {
        this.histogram = histogram == null ? null : histogram.trim();
    }
}