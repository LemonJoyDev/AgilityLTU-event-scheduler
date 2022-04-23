package com.agility.agilitylt.repository.entity;

import lombok.Data;

@Data
public class Handler extends User {
    //Shoud a method return info or should it be kept with the constructor?
    private boolean clubMember;
    private String clubMemberOf;
    private String traineeOf;
    private int noOfDogsHandled;
    private String highestReachedGroup;

}
