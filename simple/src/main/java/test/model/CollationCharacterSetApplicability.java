package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
 */
public class CollationCharacterSetApplicability {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    private String collationName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    private String characterSetName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @return the value of COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    public String getCollationName() {
        return collationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @param collationName the value for COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    public void setCollationName(String collationName) {
        this.collationName = collationName == null ? null : collationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @return the value of COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @param characterSetName the value for COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName == null ? null : characterSetName.trim();
    }
}