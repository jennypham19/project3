package com.example.managementhotel.controller;

import com.example.managementhotel.entity.Permission;
import com.example.managementhotel.entity.User;
import com.example.managementhotel.service.PermissionService;
import com.example.managementhotel.service.UserService;
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
import java.util.Optional;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private final UserService userService;
    private final PermissionService permissionService;

    public UserController(UserService userService,PermissionService permissionService){
        this.userService = userService;
        this.permissionService = permissionService;
    }

    @GetMapping("/user")
    public String index(Model model){
        List<User> listUser = userService.getAll();
        model.addAttribute("listUser",listUser);
        return "user/user";
    }

    @GetMapping("/user/add")
    public String add(Model model){
        List<Permission> listPer = permissionService.getAll();
        model.addAttribute("listPer", listPer);
        model.addAttribute("user",new User());
        return "user/user_add";
    }

    @PostMapping("/user/create")
    public String create(@Validated User user, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("error","Thêm thất bại !!!");
            return "/user/user_add";
        }else{
            userService.create(user);
            redirectAttributes.addFlashAttribute("success","Thêm thành công !!");
            return "redirect:/user";
        }
    }
    @GetMapping("/user/edit/{id}")
    public String edit(@PathVariable int id ,Model model){
        Optional<User> userEdit = userService.findById(id);
        userEdit.ifPresent(user->model.addAttribute("user",user));
        Optional<Permission> perEdit = permissionService.findById(id);
        perEdit.ifPresent(per->model.addAttribute("listPer",per));
        return "user/user_edit";
    }
    @GetMapping("user/delete/{id}")
    public String delete (@PathVariable int id){
        userService.delete(id);
        return "redirect:/user";
    }
}
