package com.usian.controller;

import com.usian.pojo.Users;
import com.usian.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    UsersService usersService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Users> usersList = usersService.findAll();
        model.addAttribute("list", usersList);
        return "list";
    }
}
