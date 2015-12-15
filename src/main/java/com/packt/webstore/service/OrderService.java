package com.packt.webstore.service;

/**
 * Created by Mayank on 12/12/15.
 */

public interface OrderService {

    void processOrder(String productId, long quantity);
}
