package com.company;

import java.awt.*;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Broadcast broadcast1 = new Broadcast("Эйс Вентура", LocalTime.parse("01:00"), LocalTime.parse("02:00"));
        Broadcast broadcast2 = new Broadcast("News", LocalTime.parse("02:00"), LocalTime.parse("03:00"));
        Broadcast broadcast3 = new Broadcast("Sport", LocalTime.parse("03:00"), LocalTime.parse("04:00"));
        Broadcast broadcast4 = new Broadcast("Multfilms", LocalTime.parse("12:30"), LocalTime.parse("14:00"));
        Broadcast broadcast5 = new Broadcast("Cinema", LocalTime.parse("20:00"), LocalTime.parse("21:00"));
        Broadcast broadcast6 = new Broadcast("Wild love", LocalTime.parse("21:30"), LocalTime.parse("23:00"));
        Broadcast broadcast7 = new Broadcast("Music time", LocalTime.parse("00:00"), LocalTime.parse("02:00"));
        Broadcast broadcast8 = new Broadcast("Radio", LocalTime.parse("02:00"), LocalTime.parse("04:00"));

        Broadcast TNT[] = {broadcast1, broadcast2, broadcast3, broadcast4, broadcast5, broadcast6, broadcast7, broadcast8};

        Broadcast broadcast10 = new Broadcast("Sims", LocalTime.parse("01:00"), LocalTime.parse("02:00"));
        Broadcast broadcast11 = new Broadcast("Jimmy Neitron", LocalTime.parse("02:00"), LocalTime.parse("03:00"));
        Broadcast broadcast12 = new Broadcast("Swimming", LocalTime.parse("03:00"), LocalTime.parse("04:00"));
        Broadcast broadcast13 = new Broadcast("Sports", LocalTime.parse("12:30"), LocalTime.parse("14:00"));
        Broadcast broadcast14 = new Broadcast("Cinema", LocalTime.parse("20:00"), LocalTime.parse("21:00"));
        Broadcast broadcast15 = new Broadcast("STS LOVE", LocalTime.parse("21:30"), LocalTime.parse("23:00"));
        Broadcast broadcast16 = new Broadcast("Music ring", LocalTime.parse("00:00"), LocalTime.parse("02:00"));
        Broadcast broadcast17 = new Broadcast("Radio house", LocalTime.parse("02:00"), LocalTime.parse("04:00"));

        Broadcast STS[] = {broadcast10, broadcast11, broadcast12, broadcast13, broadcast14, broadcast15, broadcast16, broadcast17};

        Broadcast broadcast18 = new Broadcast("Sherlock Holms", LocalTime.parse("01:00"), LocalTime.parse("02:00"));
        Broadcast broadcast19 = new Broadcast("Mission Impossible", LocalTime.parse("02:00"), LocalTime.parse("03:00"));
        Broadcast broadcast20 = new Broadcast("Swimming", LocalTime.parse("03:00"), LocalTime.parse("04:00"));
        Broadcast broadcast21 = new Broadcast("Hockey", LocalTime.parse("12:30"), LocalTime.parse("14:00"));
        Broadcast broadcast22 = new Broadcast("Cinema", LocalTime.parse("20:00"), LocalTime.parse("21:00"));
        Broadcast broadcast23 = new Broadcast("STS LOVE", LocalTime.parse("21:30"), LocalTime.parse("23:00"));
        Broadcast broadcast24 = new Broadcast("Music ring", LocalTime.parse("00:00"), LocalTime.parse("02:00"));
        Broadcast broadcast25 = new Broadcast("Radio house", LocalTime.parse("02:00"), LocalTime.parse("04:00"));

        Broadcast TV1000[] = {broadcast18, broadcast19, broadcast20, broadcast21, broadcast22, broadcast23, broadcast24, broadcast25};
        Channel channel1 = new Channel("TNT", TNT);
        Channel channel2 = new Channel("STS", STS);
        Channel channel3 = new Channel("TV1000", TV1000);
        Channel channel[] = {channel1, channel2, channel3};

        TV tv = new TV(channel);
        System.out.printf("Write, number of canal:");
        boolean z = true;
        while (z = true) {
            int numberCanal = scanner.nextInt();
            if (numberCanal >= 1 && numberCanal <= channel.length) {
                switch (numberCanal) {
                    case 1:
                        tv.switchChannel("TNT");
                        break;
                    case 2:
                        tv.switchChannel("STS");
                        break;
                    case 3:
                        tv.switchChannel("TV1000");
                        break;
                }
            } else {
                    System.err.println("This canal is absent");
            }
        }
    }
}
