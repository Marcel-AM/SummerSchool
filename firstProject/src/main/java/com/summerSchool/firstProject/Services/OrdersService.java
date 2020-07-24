package com.summerSchool.firstProject.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summerSchool.firstProject.data.Orders;
import com.summerSchool.firstProject.data.User;
import com.summerSchool.firstProject.entities.OrdersEntity;
import com.summerSchool.firstProject.entities.UserEntity;
import com.summerSchool.firstProject.repositories.OrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private OrdersRepository orderRepository;
	
	private Orders mapEntityToOrders(OrdersEntity orderEntity) {
		Orders order = new Orders();
		order.setOrderId(orderEntity.getOrderId());
		order.setOrderCode(orderEntity.getOrderCode());
		return order;
	}

	public Orders getOrderById(int id) throws Exception {
		Optional<OrdersEntity> orderEntity = orderRepository.findById(id);
		if (!orderEntity.isPresent()) {
			throw new Exception("Comanda cu id-ul " + id + " nu exista.");
		}
		return mapEntityToOrders(orderEntity.get());
	}

	public void createOrder(Orders newOrder) {

		OrdersEntity orderEntity = new OrdersEntity();
		orderEntity.setOrderCode(newOrder.getOrderCode());
		orderEntity.setOrderId(newOrder.getOrderId());
		orderRepository.saveAndFlush(orderEntity);

	}

	public void deleteOrder(int id) {
		orderRepository.deleteById(id);

	}
}
