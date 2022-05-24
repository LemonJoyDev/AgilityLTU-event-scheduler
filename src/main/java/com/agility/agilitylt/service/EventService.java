package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.Event;
import com.agility.agilitylt.entity.User;
import com.agility.agilitylt.repository.EventRepository;
import com.agility.agilitylt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;
//    Refactor to club repository
    private final UserRepository userRepository;

//    Refactor user to club
    public Event register(Event event, Long userId) {
        User user = userRepository.getById(userId);
        event.setUser(user);
        return eventRepository.save(event);
    }
}
