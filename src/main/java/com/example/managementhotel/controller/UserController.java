package com.example.managementhotel.controller;

import com.example.managementhotel.entity.User;
import com.example.managementhotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public String index(Model model){
        List<User> listUser = userService.getAll();
        model.addAttribute("listUser",listUser);
        return "user/user";
    }

    @GetMapping("/user/add")
    public String add(Model model){
        model.addAttribute("user",new User());
        return "user/user_add";
    }
}
