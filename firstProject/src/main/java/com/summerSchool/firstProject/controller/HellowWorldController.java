package com.summerSchool.firstProject.controller;


import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.summerSchool.firstProject.entities.OrdersEntity;
import com.summerSchool.firstProject.entities.ProductEntity;
import com.summerSchool.firstProject.repositories.OrdersRepository;
import com.summerSchool.firstProject.repositories.ProductRepository;

@RestController
public class HellowWorldController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrdersRepository orderRepository;

	@GetMapping(value="/createProduct")
	public String createProduct() {
		ProductEntity product = getAProduct(1, "Acadele", 1.1d);
		productRepository.save(product);
		
		return "product : " + product.getProductName() + " was created succesfully";
	}
	
	@GetMapping(value="/getJson", produces=MediaType.APPLICATION_JSON_VALUE)
	public String sayHelloWorldJson(){
		return new JSONObject().put("message","hello world").toString();
	}
	
	@GetMapping(value="/createOrder")
	public String createOrder() {
		OrdersEntity order =createNewOrder(1, "2f323232");
		orderRepository.save(order);
		
		return "product : " + order.getOrderId() + " was created succesfully";
	}
	
	private ProductEntity getAProduct(int id, String name, double price) {
		ProductEntity product = new ProductEntity();
		
		product.setId(id);
		product.setProductName(name);
		product.setPrice(price);
		
		return product;
	}
	
	private OrdersEntity createNewOrder(int id, String orderCode ) {
		OrdersEntity order = new OrdersEntity();
		order.setOrderId(id);
		order.setOrderCode(orderCode);
		return order;
		
	}
	
	
}