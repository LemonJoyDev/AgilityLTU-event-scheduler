package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.EventConfiguration;
import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.exception.EventNotFoundException;
import com.agility.agilitylt.repository.EventConfigurationRepository;
import com.agility.agilitylt.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
    private final EventConfigurationRepository eventConfigurationRepository;
////    Refactor to club repository
////    private final UserRepository userRepository;
//
////    Refactor user to club
//    public Event register(Event event) {
////        User user = userRepository.getById(userId);
//////        event.setUser(user);
//        return eventRepository.save(event);
//    }

    public Event register(Event event) { return eventRepository.save(event); }

    public Event update(Event event) { return  eventRepository.save(event); }

    public EventConfiguration register(EventConfiguration configurations) { return eventConfigurationRepository.save(configurations); }

    public EventConfiguration update(EventConfiguration configurations) { return eventConfigurationRepository.save(configurations); }

    public Event findById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(EventNotFoundException::new);
    }

    public EventConfiguration findConfigurationById(Long id) {
        return eventConfigurationRepository.findConfigurationById(id)
                .orElseThrow(EventNotFoundException::new);
    }

    public Page<Event> findAllPageable(int pageSize, int pageNumber) {

        Pageable pageable = Pageable
                .ofSize(pageSize)
                .withPage(pageNumber);

        Page<Event> pageOfEvents = eventRepository.findAll(pageable);
        pageOfEvents.forEach(event -> {
            event.setDate(event.getDate());
        });

        return pageOfEvents;
    }

}
