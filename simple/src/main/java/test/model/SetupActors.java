package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table setup_actors
 */
public class SetupActors {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_actors.HOST
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_actors.USER
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_actors.ROLE
     *
     * @mbg.generated
     */
    private String role;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_actors.ENABLED
     *
     * @mbg.generated
     */
    private String enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column setup_actors.HISTORY
     *
     * @mbg.generated
     */
    private String history;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_actors.HOST
     *
     * @return the value of setup_actors.HOST
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_actors.HOST
     *
     * @param host the value for setup_actors.HOST
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_actors.USER
     *
     * @return the value of setup_actors.USER
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_actors.USER
     *
     * @param user the value for setup_actors.USER
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_actors.ROLE
     *
     * @return the value of setup_actors.ROLE
     *
     * @mbg.generated
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_actors.ROLE
     *
     * @param role the value for setup_actors.ROLE
     *
     * @mbg.generated
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_actors.ENABLED
     *
     * @return the value of setup_actors.ENABLED
     *
     * @mbg.generated
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_actors.ENABLED
     *
     * @param enabled the value for setup_actors.ENABLED
     *
     * @mbg.generated
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column setup_actors.HISTORY
     *
     * @return the value of setup_actors.HISTORY
     *
     * @mbg.generated
     */
    public String getHistory() {
        return history;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column setup_actors.HISTORY
     *
     * @param history the value for setup_actors.HISTORY
     *
     * @mbg.generated
     */
    public void setHistory(String history) {
        this.history = history == null ? null : history.trim();
    }
}