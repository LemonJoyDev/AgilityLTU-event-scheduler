package com.agility.agilitylt.entity;

import com.agility.agilitylt.enums.EventClassification;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Table(name= "event")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

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
    private String country;

    @Column
    private String city;

    @Column
    private String locationAddress;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    @Column
    private int noOfEventDays;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate registrationEndDate;

    @Column
    private int maxDogCapacity;

    @Column
    private String info;

    @ManyToMany
    private List<EventConfiguration> eventConfiguration;


}