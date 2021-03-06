package com.lim.cms.mapper;

import com.lim.cms.entity.SimSettings;
import java.util.List;

public interface SimSettingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_settings
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer settingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_settings
     *
     * @mbg.generated
     */
    int insert(SimSettings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_settings
     *
     * @mbg.generated
     */
    SimSettings selectByPrimaryKey(Integer settingId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_settings
     *
     * @mbg.generated
     */
    List<SimSettings> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sim_settings
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SimSettings record);
}