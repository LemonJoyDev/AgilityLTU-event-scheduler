package com.agility.agilitylt.controller;

import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/public/events")
public class EventPublicController {

    private final EventService eventService;

    public EventPublicController(EventService eventService) { this.eventService = eventService; }

    @GetMapping
    public String getEventList(
            @RequestParam(name = "page", defaultValue = "0") int pageNumber, Model model) {

        Page<Event> eventPage = eventService.findAllPageable(5, pageNumber);

        List<Event> events = eventPage.getContent();

        model.addAttribute("events", events);
        model.addAttribute("currentPage", pageNumber);
        model.addAttribute("totalPages", eventPage.getTotalPages());

        return "viewsEvents/showAllEventsPublic";

    }

}
