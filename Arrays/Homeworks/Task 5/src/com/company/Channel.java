package com.company;

import java.time.LocalTime;

public class Channel implements ChannelSearch {
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
    public String selectBroadcast(Broadcast broadcast[]) {
        LocalTime currentTime = LocalTime.now();
        for (int i = 0; i < broadcast.length; i++) {
            if (currentTime.isAfter(broadcast[i].getBeginTime()) &&
                    currentTime.isBefore(broadcast[i].getEndTime())) {
                return broadcast[i].getName();
            }
        }
        return "Программ нет в данное время.";
    }
}
