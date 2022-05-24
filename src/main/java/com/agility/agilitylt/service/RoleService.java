package com.agility.agilitylt.service;

import com.agility.agilitylt.entity.Role;
import com.agility.agilitylt.enums.Authority;
import com.agility.agilitylt.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {


    private final RoleRepository roleRepository;

    public Role setRole(Authority role) {
        return roleRepository.findByRole(role)
            .orElseThrow(() -> new UsernameNotFoundException("User with username: " + role + " was not found"));

    }
}
