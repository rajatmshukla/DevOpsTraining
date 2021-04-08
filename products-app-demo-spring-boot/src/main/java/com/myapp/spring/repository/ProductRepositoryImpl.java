package com.myapp.spring.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import com.myapp.spring.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	//Dependency injection
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into products(productId,productName,price,description) value (?,?,?,?)", product.getProductId(),product.getProductName(),
				product.getPrice(),product.getDescription());
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("UPDATE products SET price=? WHERE productId=? values (?,?)",product.getPrice());
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<>(Product.class));
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("DELETE FROM products where productId=?",productId);
	}


	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select * from products where productId=?",
				new BeanPropertyRowMapper<>(Product.class),id);
	}
	
}
