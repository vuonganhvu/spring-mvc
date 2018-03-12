package com.higgsup.controller;

import com.higgsup.model.User;
import com.higgsup.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "login")
    public String showLogin(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping(value = "dashboard")
    public String showDashboard(@ModelAttribute("user") User user, Model model){
        if(userService.authenticate(user)){
            model.addAttribute("user", user);
            return "dashboard";
        } else {
            model.addAttribute("error", true);
            return "redirect:login";
        }
    }
}
