package com.lim.cms.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sim_payment
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SimPayment extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.invoice_id
     *
     * @mbg.generated
     */
    private Integer invoiceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.customer_id
     *
     * @mbg.generated
     */
    private Integer customerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.date
     *
     * @mbg.generated
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_payment.transaction_id
     *
     * @mbg.generated
     */
    private String transactionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.id
     *
     * @return the value of sim_payment.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.id
     *
     * @param id the value for sim_payment.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.invoice_id
     *
     * @return the value of sim_payment.invoice_id
     *
     * @mbg.generated
     */
    public Integer getInvoiceId() {
        return invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.invoice_id
     *
     * @param invoiceId the value for sim_payment.invoice_id
     *
     * @mbg.generated
     */
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.customer_id
     *
     * @return the value of sim_payment.customer_id
     *
     * @mbg.generated
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.customer_id
     *
     * @param customerId the value for sim_payment.customer_id
     *
     * @mbg.generated
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.date
     *
     * @return the value of sim_payment.date
     *
     * @mbg.generated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.date
     *
     * @param date the value for sim_payment.date
     *
     * @mbg.generated
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.note
     *
     * @return the value of sim_payment.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.note
     *
     * @param note the value for sim_payment.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.amount
     *
     * @return the value of sim_payment.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.amount
     *
     * @param amount the value for sim_payment.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.user
     *
     * @return the value of sim_payment.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.user
     *
     * @param user the value for sim_payment.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_payment.transaction_id
     *
     * @return the value of sim_payment.transaction_id
     *
     * @mbg.generated
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_payment.transaction_id
     *
     * @param transactionId the value for sim_payment.transaction_id
     *
     * @mbg.generated
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}