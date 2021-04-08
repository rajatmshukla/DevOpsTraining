package com.myapp.spring.rest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.spring.model.Product;
import com.myapp.spring.repository.PassengerRepository;

@RestController
@RequestMapping("/airline")

public class PassengerApi {

	@Autowired

	private PassengerRepository repository;
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@PostMapping("/feedback")
	public Product saveNewProductcrm(@RequestBody Product product) {
		return repository.saveProductcrm(product);
	}

	@GetMapping("/feedback/{firstname}")
	public Product findByNamecrm(@PathVariable("firstname") String firstname) {

		return repository.findByNamecrm(firstname);
	}

}