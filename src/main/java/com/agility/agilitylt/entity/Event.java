package com.agility.agilitylt.entity;

import com.agility.agilitylt.enums.EventClassification;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name= "event")
@Entity
@Data
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private EventClassification classification;

    @Column
    private String name;

//    take from club data
    @Column
    private String organizer;

    @Column
    private String judgeName;

    @Column
    private String judgeSurname;

//    Should take from club as default.
    @Column
    private String locationAddress;

    @Column
    private LocalDate date;

    @Column
    private LocalDateTime registrationEndTime;

    @Column
    private int maxDogParticipants;

    @Column
    private String startTimeA0;

    @Column
    private String startTimeA1;

    @Column
    private String startTimeA2;

    @Column
    private String startTimeA3;

    @Column
    private String info;
}