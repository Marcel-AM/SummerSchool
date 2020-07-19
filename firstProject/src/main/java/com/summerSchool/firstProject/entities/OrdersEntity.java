package com.summerSchool.firstProject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Orders")
@Table(name="ORDERS")
public class OrdersEntity {
	
	@Id
	@Column(name="ORDERS_ID")
	private int ordersId;
	
	@Column(name="ORDERS_CODE")
	private String ordersCode;
	
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	private List<OrdersDetailsEntity> ordersDetailsList;
	

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public String getOrdersCode() {
		return ordersCode;
	}

	public void setOrdersCode(String ordersCode) {
		this.ordersCode = ordersCode;
	}

}
