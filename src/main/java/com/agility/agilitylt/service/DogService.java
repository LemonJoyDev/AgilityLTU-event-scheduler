package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.User;
import com.agility.agilitylt.exception.DogNotFoundException;
import com.agility.agilitylt.repository.DogRepository;
import com.agility.agilitylt.entity.Dog;
import com.agility.agilitylt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepository dogRepository;
    private final UserRepository userRepository;

    public Dog register(Dog dog, Long userId) {
        User user = userRepository.getById(userId);
        dog.setUser(user);
        return dogRepository.save(dog);
    }

    public Dog findById(Long id) {
        return dogRepository
                .findById(id)
                .orElseThrow(DogNotFoundException::new);
    }
}
