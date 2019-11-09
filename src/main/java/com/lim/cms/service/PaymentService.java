package com.lim.cms.service;

import java.util.List;

import com.lim.cms.entity.SimPayment;
import com.lim.cms.entity.SimPaymentReportCriteria;

public interface PaymentService {

	int insert(SimPayment record);

	SimPayment selectByPrimaryKey(Integer id);

    List<SimPayment> selectAll();
    
    List<SimPayment> selectAllBySaleId(Integer id);

    int update(SimPayment record);
    
    int delete(Integer id);
    
    List<SimPayment> getPaymentReport(SimPaymentReportCriteria criteria);
}
