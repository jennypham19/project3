package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Services;
import com.example.managementhotel.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@Controller
@RequestMapping("")
public class ServicesController {
    @Autowired
    private final ServiceService serviceService;

    public ServicesController(ServiceService serviceService){
        this.serviceService = serviceService;
    }

    @GetMapping("/service")
    public String index(Model model){
        List<Services> listSer = serviceService.getAll();
        model.addAttribute("listSer",listSer);
        return "services/services";
    }
}
