package com.packt.webstore.service;

import com.packt.webstore.domain.Product;

import java.util.List;

/**
 * Created by Mayank on 12/12/15.
 */
public interface ProductService {

    List<Product> getAllProducts();

    Product getProductById(String productID);
}
