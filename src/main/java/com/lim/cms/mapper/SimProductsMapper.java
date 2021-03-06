package com.lim.cms.mapper;

import com.lim.cms.entity.SimProducts;
import java.util.List;

public interface SimProductsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_products
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_products
     *
     * @mbg.generated
     */
    int insert(SimProducts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_products
     *
     * @mbg.generated
     */
    SimProducts selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_products
     *
     * @mbg.generated
     */
    List<SimProducts> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_products
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SimProducts record);
}