package com.sysapps.repository;


import com.sysapps.model.Product;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.stream.Stream;

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findProductById(Long id);

    Product findProductByName(String name);

    @Query("select * from products")
    Stream<Product> streamAllProducts();
}
