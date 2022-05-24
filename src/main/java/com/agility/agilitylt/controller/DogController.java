package com.agility.agilitylt.controller;


import com.agility.agilitylt.entity.Dog;
import com.agility.agilitylt.entity.User;
import com.agility.agilitylt.service.DogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@Controller
@RequestMapping(path = "private/user/dogs")
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping(path = "/dog/{id}")
    public String getDogProfile(
            @PathVariable(name = "id") Long id,
            Model model
    ) {
        Dog dog = dogService.findById(id);
        model.addAttribute("dog", dog);

        return "viewsDogs/dogPage";
    }

    @GetMapping("/register-dog")
    public String getRegisterUserForm(Model model) {
        model.addAttribute("dog", new Dog());
        return "viewsRegisterForms/registerDogPrivate";
    }

    @PostMapping("/register-success")
    public String registerDog(@RequestParam("userId") Long userId, Dog dog, Model model) {
        Dog registeredDog = dogService.register(dog, userId);
        model.addAttribute("dog", registeredDog);
        return "redirect:/private/user/dogs/dog/" + registeredDog.getId();
//        return "redirect:/private/handler/dogs/dog/" + registeredDog.getId();
    }


}
