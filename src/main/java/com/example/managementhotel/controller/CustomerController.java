package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Customer;
import com.example.managementhotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class CustomerController {
    @Autowired
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customer")
    public String index(Model model){
        List<Customer> listCus = customerService.getAll();
        model.addAttribute("listCus",listCus);
        return "customer/customer";
    }
}
