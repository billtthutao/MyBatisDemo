package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table INNODB_FT_CONFIG
 */
public class InnodbFtConfig {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FT_CONFIG.KEY
     *
     * @mbg.generated
     */
    private String key;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FT_CONFIG.VALUE
     *
     * @mbg.generated
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FT_CONFIG.KEY
     *
     * @return the value of INNODB_FT_CONFIG.KEY
     *
     * @mbg.generated
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FT_CONFIG.KEY
     *
     * @param key the value for INNODB_FT_CONFIG.KEY
     *
     * @mbg.generated
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FT_CONFIG.VALUE
     *
     * @return the value of INNODB_FT_CONFIG.VALUE
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FT_CONFIG.VALUE
     *
     * @param value the value for INNODB_FT_CONFIG.VALUE
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}