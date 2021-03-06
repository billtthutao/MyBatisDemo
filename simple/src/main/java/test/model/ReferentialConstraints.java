package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table REFERENTIAL_CONSTRAINTS
 */
public class ReferentialConstraints {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    private String constraintCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    private String constraintSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    private String constraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    private String uniqueConstraintCatalog;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    private String uniqueConstraintSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    private String uniqueConstraintName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.MATCH_OPTION
     *
     * @mbg.generated
     */
    private String matchOption;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.UPDATE_RULE
     *
     * @mbg.generated
     */
    private String updateRule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated
     */
    private String deleteRule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME
     *
     * @mbg.generated
     */
    private String referencedTableName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public String getConstraintCatalog() {
        return constraintCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @param constraintCatalog the value for REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public void setConstraintCatalog(String constraintCatalog) {
        this.constraintCatalog = constraintCatalog == null ? null : constraintCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public String getConstraintSchema() {
        return constraintSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @param constraintSchema the value for REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public void setConstraintSchema(String constraintSchema) {
        this.constraintSchema = constraintSchema == null ? null : constraintSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public String getConstraintName() {
        return constraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @param constraintName the value for REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName == null ? null : constraintName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public String getUniqueConstraintCatalog() {
        return uniqueConstraintCatalog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG
     *
     * @param uniqueConstraintCatalog the value for REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG
     *
     * @mbg.generated
     */
    public void setUniqueConstraintCatalog(String uniqueConstraintCatalog) {
        this.uniqueConstraintCatalog = uniqueConstraintCatalog == null ? null : uniqueConstraintCatalog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public String getUniqueConstraintSchema() {
        return uniqueConstraintSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA
     *
     * @param uniqueConstraintSchema the value for REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA
     *
     * @mbg.generated
     */
    public void setUniqueConstraintSchema(String uniqueConstraintSchema) {
        this.uniqueConstraintSchema = uniqueConstraintSchema == null ? null : uniqueConstraintSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public String getUniqueConstraintName() {
        return uniqueConstraintName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME
     *
     * @param uniqueConstraintName the value for REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME
     *
     * @mbg.generated
     */
    public void setUniqueConstraintName(String uniqueConstraintName) {
        this.uniqueConstraintName = uniqueConstraintName == null ? null : uniqueConstraintName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.MATCH_OPTION
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.MATCH_OPTION
     *
     * @mbg.generated
     */
    public String getMatchOption() {
        return matchOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.MATCH_OPTION
     *
     * @param matchOption the value for REFERENTIAL_CONSTRAINTS.MATCH_OPTION
     *
     * @mbg.generated
     */
    public void setMatchOption(String matchOption) {
        this.matchOption = matchOption == null ? null : matchOption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.UPDATE_RULE
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.UPDATE_RULE
     *
     * @mbg.generated
     */
    public String getUpdateRule() {
        return updateRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.UPDATE_RULE
     *
     * @param updateRule the value for REFERENTIAL_CONSTRAINTS.UPDATE_RULE
     *
     * @mbg.generated
     */
    public void setUpdateRule(String updateRule) {
        this.updateRule = updateRule == null ? null : updateRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.DELETE_RULE
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated
     */
    public String getDeleteRule() {
        return deleteRule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.DELETE_RULE
     *
     * @param deleteRule the value for REFERENTIAL_CONSTRAINTS.DELETE_RULE
     *
     * @mbg.generated
     */
    public void setDeleteRule(String deleteRule) {
        this.deleteRule = deleteRule == null ? null : deleteRule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.TABLE_NAME
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.TABLE_NAME
     *
     * @param tableName the value for REFERENTIAL_CONSTRAINTS.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME
     *
     * @return the value of REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME
     *
     * @mbg.generated
     */
    public String getReferencedTableName() {
        return referencedTableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME
     *
     * @param referencedTableName the value for REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME
     *
     * @mbg.generated
     */
    public void setReferencedTableName(String referencedTableName) {
        this.referencedTableName = referencedTableName == null ? null : referencedTableName.trim();
    }
}