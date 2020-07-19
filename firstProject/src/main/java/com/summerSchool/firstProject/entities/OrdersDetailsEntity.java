package com.summerSchool.firstProject.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Orders_Details")
@Table(name="ORDERS_DETAILS")
public class OrdersDetailsEntity {

	@EmbeddedId
	private OrdersDetailsId detailsId;
	
}
