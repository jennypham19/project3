package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Customer;
import com.example.managementhotel.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @GetMapping("/customer/add")
    public String add(Model model){
        model.addAttribute("cus", new Customer());
        return "customer/customer_add";
    }

    @PostMapping("/customer/create")
    public String create(@Validated Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "customer/customer_add";
        }else {
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("success","Thêm thành công!!!!!");
            return "redirect/customer";
        }
    }
}
