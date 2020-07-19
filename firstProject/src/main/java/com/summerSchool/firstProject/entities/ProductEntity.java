package com.summerSchool.firstProject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="Product")
@Table(name="PRODUCT")
public class ProductEntity {
	
	@Id
	private int id;
	
	@Column(length=50 ,name="PRODUCT_NAME")
	private String productName;
	
	@Column
	private double price;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	private List<OrdersDetailsEntity> ordersDetailsList;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval = true)
	private List<ProductCategoryEntity> productCategory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
