package com.swiftline.searchrestapi.service.impl;

import com.swiftline.searchrestapi.entity.Product;
import com.swiftline.searchrestapi.repository.ProductRepository;
import com.swiftline.searchrestapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {

        var products = productRepository.searchProducts(query);

        return products;
    }

    @Override
    public Product createProduct(Product product) {

        var productSaved = productRepository.save(product);

        return productSaved;
    }
}
