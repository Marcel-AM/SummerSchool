package com.summerSchool.firstProject.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Orders_Status")
@Table(name="ORDERS_STATUS")
public class OrdersStatusEntity {
	
	@Id
	@Column(name="STATUS_ID")
	private int statusId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="COUNTRY_NAME")
	private String countryName;
	
	@Column(name="STATUS_CODE")
	private String statusCode;
	
	@Column(name="DATE_ORDER_PLACED")
	private Timestamp dateOrderPlaced;
	
	@Column(name="DATE_SHIPPED")
	private Timestamp dateShipped;
	
	@Column(name="DATE_PAID")
	private Timestamp datePaid;
	
	@Column(name="AMOUNT_PAID")
	private double amountPaid;
	
    @OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	private List<OrdersDetailsEntity> ordersStatus;
    
    
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserrName(String userName) {
		this.userName = userName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Timestamp getDateOrderPlaced() {
		return dateOrderPlaced;
	}

	public void setDateOrderPlaced(Timestamp dateOrderPlaced) {
		this.dateOrderPlaced = dateOrderPlaced;
	}

	public Timestamp getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Timestamp dateShipped) {
		this.dateShipped = dateShipped;
	}

	public Timestamp getDatePaid() {
		return datePaid;
	}

	public void setDatePaid(Timestamp datePaid) {
		this.datePaid = datePaid;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}
	
	
	
	

}
