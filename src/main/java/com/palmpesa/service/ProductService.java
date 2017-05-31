package com.palmpesa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.palmpesa.domain.Product;
import com.palmpesa.domain.ProductType;
import com.palmpesa.repository.ProductRepository;

@Service
@Transactional
public class ProductService   {
	
	@Autowired
	private ProductRepository productRepository;
		
	public Product save(Product product) {
		return productRepository.save(product);
	}

	public void delete(Product product) {
		productRepository.delete(product);
	}
	public void update(Product product) {
		List<Product> products = productRepository.findAll();
		for(Product p: products){
			if(p.equals(product)){
				productRepository.save(product);
				break;
			}
		}
		
	}

	public Product getProduct(int productId) {
		return  productRepository.findOne(productId);
	}

	public List<Product> getAllProducts() {
		return  productRepository.findAll() ;
	}
	
	public List<Product> findByTextSearch(String criteria) {
		if (!criteria.contains("%")) {
			criteria = "%"+criteria+"%";
		}
		return productRepository.findByProductNameLikeOrDescriptionLikeAllIgnoreCase(criteria, criteria);
	}

	public List<Product> findByPrice(double minPrice, double maxPrice) {
		return  productRepository.findByPriceBetween(minPrice, maxPrice);
	}
	
	public List<Product> findByProductType(ProductType productType) {
		 return productRepository.findByProductType(productType);
	}
	
}
