package com.agility.agilitylt.repository;

import com.agility.agilitylt.entity.EventConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventConfigurationRepository extends JpaRepository<EventConfiguration, Long> {
    Optional<EventConfiguration> findConfigurationById(Long id);
}
