package com.agility.agilitylt.entity;

import com.agility.agilitylt.enums.CourseType;
import com.agility.agilitylt.enums.WeekDays;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Table(name = "event_configuration")
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
    @DateTimeFormat(pattern = "[HH:mm]")
    private LocalTime startTimeA0;

    @Column
    @DateTimeFormat(pattern = "[HH:mm]")
    private LocalTime startTimeA1;

    @Column
    @DateTimeFormat(pattern = "[HH:mm]")
    private LocalTime startTimeA2;

    @Column
    @DateTimeFormat(pattern = "[HH:mm]")
    private LocalTime startTimeA3;

    @ManyToMany
    private List<User> users;

    @ManyToMany
    private List<Dog> dogs;

    public String getA0Info() {
        if (courseA0) {
            return "Jumping - Starts at: " + startTimeA0;
        } else return "No competition";
    }

    public String getA1Info() {
        if (courseA1) {
            return courseTypeA1 + " Starts at: " + startTimeA1;
        } else return "No competition";
    }

    public String getA2Info() {
        if (courseA2) {
            return courseTypeA2 + " Starts at: " + startTimeA2;
        } else return "No competition";
    }

    public String getA3Info() {
        if (courseA3) {
            return courseTypeA3 + " Starts at: " + startTimeA3;
        } else return "No competition";
    }

}
