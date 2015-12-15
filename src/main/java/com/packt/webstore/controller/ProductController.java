package com.packt.webstore.controller;

import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * Created by Mayank on 10/12/15.
 */

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public String list(Model model){
        model.addAttribute("products", productService.getAllProducts());

        return "products";
    }
}
