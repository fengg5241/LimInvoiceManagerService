package com.lim.cms.mapper;

import com.lim.cms.entity.SimSkrill;
import java.util.List;

public interface SimSkrillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_skrill
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_skrill
     *
     * @mbg.generated
     */
    int insert(SimSkrill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_skrill
     *
     * @mbg.generated
     */
    SimSkrill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_skrill
     *
     * @mbg.generated
     */
    List<SimSkrill> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_skrill
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SimSkrill record);
}