package com.javadevjournal.controller;

import com.javadevjournal.customer.data.CustomerModel;
import com.javadevjournal.customer.repo.CustomerRepository;
import com.javadevjournal.product.data.ProductModel;
import com.javadevjournal.product.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class MessageController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/write")
    public String writeConnection(Model model){
        System.out.println(customerRepository.findAll().stream().map(CustomerModel::getId).collect(Collectors.toSet()));
        return "product-list";
    }

    @GetMapping("/read")
    public String readConnection(Model model){
        System.out.println(productRepository.findAll().stream().map(ProductModel::getId).collect(Collectors.toSet()));
        return "product-list";
    }

}
