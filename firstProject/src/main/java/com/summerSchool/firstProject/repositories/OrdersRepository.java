package com.summerSchool.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.summerSchool.firstProject.entities.OrdersEntity;

public interface OrdersRepository extends JpaRepository<OrdersEntity, Integer> {

	
	
}
