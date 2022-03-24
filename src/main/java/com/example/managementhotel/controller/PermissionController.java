package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Permission;
import com.example.managementhotel.service.PermissionService;
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
import java.util.Optional;

@Controller
@RequestMapping("")
public class PermissionController {
    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService){
        this.permissionService = permissionService;
    }

    @GetMapping("/permission")
    public String index(Model model){
        List<Permission> listPer = permissionService.getAll();
        model.addAttribute("listPer",listPer);
        return "permission/permission";
    }

    @GetMapping("/permission/add")
    public String add(Model model){
        model.addAttribute("per",new Permission());
        return "permission/permission_add";
    }
    @PostMapping("/permission/create")
    public String create(@Validated Permission permission, BindingResult bindingResult, RedirectAttributes redirect){
        if (bindingResult.hasErrors()){
            redirect.addFlashAttribute("error","Thêm thất bại !!!!");
            return "/permission/permission_add";
        }else {
            Permission per = permissionService.create(permission);
            redirect.addFlashAttribute("success","Thêm thành công");
            return "redirect:/permission";
        }
    }

    @GetMapping("/permission/edit/{id}")
    public String edit(@PathVariable int id, Model model){
        Optional<Permission> perEdit = permissionService.findById(id);
        perEdit.ifPresent(per->model.addAttribute("per",per));
        return "permission/permission_edit";
    }

    @PostMapping("/permission/update/{id}")
    public String update(@Validated Permission permission,@PathVariable int id, BindingResult bindingResult,RedirectAttributes redirect){
        if(bindingResult.hasErrors()){
            redirect.addFlashAttribute("error","Cập nhật thất bại !!!!");
            return "/permission/permission_edit";
        }else {
            permissionService.update(id, permission);
            redirect.addFlashAttribute("success", "Cập nhật thành công!!!");
            return "redirect:/permission";
        }
    }

    @GetMapping("/permission/delete/{id}")
    public String delete(@PathVariable int id){
        permissionService.delete(id);
        return "redirect:/permission";
    }
}
