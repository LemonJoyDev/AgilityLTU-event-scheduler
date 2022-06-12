package com.agility.agilitylt.controller;


import com.agility.agilitylt.entity.Dog;
import com.agility.agilitylt.service.DogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "private/user/dogs")
public class DogPrivateController {

    private final DogService dogService;

    public DogPrivateController(DogService dogService) {
        this.dogService = dogService;
    }

//   Will be for myDogs
//    @GetMapping("/{id}")
//    public String updateCompetitionConfiguration(
//            @PathVariable(name = "id") Long id, Model model) {
//        Event findEvent = eventService.findById(id);
//        model.addAttribute("eventConfig", findEvent);
//        model.addAttribute("eventId", id);
//        return "viewsRegisterForms/updateEventConfigurationPrivate";
//    }


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
    }


}
