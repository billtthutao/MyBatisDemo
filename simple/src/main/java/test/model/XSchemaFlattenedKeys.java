package test.model;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table x$schema_flattened_keys
 */
public class XSchemaFlattenedKeys {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.table_schema
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.table_name
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.index_name
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.non_unique
     *
     * @mbg.generated
     */
    private Integer nonUnique;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.subpart_exists
     *
     * @mbg.generated
     */
    private Long subpartExists;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_flattened_keys.index_columns
     *
     * @mbg.generated
     */
    private String indexColumns;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.table_schema
     *
     * @return the value of x$schema_flattened_keys.table_schema
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.table_schema
     *
     * @param tableSchema the value for x$schema_flattened_keys.table_schema
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.table_name
     *
     * @return the value of x$schema_flattened_keys.table_name
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.table_name
     *
     * @param tableName the value for x$schema_flattened_keys.table_name
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.index_name
     *
     * @return the value of x$schema_flattened_keys.index_name
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.index_name
     *
     * @param indexName the value for x$schema_flattened_keys.index_name
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.non_unique
     *
     * @return the value of x$schema_flattened_keys.non_unique
     *
     * @mbg.generated
     */
    public Integer getNonUnique() {
        return nonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.non_unique
     *
     * @param nonUnique the value for x$schema_flattened_keys.non_unique
     *
     * @mbg.generated
     */
    public void setNonUnique(Integer nonUnique) {
        this.nonUnique = nonUnique;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.subpart_exists
     *
     * @return the value of x$schema_flattened_keys.subpart_exists
     *
     * @mbg.generated
     */
    public Long getSubpartExists() {
        return subpartExists;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.subpart_exists
     *
     * @param subpartExists the value for x$schema_flattened_keys.subpart_exists
     *
     * @mbg.generated
     */
    public void setSubpartExists(Long subpartExists) {
        this.subpartExists = subpartExists;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_flattened_keys.index_columns
     *
     * @return the value of x$schema_flattened_keys.index_columns
     *
     * @mbg.generated
     */
    public String getIndexColumns() {
        return indexColumns;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_flattened_keys.index_columns
     *
     * @param indexColumns the value for x$schema_flattened_keys.index_columns
     *
     * @mbg.generated
     */
    public void setIndexColumns(String indexColumns) {
        this.indexColumns = indexColumns == null ? null : indexColumns.trim();
    }
}