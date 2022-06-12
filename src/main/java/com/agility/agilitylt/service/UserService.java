package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.Role;
import com.agility.agilitylt.enums.Authority;
import com.agility.agilitylt.exception.UserNotFoundException;
import com.agility.agilitylt.service.RoleService;
import com.agility.agilitylt.repository.UserRepository;
import com.agility.agilitylt.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final RoleService roleService;

    public User findById(Long id) { return userRepository.findById(id).orElseThrow(UserNotFoundException::new); }

    public User register(User user) {
        user.getRoles().add(roleService.setRole(Authority.USER));
        return userRepository.save(user);
    }
    public User update (User user) { return userRepository.save(user); }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User with username: " + username + " was not found"));

    }

//    public User getAuthenticatedUserId(Authentication authentication){
//        Long id = ((User) authentication.getPrincipal()).getId();
//
//        return findById(id);
//    }

}
