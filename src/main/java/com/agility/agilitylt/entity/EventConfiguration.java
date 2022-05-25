package com.agility.agilitylt.entity;

import com.agility.agilitylt.enums.CourseType;
import com.agility.agilitylt.enums.WeekDays;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Table(name = "day_event_config")
@Entity
@Data
@NoArgsConstructor
public class EventConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean courseA0;

    @Column
    private Boolean courseA1;

    @Column
    private Boolean courseA2;

    @Column
    private Boolean courseA3;

    @Column
    @Enumerated(EnumType.STRING)
    private WeekDays weekDay;

    @Column
    @Enumerated(EnumType.STRING)
    private CourseType courseTypeA1;

    @Column
    @Enumerated(EnumType.STRING)
    private CourseType courseTypeA2;

    @Column
    @Enumerated(EnumType.STRING)
    private CourseType courseTypeA3;

    @Column
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTimeA0;

    @Column
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTimeA1;

    @Column
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTimeA2;

    @Column
    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime startTimeA3;

    @ManyToMany
    private List<User> users;

    @ManyToMany
    private List<Dog> dogs;

}
