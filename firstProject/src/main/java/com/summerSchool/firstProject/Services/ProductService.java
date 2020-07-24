package com.summerSchool.firstProject.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summerSchool.firstProject.data.Product;
import com.summerSchool.firstProject.entities.ProductEntity;
import com.summerSchool.firstProject.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	private Product mapEntityToProduct(ProductEntity productEntity) {
		Product product = new Product();
		product.setId(productEntity.getId());
		product.setPrice(productEntity.getPrice());
		product.setProductName(productEntity.getProductName());
		return product;
	}


	public Product getProductById(int id) throws Exception {
		Optional<ProductEntity> productEntity = productRepository.findById(id);
		if (!productEntity.isPresent()) {
			throw new Exception("Produsul cu id-ul " + id + " nu exista.");
		}
		return mapEntityToProduct(productEntity.get());
	}

	
	public void createProduct(Product newProduct) {

		ProductEntity productEntity = new ProductEntity();
		productEntity.setPrice(newProduct.getPrice());
		productEntity.setProductName(newProduct.getProductName());

		productRepository.saveAndFlush(productEntity);

	}

	public void deleteProduct(int id) {
		productRepository.deleteById(id);

	}

	public List<Product> getProductsByNameAndPrice(double lowestPrice, String name){
		
		 List<ProductEntity> entitiesList = productRepository.getProductsCheaperThan(lowestPrice, name);
		 List<Product> products = new ArrayList<Product>();
		 for(ProductEntity entity: entitiesList) {
				products.add(mapEntityToProduct(entity));
		 }
		 return products;
		 
	}

	public List<Product> getProductsByNameAndPriceUsingSpringSintax(double lowestPrice, String name) {

		List<ProductEntity> entitiesList = productRepository.getProductsCheaperThan(lowestPrice, name);
		List<Product> products = new ArrayList<Product>();
		for (ProductEntity entity : entitiesList) {
			products.add(mapEntityToProduct(entity));
		}
		return products;

	}
}
