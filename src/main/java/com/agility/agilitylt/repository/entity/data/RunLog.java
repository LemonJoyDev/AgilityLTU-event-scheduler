package com.agility.agilitylt.repository.entity.data;

import lombok.Data;

@Data
public class RunLog {
    //Showcase length, time, speed, misstakes, disqualifications.
    private String run5;
    private String run4;
    private String run3;
    private String run2;
    private String run1;

    private String fastestRunMonth;
    private String fastestRunYear;
}
