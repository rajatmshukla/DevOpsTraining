package com.myapp.spring.rest.api;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.model.Product;
import com.myapp.spring.repository.ProductRepository;

@RestController
@RequestMapping("/products")

public class ProductApi {

//interface reduces coupling with classes (when replaced inheriting classs is not disturbed
//product api class has dependency on Product Repository
	@Autowired
	private ProductRepository repository;

	@GetMapping
	public List<Product> getAll() {

		return repository.findAll();
	}

	@PostMapping
	public Product saveNewProduct(@RequestBody Product product) {

		return repository.saveProduct(product);

	}

	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id") Integer productid, @RequestBody Product product) {

		Product existingProduct = repository.findById(productid);
		BeanUtils.copyProperties(product, existingProduct);
		return repository.updateProduct(product);

	}

//	@DeleteMapping("/{id}")
//	public Product deleteProduct(@PathVariable("id") Integer productid) {
//		
//		repository.delete(productid);
//		
//	}
}
