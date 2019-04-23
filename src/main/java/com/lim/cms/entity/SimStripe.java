package com.lim.cms.entity;

import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sim_stripe
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SimStripe extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.active
     *
     * @mbg.generated
     */
    private Byte active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.secret_key
     *
     * @mbg.generated
     */
    private String secretKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.publishable_key
     *
     * @mbg.generated
     */
    private String publishableKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.fixed_charges
     *
     * @mbg.generated
     */
    private BigDecimal fixedCharges;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.extra_charges_my
     *
     * @mbg.generated
     */
    private BigDecimal extraChargesMy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_stripe.extra_charges_other
     *
     * @mbg.generated
     */
    private BigDecimal extraChargesOther;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.id
     *
     * @return the value of sim_stripe.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.id
     *
     * @param id the value for sim_stripe.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.active
     *
     * @return the value of sim_stripe.active
     *
     * @mbg.generated
     */
    public Byte getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.active
     *
     * @param active the value for sim_stripe.active
     *
     * @mbg.generated
     */
    public void setActive(Byte active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.secret_key
     *
     * @return the value of sim_stripe.secret_key
     *
     * @mbg.generated
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.secret_key
     *
     * @param secretKey the value for sim_stripe.secret_key
     *
     * @mbg.generated
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.publishable_key
     *
     * @return the value of sim_stripe.publishable_key
     *
     * @mbg.generated
     */
    public String getPublishableKey() {
        return publishableKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.publishable_key
     *
     * @param publishableKey the value for sim_stripe.publishable_key
     *
     * @mbg.generated
     */
    public void setPublishableKey(String publishableKey) {
        this.publishableKey = publishableKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.fixed_charges
     *
     * @return the value of sim_stripe.fixed_charges
     *
     * @mbg.generated
     */
    public BigDecimal getFixedCharges() {
        return fixedCharges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.fixed_charges
     *
     * @param fixedCharges the value for sim_stripe.fixed_charges
     *
     * @mbg.generated
     */
    public void setFixedCharges(BigDecimal fixedCharges) {
        this.fixedCharges = fixedCharges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.extra_charges_my
     *
     * @return the value of sim_stripe.extra_charges_my
     *
     * @mbg.generated
     */
    public BigDecimal getExtraChargesMy() {
        return extraChargesMy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.extra_charges_my
     *
     * @param extraChargesMy the value for sim_stripe.extra_charges_my
     *
     * @mbg.generated
     */
    public void setExtraChargesMy(BigDecimal extraChargesMy) {
        this.extraChargesMy = extraChargesMy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_stripe.extra_charges_other
     *
     * @return the value of sim_stripe.extra_charges_other
     *
     * @mbg.generated
     */
    public BigDecimal getExtraChargesOther() {
        return extraChargesOther;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_stripe.extra_charges_other
     *
     * @param extraChargesOther the value for sim_stripe.extra_charges_other
     *
     * @mbg.generated
     */
    public void setExtraChargesOther(BigDecimal extraChargesOther) {
        this.extraChargesOther = extraChargesOther;
    }
}