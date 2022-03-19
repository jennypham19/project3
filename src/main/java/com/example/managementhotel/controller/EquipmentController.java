package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Equipment;
import com.example.managementhotel.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EquipmentController {
    @Autowired
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService){
        this.equipmentService = equipmentService;
    }

    @GetMapping("/equipment")
    public String index(Model model){
        List<Equipment> listEquip = equipmentService.getAll();
        model.addAttribute("listEquip",listEquip);
        return "equipment/equipment";
    }
}
