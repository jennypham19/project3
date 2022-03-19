package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Bill;
import com.example.managementhotel.service.BillService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// gõ annotation
@Controller
@Component
@RequestMapping("")
public class BiIlController {
    // khai báo service
    private final BillService billService;

    public BiIlController(BillService billService){
        this.billService = billService;
    }

    //bây giờ tạo các function để CRUD
    @GetMapping("/bill")
    public String index(Model model){
        //Khai báo List<>
        List<Bill> listBill = billService.getAll();
        model.addAttribute("listBill",listBill);
        return "bill/bill";
    }
}
