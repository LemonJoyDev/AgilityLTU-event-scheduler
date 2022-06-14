package com.agility.agilitylt.controller;

import com.agility.agilitylt.entity.EventConfiguration;
import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.entity.User;
import com.agility.agilitylt.service.EventService;
import com.agility.agilitylt.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/private")

public class EventPrivateController {

    private EventService eventService;
    private UserService userService;

    public EventPrivateController(EventService eventService, UserService userService) {
        this.eventService = eventService;
        this.userService = userService;
    }
    //____________________________Create event start here___________________________________________
    @GetMapping("/my-events/register-event")
    @PreAuthorize("hasRole('ADMIN')")
    public String getRegisterEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "viewsRegisterForms/registerEventPrivate";
    }

    @PostMapping("/my-events/register-success")
    @PreAuthorize("hasRole('ADMIN')")
    //Refactor later to request not user, but club param
    public String registerEvent(Event event, Model model) {
        Event registeredEvent = eventService.register(event);
        model.addAttribute("event", registeredEvent);
        return "redirect:/private/my-events/event/" + registeredEvent.getId() + "/update";
//        return "redirect:/private/club/myEvents/"
    }

    @GetMapping("/my-events/event/{id}/update")
    @PreAuthorize("hasRole('ADMIN')")
    public String updateCompetitionConfiguration(
            @PathVariable(name = "id") Long id, Model model) {
        Event findEvent = eventService.findById(id);
        model.addAttribute("eventConfig", findEvent);
        model.addAttribute("eventId", id);
        return "viewsRegisterForms/updateEventConfigurationPrivate";
    }

//____________________________Create event finish here__________________________________________________________________


//____________________________Update / delete event start here_________________________________________________________
    @GetMapping("/my-events/event/{id}/delete")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteEvent(@PathVariable(name = "id") long id) {
        eventService.deleteEvent(id);
        return "redirect:/private/home";
    }

//____________________________Update / delete event start here__________________________________________________________


//____________________________Create configurations start here__________________________________________________________
    @PostMapping("/my-events/event/{id}/update-success")
    @PreAuthorize("hasRole('ADMIN')")
    public String updateEventConfig(
            @PathVariable(name = "id") Long id, EventConfiguration configurations, Model model) {
        EventConfiguration updatedConfig = eventService.register(configurations);
        model.addAttribute("configuration", updatedConfig);

        Event event = eventService.findById(id);
        event.getEventConfiguration().add(updatedConfig);
        eventService.update(event);

        return "redirect:/private/home";
    }

    @PostMapping("/events/event/{user-id}/{configuration-id}/add-user")
    @PreAuthorize("hasRole('USER')")
    public String addUserToEventConfig(
            @PathVariable(name = "configuration-id") Long configurationId, @PathVariable(name = "user-id") Long userId) {
        User user = userService.findById(userId);
        EventConfiguration eventConfiguration = eventService.findConfigurationById(configurationId);

        eventConfiguration.getUsers().add(user);
        user.getEventConfigurations().add(eventConfiguration);

        eventService.update(eventConfiguration);
        userService.update(user);

        return "redirect:/private/home";
    }

//____________________________Create configurations finish here_________________________________________________________



//____________________________Display event info and event list start here______________________________________________
    @GetMapping("/events/event/{id}")
    public String viewEvent(
            @PathVariable(name = "id") Long id, Model model) {
        Event findEvent = eventService.findById(id);
        model.addAttribute("event", findEvent);
        return "viewsEvents/eventPage";
    }

    @GetMapping("/events")
    public String getEventList(
            @RequestParam(name = "page", defaultValue = "0") int pageNumber, Model model) {

        Page<Event> eventPage = eventService.findAllPageable(5, pageNumber);

        List<Event> events = eventPage.getContent();

        model.addAttribute("events", events);
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", eventPage.getTotalPages());

        return "viewsEvents/showAllEventsPrivate";

    }
//____________________________Display MY events info and event list start here__________________________________________

//____________________________Display event info and event list finish here_____________________________________________






}
