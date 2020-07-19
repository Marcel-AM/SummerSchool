package com.summerSchool.firstProject.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrdersDetailsId implements Serializable{
	
	@Column(name="ORDERS_ID")
	private int ordersId;
	
	@Column(name="PRODUCT_ID")
	private int productId;

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
