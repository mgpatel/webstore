package com.packt.webstore.controller;

import com.packt.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mayank on 12/12/15.
 */
@Controller
public class OrderController {

    @Autowired
    public OrderService orderService;

    @RequestMapping("/order/P1234/2")
    public String process(){
        orderService.processOrder("P1234", 2);

        return "redirect:/products";
    }
}
