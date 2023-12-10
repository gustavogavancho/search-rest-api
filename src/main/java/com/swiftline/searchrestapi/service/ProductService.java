package com.swiftline.searchrestapi.service;

import com.swiftline.searchrestapi.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
