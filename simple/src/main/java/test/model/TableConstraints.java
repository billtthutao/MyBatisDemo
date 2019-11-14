package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table TABLE_CONSTRAINTS
 */
public class TableConstraints {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    private String constraintCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    private String constraintSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    private String constraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated
     */
    private String constraintType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TABLE_CONSTRAINTS.ENFORCED
     *
     * @mbg.generated
     */
    private String enforced;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @return the value of TABLE_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @param constraintCatalog the value for TABLE_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog == null ? null : constraintCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @return the value of TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public String getConstraintSchema() {
        return constraintSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @param constraintSchema the value for TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema == null ? null : constraintSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @return the value of TABLE_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @param constraintName the value for TABLE_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.TABLE_SCHEMA
     *
     * @return the value of TABLE_CONSTRAINTS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.TABLE_SCHEMA
     *
     * @param tableSchema the value for TABLE_CONSTRAINTS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema == null ? null : tableSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.TABLE_NAME
     *
     * @return the value of TABLE_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.TABLE_NAME
     *
     * @param tableName the value for TABLE_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @return the value of TABLE_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated
     */
    public String getConstraintType() {
        return constraintType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @param constraintType the value for TABLE_CONSTRAINTS.CONSTRAINT_TYPE
     *
     * @mbg.generated
     */
    public void setConstraintType(String constraintType) {
        this.constraintType = constraintType == null ? null : constraintType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TABLE_CONSTRAINTS.ENFORCED
     *
     * @return the value of TABLE_CONSTRAINTS.ENFORCED
     *
     * @mbg.generated
     */
    public String getEnforced() {
        return enforced;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TABLE_CONSTRAINTS.ENFORCED
     *
     * @param enforced the value for TABLE_CONSTRAINTS.ENFORCED
     *
     * @mbg.generated
     */
    public void setEnforced(String enforced) {
        this.enforced = enforced == null ? null : enforced.trim();
    }
}