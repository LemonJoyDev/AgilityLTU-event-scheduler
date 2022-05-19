package com.agility.agilitylt.service;

import com.agility.agilitylt.exception.UserNotFoundException;
import com.agility.agilitylt.repository.UserRepository;
import com.agility.agilitylt.repository.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService_OLD {

    private final UserRepository userRepository;

    public UserService_OLD(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) { return userRepository.save(user);}

    public User findById(Long id) {
        return userRepository
                .findById(id)
                .orElseThrow(UserNotFoundException::new);
    }

    public Page<User> findAllPageable(int pageSize, int pageNumber) {
        Pageable pageable = Pageable
                .ofSize(pageSize)
                .withPage(pageNumber);

        return userRepository.findAll(pageable);
    }
}
