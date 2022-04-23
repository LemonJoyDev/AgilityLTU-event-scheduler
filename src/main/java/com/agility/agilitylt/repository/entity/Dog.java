package com.agility.agilitylt.repository.entity;

import lombok.Data;

@Data
public class Dog {
    protected String ownerName;
    protected boolean activeRunner;
    protected String name;
    protected String breed;
    protected String birthDate;
    protected boolean vaccinated;

    //Size group (Small, Medium, Large)
    protected String size;
    protected float speed;



    //Agility divisions A0 A1 A2 A3
    protected String division;
    protected int cleanCourses;


    protected String info;



}
