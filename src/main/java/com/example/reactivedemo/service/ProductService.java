package com.example.reactivedemo.service;

import com.example.reactivedemo.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Map;

@Service
public class ProductService {

    private final Map<String, Product> products = Map.of(
            "1", new Product("1", "Laptop", 80000),
            "2", new Product("2", "Phone", 40000),
            "3", new Product("3", "Tablet", 30000)
    );

    public Flux<Product> getAllProducts() {
        return Flux.fromIterable(products.values());
    }

    public Mono<Product> getProductById(String id) {
        return Mono.justOrEmpty(products.get(id));
    }
}
