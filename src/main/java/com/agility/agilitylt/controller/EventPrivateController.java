package com.agility.agilitylt.controller;

import com.agility.agilitylt.entity.EventConfiguration;
import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/private/myEvents")
public class EventPrivateController {

    private EventService eventService;

    public EventPrivateController(EventService eventService) { this.eventService = eventService;}

    @GetMapping("/register-event")
    public String getRegisterEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "viewsRegisterForms/registerEventPrivate";
    }

    @PostMapping("/register-success")
    //Refactor later to request not user, but club param
    public String registerEvent(Event event, Model model) {
        Event registeredEvent = eventService.register(event);
        model.addAttribute("event", registeredEvent);
        return "redirect:/private/myEvents/event/" + registeredEvent.getId() + "/update";
//        return "redirect:/private/club/myEvents/"
    }

    @GetMapping("/event/{id}/update")
    public String updateCompetitionConfiguration(
            @PathVariable(name = "id") Long id, Model model) {
        Event findEvent = eventService.findById(id);
        model.addAttribute("eventConfig", findEvent);
        return "viewsRegisterForms/updateEventConfigurationPrivate";
    }

    @PostMapping("/event/update-success")
    public String updateEventConfig(EventConfiguration configurations, Model model) {
        EventConfiguration updatedConfig = eventService.register(configurations);
        model.addAttribute("configuration", updatedConfig);
        return "redirected:/private/home";
    }
}
