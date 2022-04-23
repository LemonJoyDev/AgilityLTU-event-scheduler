package com.agility.agilitylt.repository.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private String surname;
    private String country;
    private String city;
    private String phoneNumber;
    private String email;
    private int joinedAgilityYear;
    private String Info;
}
