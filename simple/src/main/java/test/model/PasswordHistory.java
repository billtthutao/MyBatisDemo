package test.model;

import java.util.Date;

/**
 * Database Table Remarks:
 *   Password history for user accounts
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table password_history
 */
public class PasswordHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password_history.Host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password_history.User
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password_history.Password_timestamp
     *
     * @mbg.generated
     */
    private Date passwordTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column password_history.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password_history.Host
     *
     * @return the value of password_history.Host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password_history.Host
     *
     * @param host the value for password_history.Host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password_history.User
     *
     * @return the value of password_history.User
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password_history.User
     *
     * @param user the value for password_history.User
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password_history.Password_timestamp
     *
     * @return the value of password_history.Password_timestamp
     *
     * @mbg.generated
     */
    public Date getPasswordTimestamp() {
        return passwordTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password_history.Password_timestamp
     *
     * @param passwordTimestamp the value for password_history.Password_timestamp
     *
     * @mbg.generated
     */
    public void setPasswordTimestamp(Date passwordTimestamp) {
        this.passwordTimestamp = passwordTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column password_history.Password
     *
     * @return the value of password_history.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column password_history.Password
     *
     * @param password the value for password_history.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}