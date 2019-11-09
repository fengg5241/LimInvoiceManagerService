package com.lim.cms.entity;

import java.util.Date;

public class SimPaymentReportCriteria {

	private Integer curUserId; // login user id
	
	private Integer customerId;
	
	private Date startDate;
	
	private Date endDate;
	
	private String customerFields;
	
	private String note;


	public Integer getCurUserId() {
		return curUserId;
	}

	public void setCurUserId(Integer curUserId) {
		this.curUserId = curUserId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCustomerFields() {
		return customerFields;
	}

	public void setCustomerFields(String customerFields) {
		this.customerFields = customerFields;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
