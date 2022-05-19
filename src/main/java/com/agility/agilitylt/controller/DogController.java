//package com.agility.agilitylt.controller;
//
//
//import com.agility.agilitylt.repository.entity.Dog;
//import com.agility.agilitylt.service.DogService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping(path = "/dogs")
//public class DogController {
//
//    private final DogService dogService;
//
//    public DogController(DogService dogService) {
//        this.dogService = dogService;
//    }
//
//    @GetMapping(path = "/{id}")
//    public String getDogPage(
//            @PathVariable(name = "id") Long id,
//            @RequestParam(name = "dogSize", required = false) boolean dogSize,
//            Model model
//    ) {
//        Dog dog = dogService.findById(id);
//
//        model.addAttribute("dogSize", dogSize);
//        model.addAttribute("dog", dog);
//
//        return "dogPage";
//    }
//
//    @GetMapping("/dog")
//    public String getDogForm(Model model) {
//        model.addAttribute("dog", new Dog());
//        return "dogForm";
//    }
//
//    @PostMapping("/dog-register")
//    public String registerDog(Dog dog, Model model) {
//        Dog registeredDog = dogService.register(dog);
//
//        model.addAttribute("dog", registeredDog);
//        return "redirect:/dogs/" + registeredDog.getId();
//    }
//
//
//}
