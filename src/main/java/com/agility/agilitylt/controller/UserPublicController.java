package com.agility.agilitylt.controller;

import com.agility.agilitylt.entity.User;
import com.agility.agilitylt.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserPublicController {

    private final UserService userService;

    public UserPublicController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register-success")
    public String registerUser(User user, Model model) {
        User registeredUser = userService.register(user);
        model.addAttribute("user", registeredUser);
        return "redirect:/user/registered";
    }

    @GetMapping("/register-user")
    public String getRegisterUserForm(Model model) {
        model.addAttribute("user", new User());
        return "viewsRegisterForms/registerUserPublic";
    }

    @GetMapping("/registered")
    public String registeredUser() {
        return "viewsRegisterForms/registeredUserPublic";
    }
}
