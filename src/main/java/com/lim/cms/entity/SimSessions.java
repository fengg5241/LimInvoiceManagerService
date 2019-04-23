package com.lim.cms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sim_sessions
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SimSessions extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_sessions.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_sessions.ip_address
     *
     * @mbg.generated
     */
    private String ipAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_sessions.timestamp
     *
     * @mbg.generated
     */
    private Integer timestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_sessions.data
     *
     * @mbg.generated
     */
    private byte[] data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_sessions.id
     *
     * @return the value of sim_sessions.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_sessions.id
     *
     * @param id the value for sim_sessions.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_sessions.ip_address
     *
     * @return the value of sim_sessions.ip_address
     *
     * @mbg.generated
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_sessions.ip_address
     *
     * @param ipAddress the value for sim_sessions.ip_address
     *
     * @mbg.generated
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_sessions.timestamp
     *
     * @return the value of sim_sessions.timestamp
     *
     * @mbg.generated
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_sessions.timestamp
     *
     * @param timestamp the value for sim_sessions.timestamp
     *
     * @mbg.generated
     */
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_sessions.data
     *
     * @return the value of sim_sessions.data
     *
     * @mbg.generated
     */
    public byte[] getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_sessions.data
     *
     * @param data the value for sim_sessions.data
     *
     * @mbg.generated
     */
    public void setData(byte[] data) {
        this.data = data;
    }
}