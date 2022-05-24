package com.agility.agilitylt.entity;

import com.agility.agilitylt.enums.Authority;
import com.agility.agilitylt.repository.RoleRepository;
import lombok.Data;

import javax.persistence.*;
import java.util.Optional;

@Table(name = "roles")
@Entity
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Authority role;


}
