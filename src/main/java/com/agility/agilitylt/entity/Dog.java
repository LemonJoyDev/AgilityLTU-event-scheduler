package com.agility.agilitylt.entity;

import jdk.jfr.BooleanFlag;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "dog")
@Entity
@Data
@NoArgsConstructor
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "activeRunner")
    @BooleanFlag
    protected boolean activeRunner = true;

    @Column(name = "name")
    protected String name;

    @Column(name = "breed")
    protected String breed;

    @Column(name = "birthDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    protected LocalDate birthDate;

    @Column(name = "vaccinated")
    @BooleanFlag
    protected boolean vaccinated;

    @Column(name = "vaccineDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    protected LocalDate vaccineDate;

    @Column(name = "dogSize")
    protected String dogSize;

    @Column(name = "speed")
    protected float speed;

    @Column(name = "division")
    protected String division;

    @Column(name = "cleanCourses")
    protected int cleanCourses;

    @Column(name = "info")
    protected String info;

}