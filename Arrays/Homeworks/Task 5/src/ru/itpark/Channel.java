package com.company;

import java.time.LocalTime;

public class Channel {
    private String name;
    private Broadcast broadcast[];

    public Channel(String name, Broadcast broadcast[]) {
        this.broadcast = broadcast;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Broadcast[] getBroadcast() {
        return broadcast;
    }
}
