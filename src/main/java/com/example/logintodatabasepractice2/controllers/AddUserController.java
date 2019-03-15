package com.example.logintodatabasepractice2.controllers;

import com.example.logintodatabasepractice2.models.forms.UserForm;
import com.example.logintodatabasepractice2.models.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddUserController {


    private final UserService userService;

    @Autowired
    public AddUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("adduser")
    public String addUser(Model model){

        model.addAttribute("user",new UserForm());

        return "adduser";
    }

    @PostMapping
    @ResponseBody
    public String postUser(@ModelAttribute UserForm userForm){

        userService.saveUser(userForm);


        return "thank you";
    }

}
