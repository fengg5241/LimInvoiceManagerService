package com.lim.cms.entity;

import java.util.Date;

public class SimSalesReportCriteria {

	private String productName;
	
	private Integer curUserId; // login user id
	
	private Integer customerId;
	
	private Integer createdBy;
	
	private String status;
	
	private Date startDate;
	
	private Date endDate;
	
	private String customerFields;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

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

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
}
