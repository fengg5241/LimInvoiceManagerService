package com.lim.cms.mapper;

import com.lim.cms.entity.SimPayment;
import java.util.List;

public interface SimPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_payment
     *
     * @mbg.generated
     */
    int insert(SimPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_payment
     *
     * @mbg.generated
     */
    SimPayment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_payment
     *
     * @mbg.generated
     */
    List<SimPayment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SimPayment record);
}