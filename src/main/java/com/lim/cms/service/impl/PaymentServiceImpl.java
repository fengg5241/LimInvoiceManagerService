package com.lim.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lim.cms.entity.SimPayment;
import com.lim.cms.entity.SimPaymentReportCriteria;
import com.lim.cms.mapper.SimPaymentMapper;
import com.lim.cms.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Resource
	private SimPaymentMapper simPaymentMapper;
	
	@Override
	public int insert(SimPayment record) {
		return simPaymentMapper.insert(record);
	}

	@Override
	public SimPayment selectByPrimaryKey(Integer id) {
		return simPaymentMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SimPayment> selectAll() {
		return simPaymentMapper.selectAll();
	}

	@Override
	public int update(SimPayment record) {
		return simPaymentMapper.updateByPrimaryKey(record);
	}

	@Override
	public int delete(Integer id) {
		return simPaymentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public List<SimPayment> selectAllBySaleId(Integer id) {
		return simPaymentMapper.selectAllBySaleId(id);
	}

	@Override
	public List<SimPayment> getPaymentReport(SimPaymentReportCriteria criteria) {
		return simPaymentMapper.selectAllByCondition(criteria);
	}

}
