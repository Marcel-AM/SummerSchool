package com.summerSchool.firstProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.summerSchool.firstProject.Services.OrdersService;
import com.summerSchool.firstProject.data.Orders;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	@GetMapping("/order")
	public String findOrderByIdWithRequestParam(@RequestParam int id) throws Exception {
		return ordersService.getOrderById(id).toString();

	}
	
	@PostMapping(value = "/createOrder", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createOrder(@RequestBody Orders newOrder) throws Exception {
		ordersService.createOrder(newOrder);

	}
	
	@DeleteMapping(value = "/deleteOrder/{id}")
	public void deleteOrder(@PathVariable(value = "id") int id) throws Exception {
		ordersService.deleteOrder(id);

	}

}
