package com.summerSchool.firstProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.summerSchool.firstProject.Services.ProductService;
import com.summerSchool.firstProject.data.Product;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	// /products?id=111

	@GetMapping("/products")
	public String findProductByIdWithRequestParam(@RequestParam int id) throws Exception {
		return productService.getProductById(id).toString();

	}
	// /products/3

	@GetMapping("/products/{id}")
	public String findProductByIdWithPathVariable(@PathVariable(value = "id") int id) throws Exception {
		return productService.getProductById(id).toString();

	}
	
	@PostMapping(value = "/createProduct", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void createProduct(@RequestBody Product newProduct) throws Exception {
		productService.createProduct(newProduct);

	}
	
	@DeleteMapping(value = "/deleteProduct/{id}")
	public void deleteProduct(@PathVariable(value = "id") int id) throws Exception {
		productService.deleteProduct(id);

	}
	
	@GetMapping("/products/ordered")
	public List<Product> getProductsByNameAndPrice(@RequestParam double price, @RequestParam String name) throws Exception {
		return productService.getProductsByNameAndPrice(price, name);

	}

}
