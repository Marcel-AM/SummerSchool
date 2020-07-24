package com.summerSchool.firstProject.data;

public class Orders {

	private int orderId;
	
	private String orderCode;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderCode() {
		return orderCode;
	}

	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderCode=" + orderCode + "]";
	}
}
