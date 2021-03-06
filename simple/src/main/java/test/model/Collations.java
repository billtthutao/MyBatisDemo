package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table COLLATIONS
 */
public class Collations {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.COLLATION_NAME
     *
     * @mbg.generated
     */
    private String collationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    private String characterSetName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.ID
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.IS_DEFAULT
     *
     * @mbg.generated
     */
    private String isDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.IS_COMPILED
     *
     * @mbg.generated
     */
    private String isCompiled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.SORTLEN
     *
     * @mbg.generated
     */
    private Integer sortlen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATIONS.PAD_ATTRIBUTE
     *
     * @mbg.generated
     */
    private String padAttribute;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.COLLATION_NAME
     *
     * @return the value of COLLATIONS.COLLATION_NAME
     *
     * @mbg.generated
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.COLLATION_NAME
     *
     * @param collationName the value for COLLATIONS.COLLATION_NAME
     *
     * @mbg.generated
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.CHARACTER_SET_NAME
     *
     * @return the value of COLLATIONS.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.CHARACTER_SET_NAME
     *
     * @param characterSetName the value for COLLATIONS.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName == null ? null : characterSetName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.ID
     *
     * @return the value of COLLATIONS.ID
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.ID
     *
     * @param id the value for COLLATIONS.ID
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.IS_DEFAULT
     *
     * @return the value of COLLATIONS.IS_DEFAULT
     *
     * @mbg.generated
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.IS_DEFAULT
     *
     * @param isDefault the value for COLLATIONS.IS_DEFAULT
     *
     * @mbg.generated
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.IS_COMPILED
     *
     * @return the value of COLLATIONS.IS_COMPILED
     *
     * @mbg.generated
     */
    public String getIsCompiled() {
        return isCompiled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.IS_COMPILED
     *
     * @param isCompiled the value for COLLATIONS.IS_COMPILED
     *
     * @mbg.generated
     */
    public void setIsCompiled(String isCompiled) {
        this.isCompiled = isCompiled == null ? null : isCompiled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.SORTLEN
     *
     * @return the value of COLLATIONS.SORTLEN
     *
     * @mbg.generated
     */
    public Integer getSortlen() {
        return sortlen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.SORTLEN
     *
     * @param sortlen the value for COLLATIONS.SORTLEN
     *
     * @mbg.generated
     */
    public void setSortlen(Integer sortlen) {
        this.sortlen = sortlen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATIONS.PAD_ATTRIBUTE
     *
     * @return the value of COLLATIONS.PAD_ATTRIBUTE
     *
     * @mbg.generated
     */
    public String getPadAttribute() {
        return padAttribute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATIONS.PAD_ATTRIBUTE
     *
     * @param padAttribute the value for COLLATIONS.PAD_ATTRIBUTE
     *
     * @mbg.generated
     */
    public void setPadAttribute(String padAttribute) {
        this.padAttribute = padAttribute == null ? null : padAttribute.trim();
    }
}