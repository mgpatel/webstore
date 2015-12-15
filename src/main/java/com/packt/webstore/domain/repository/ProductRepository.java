package com.packt.webstore.domain.repository;

import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * Created by Mayank on 10/12/15.
 */

public interface ProductRepository {

    List<Product> getAllProducts();

    Product getProductById(String productId);
}

