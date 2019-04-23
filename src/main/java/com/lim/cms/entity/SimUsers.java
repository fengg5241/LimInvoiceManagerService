package com.lim.cms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sim_users
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SimUsers extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.username
     *
     * @mbg.generated
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.salt
     *
     * @mbg.generated
     */
    private String salt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.activation_code
     *
     * @mbg.generated
     */
    private String activationCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.forgotten_password_code
     *
     * @mbg.generated
     */
    private String forgottenPasswordCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.forgotten_password_time
     *
     * @mbg.generated
     */
    private Integer forgottenPasswordTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.remember_code
     *
     * @mbg.generated
     */
    private String rememberCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.created_on
     *
     * @mbg.generated
     */
    private Integer createdOn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.last_login
     *
     * @mbg.generated
     */
    private Integer lastLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.active
     *
     * @mbg.generated
     */
    private Boolean active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.first_name
     *
     * @mbg.generated
     */
    private String firstName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.last_name
     *
     * @mbg.generated
     */
    private String lastName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.company
     *
     * @mbg.generated
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.customer_id
     *
     * @mbg.generated
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_users.ip_address
     *
     * @mbg.generated
     */
    private byte[] ipAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.id
     *
     * @return the value of sim_users.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.id
     *
     * @param id the value for sim_users.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.username
     *
     * @return the value of sim_users.username
     *
     * @mbg.generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.username
     *
     * @param username the value for sim_users.username
     *
     * @mbg.generated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.password
     *
     * @return the value of sim_users.password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.password
     *
     * @param password the value for sim_users.password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.salt
     *
     * @return the value of sim_users.salt
     *
     * @mbg.generated
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.salt
     *
     * @param salt the value for sim_users.salt
     *
     * @mbg.generated
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.email
     *
     * @return the value of sim_users.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.email
     *
     * @param email the value for sim_users.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.activation_code
     *
     * @return the value of sim_users.activation_code
     *
     * @mbg.generated
     */
    public String getActivationCode() {
        return activationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.activation_code
     *
     * @param activationCode the value for sim_users.activation_code
     *
     * @mbg.generated
     */
    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.forgotten_password_code
     *
     * @return the value of sim_users.forgotten_password_code
     *
     * @mbg.generated
     */
    public String getForgottenPasswordCode() {
        return forgottenPasswordCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.forgotten_password_code
     *
     * @param forgottenPasswordCode the value for sim_users.forgotten_password_code
     *
     * @mbg.generated
     */
    public void setForgottenPasswordCode(String forgottenPasswordCode) {
        this.forgottenPasswordCode = forgottenPasswordCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.forgotten_password_time
     *
     * @return the value of sim_users.forgotten_password_time
     *
     * @mbg.generated
     */
    public Integer getForgottenPasswordTime() {
        return forgottenPasswordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.forgotten_password_time
     *
     * @param forgottenPasswordTime the value for sim_users.forgotten_password_time
     *
     * @mbg.generated
     */
    public void setForgottenPasswordTime(Integer forgottenPasswordTime) {
        this.forgottenPasswordTime = forgottenPasswordTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.remember_code
     *
     * @return the value of sim_users.remember_code
     *
     * @mbg.generated
     */
    public String getRememberCode() {
        return rememberCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.remember_code
     *
     * @param rememberCode the value for sim_users.remember_code
     *
     * @mbg.generated
     */
    public void setRememberCode(String rememberCode) {
        this.rememberCode = rememberCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.created_on
     *
     * @return the value of sim_users.created_on
     *
     * @mbg.generated
     */
    public Integer getCreatedOn() {
        return createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.created_on
     *
     * @param createdOn the value for sim_users.created_on
     *
     * @mbg.generated
     */
    public void setCreatedOn(Integer createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.last_login
     *
     * @return the value of sim_users.last_login
     *
     * @mbg.generated
     */
    public Integer getLastLogin() {
        return lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.last_login
     *
     * @param lastLogin the value for sim_users.last_login
     *
     * @mbg.generated
     */
    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.active
     *
     * @return the value of sim_users.active
     *
     * @mbg.generated
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.active
     *
     * @param active the value for sim_users.active
     *
     * @mbg.generated
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.first_name
     *
     * @return the value of sim_users.first_name
     *
     * @mbg.generated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.first_name
     *
     * @param firstName the value for sim_users.first_name
     *
     * @mbg.generated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.last_name
     *
     * @return the value of sim_users.last_name
     *
     * @mbg.generated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.last_name
     *
     * @param lastName the value for sim_users.last_name
     *
     * @mbg.generated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.company
     *
     * @return the value of sim_users.company
     *
     * @mbg.generated
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.company
     *
     * @param company the value for sim_users.company
     *
     * @mbg.generated
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.phone
     *
     * @return the value of sim_users.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.phone
     *
     * @param phone the value for sim_users.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.customer_id
     *
     * @return the value of sim_users.customer_id
     *
     * @mbg.generated
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.customer_id
     *
     * @param customerId the value for sim_users.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_users.ip_address
     *
     * @return the value of sim_users.ip_address
     *
     * @mbg.generated
     */
    public byte[] getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_users.ip_address
     *
     * @param ipAddress the value for sim_users.ip_address
     *
     * @mbg.generated
     */
    public void setIpAddress(byte[] ipAddress) {
        this.ipAddress = ipAddress;
    }
}