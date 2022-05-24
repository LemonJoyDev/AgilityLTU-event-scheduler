package com.agility.agilitylt.repository;

import com.agility.agilitylt.entity.Role;
import com.agility.agilitylt.enums.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRole(Authority role);
}
