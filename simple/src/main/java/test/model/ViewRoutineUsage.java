package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table VIEW_ROUTINE_USAGE
 */
public class ViewRoutineUsage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.TABLE_CATALOG
     *
     * @mbg.generated
     */
    private String tableCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG
     *
     * @mbg.generated
     */
    private String specificCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA
     *
     * @mbg.generated
     */
    private String specificSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column VIEW_ROUTINE_USAGE.SPECIFIC_NAME
     *
     * @mbg.generated
     */
    private String specificName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.TABLE_CATALOG
     *
     * @return the value of VIEW_ROUTINE_USAGE.TABLE_CATALOG
     *
     * @mbg.generated
     */
    public String getTableCatalog() {
        return tableCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.TABLE_CATALOG
     *
     * @param tableCatalog the value for VIEW_ROUTINE_USAGE.TABLE_CATALOG
     *
     * @mbg.generated
     */
    public void setTableCatalog(String tableCatalog) {
        this.tableCatalog = tableCatalog == null ? null : tableCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.TABLE_SCHEMA
     *
     * @return the value of VIEW_ROUTINE_USAGE.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.TABLE_SCHEMA
     *
     * @param tableSchema the value for VIEW_ROUTINE_USAGE.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.TABLE_NAME
     *
     * @return the value of VIEW_ROUTINE_USAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.TABLE_NAME
     *
     * @param tableName the value for VIEW_ROUTINE_USAGE.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG
     *
     * @return the value of VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG
     *
     * @mbg.generated
     */
    public String getSpecificCatalog() {
        return specificCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG
     *
     * @param specificCatalog the value for VIEW_ROUTINE_USAGE.SPECIFIC_CATALOG
     *
     * @mbg.generated
     */
    public void setSpecificCatalog(String specificCatalog) {
        this.specificCatalog = specificCatalog == null ? null : specificCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA
     *
     * @return the value of VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA
     *
     * @mbg.generated
     */
    public String getSpecificSchema() {
        return specificSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA
     *
     * @param specificSchema the value for VIEW_ROUTINE_USAGE.SPECIFIC_SCHEMA
     *
     * @mbg.generated
     */
    public void setSpecificSchema(String specificSchema) {
        this.specificSchema = specificSchema == null ? null : specificSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_NAME
     *
     * @return the value of VIEW_ROUTINE_USAGE.SPECIFIC_NAME
     *
     * @mbg.generated
     */
    public String getSpecificName() {
        return specificName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column VIEW_ROUTINE_USAGE.SPECIFIC_NAME
     *
     * @param specificName the value for VIEW_ROUTINE_USAGE.SPECIFIC_NAME
     *
     * @mbg.generated
     */
    public void setSpecificName(String specificName) {
        this.specificName = specificName == null ? null : specificName.trim();
    }
}