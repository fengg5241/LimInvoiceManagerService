package com.lim.cms.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sim_notes
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SimNotes extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_notes.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_notes.default_sale
     *
     * @mbg.generated
     */
    private Boolean defaultSale;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_notes.default_quote
     *
     * @mbg.generated
     */
    private Boolean defaultQuote;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sim_notes.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_notes.id
     *
     * @return the value of sim_notes.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_notes.id
     *
     * @param id the value for sim_notes.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_notes.default_sale
     *
     * @return the value of sim_notes.default_sale
     *
     * @mbg.generated
     */
    public Boolean getDefaultSale() {
        return defaultSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_notes.default_sale
     *
     * @param defaultSale the value for sim_notes.default_sale
     *
     * @mbg.generated
     */
    public void setDefaultSale(Boolean defaultSale) {
        this.defaultSale = defaultSale;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_notes.default_quote
     *
     * @return the value of sim_notes.default_quote
     *
     * @mbg.generated
     */
    public Boolean getDefaultQuote() {
        return defaultQuote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_notes.default_quote
     *
     * @param defaultQuote the value for sim_notes.default_quote
     *
     * @mbg.generated
     */
    public void setDefaultQuote(Boolean defaultQuote) {
        this.defaultQuote = defaultQuote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sim_notes.description
     *
     * @return the value of sim_notes.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sim_notes.description
     *
     * @param description the value for sim_notes.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }
}