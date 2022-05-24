package com.agility.agilitylt.controller;

import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/private/events")
public class EventPrivateController {

    private EventService eventService;

    public EventPrivateController(EventService eventService) { this.eventService = eventService;}

    @GetMapping("register-event")
    public String getRegisterEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "viewsRegisterForms/registerEventPrivate";
    }

    @PostMapping("/register-success")
    //Refactor later to request not user, but club param
    public String registerEvent(@RequestParam("userId") Long userId, Event event, Model model) {
        Event registeredEvent = eventService.register(event, userId);
        model.addAttribute("event", registeredEvent);
        return "redirect:/private/user/myEvents/";
//        return "redirect:/private/club/myEvents/"
    }
}
