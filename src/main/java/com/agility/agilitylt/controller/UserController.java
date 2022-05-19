//package com.agility.agilitylt.controller;
//
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.agility.agilitylt.repository.entity.User;
//import com.agility.agilitylt.service.UserService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping(path = "/users")
//public class UserController_OLD {
//
//    private final UserService userService;
//
//    public UserController_OLD(UserService userService) {
//        this.userService = userService; }
//
//    @GetMapping
//    public String getUserList(
//            @RequestParam(name = "page", defaultValue = "0") int pageNumber,
//            Model model
//    ) {
//        Page<User> userPage = userService.findAllPageable(5, pageNumber);
//
//        List<User> users = userPage.getContent();
//
//        model.addAttribute("users", users);
//        model.addAttribute("currentPage", pageNumber);
//        model.addAttribute("totalPages", userPage.getTotalPages());
//
//        return "userList";
//    }
//
//    @GetMapping(path = "user/{id}")
//    public String getUserPage(
//            @PathVariable(name = "id") Long id,
//            @RequestParam(name = "country", required = false) boolean country,
//            Model model
//    ) {
//        User user = userService.findById(id);
//
//        model.addAttribute("country", country);
//        model.addAttribute("user", user);
//
//        return "userPage";
//    }
//
//    @GetMapping("/register-user")
//    public String getUserForm(Model model) {
//        model.addAttribute("user", new User());
//        return "userRegister";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(User user, Model model) {
//        User registeredUser = userService.register(user);
//
//        model.addAttribute("user", registeredUser);
//        return "redirect:/users/" + registeredUser.getId();
//    }
//
//}
