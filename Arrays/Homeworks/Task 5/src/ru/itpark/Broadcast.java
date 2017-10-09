package com.company;

import java.time.LocalTime;
import java.util.Date;

public class Broadcast {
    private String name;
    private LocalTime beginTime;
    private LocalTime endTime;

    public Broadcast(String name, LocalTime beginTime, LocalTime endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalTime getBeginTime() {
        return beginTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }
}
