package com.swiftline.searchrestapi.controller;

import com.swiftline.searchrestapi.entity.Product;
import com.swiftline.searchrestapi.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("search")
    public ResponseEntity<List<Product>> getProductsSearch(@RequestParam String query) {

        var response = productService.searchProducts(query);

        return ResponseEntity.ok(response);
    }

    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {

        var response = productService.createProduct(product);

        return new ResponseEntity(response, HttpStatus.CREATED);
    }
}
