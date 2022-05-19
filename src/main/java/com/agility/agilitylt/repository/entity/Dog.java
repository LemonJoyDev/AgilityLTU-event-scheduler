//package com.agility.agilitylt.repository.entity;
//
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//public class Dog {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false)
//    private Long id;
//
//    @Column(name = "ownerName")
//    protected String ownerName;
//
//    @Column(name = "activeRunner")
//    protected boolean activeRunner;
//
//    @Column(name = "name")
//    protected String name;
//
//    @Column(name = "breed")
//    protected String breed;
//
//    @Column(name = "birthDate")
//    protected String birthDate;
//
//    @Column(name = "vaccinated")
//    protected boolean vaccinated;
//
//    //Size group (Small, Medium, Large)
//
//    @Column(name = "size")
//    protected String size;
//
//    @Column(name = "speed")
//    protected float speed;
//
//
//
//    //Agility divisions A0 A1 A2 A3
//
//    @Column(name = "division")
//    protected String division;
//
//    @Column(name = "cleanCourses")
//    protected int cleanCourses;
//
//    @Column(name = "info")
//    protected String info;
//
//
//
//}
