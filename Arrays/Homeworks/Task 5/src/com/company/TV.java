package com.company;

import java.time.LocalTime;

public class TV implements Commutation {
    private Channel channel[];

    public TV(Channel channel[]) {
        this.channel = channel;
    }

    public int switchChannel(String nameChannel) {
        for (int i = 0; i < channel.length; i++) {
            if (channel[i].getName().equalsIgnoreCase(nameChannel)) {
                System.out.println(channel[i].selectBroadcast(channel[i].getBroadcast()));
                System.out.println("Name of canal is: " + nameChannel);
                return 0;
            }
        }

  /*  public void soutBroadcast(Broadcast broadcast[]) {
        LocalTime t = LocalTime.now();
        for (int i = 0; i < broadcast.length; i++) {
            if (t.isAfter(broadcast[i].getBeginTime()) && t.isBefore(broadcast[i].getEndTime())) {
                System.out.println("Now program is : " + broadcast[i].getName() + " ");
            }
        }*/
        return 0;
    }
}
