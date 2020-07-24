package com.summerSchool.firstProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.summerSchool.firstProject.entities.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	
	@Query(value = "SELECT * FROM product WHERE price < ?1 AND PRODUCT_NAME = ?2", nativeQuery=true)
	List<ProductEntity> getProductsCheaperThan(double lowestPrice, String name);

	List<ProductEntity> findByPriceLessThanAndProductNameIgnoreCase(double price, String productName);
}
