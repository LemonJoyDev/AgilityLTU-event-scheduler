package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.EventConfiguration;
import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.exception.EventNotFoundException;
import com.agility.agilitylt.repository.EventConfigurationRepository;
import com.agility.agilitylt.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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

    public EventConfiguration register(EventConfiguration configurations) { return eventConfigurationRepository.save(configurations); }

    public Event findById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(EventNotFoundException::new);
    }

}
