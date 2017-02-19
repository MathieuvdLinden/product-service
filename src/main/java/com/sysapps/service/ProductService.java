package com.sysapps.service;

import com.sysapps.model.Product;
import com.sysapps.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product getProductById(Long id) {
        return productRepository.findProductById(id);
    }

    public List<Product> getAllProducts() {
        return productRepository.streamAllProducts().collect(Collectors.toList());
    }

    public void saveProduct(Product product) {
        productRepository.save(product);
    }

}
