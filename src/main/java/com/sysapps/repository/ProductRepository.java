package com.sysapps.repository;


import com.sysapps.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findProductById(Long id);

    Product findProductByName(String name);
}
