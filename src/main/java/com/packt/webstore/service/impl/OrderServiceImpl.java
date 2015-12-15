package com.packt.webstore.service.impl;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mayank on 12/12/15.
 */

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private ProductRepository productRepository;

    public void processOrder(String productId, long quantity){
        Product productById = productRepository.getProductById(productId);

        if(productById.getUnitsInStock() < quantity){
            throw new IllegalArgumentException("Out of Stock. Available units in stock " + productById.getUnitsInStock());
        }

        productById.setUnitsInStock(productById.getUnitsInStock() - quantity);
    }
}
