package com.lim.cms.mapper;

import com.lim.cms.entity.SimPaypal;
import java.util.List;

public interface SimPaypalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_paypal
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_paypal
     *
     * @mbg.generated
     */
    int insert(SimPaypal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_paypal
     *
     * @mbg.generated
     */
    SimPaypal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_paypal
     *
     * @mbg.generated
     */
    List<SimPaypal> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_paypal
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SimPaypal record);
}