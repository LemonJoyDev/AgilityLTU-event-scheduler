package com.agility.agilitylt.data;

import lombok.Data;

@Data
public class PersonalStats {
    private int winA0;
    private int winA1;
    private int winA2;
    private int winA3Place1;
    private int winA3Place2;
    private int winA3Place3;
    private int winInternationalPlace1;
    private int winInternationalPlace2;
    private int winInternationalPlace3;

    private float errorRate;
    private float cleanRate;
    private float disqualificationRate;
    private float winRate;
}
