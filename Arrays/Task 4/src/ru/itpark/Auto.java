package ru.itpark;

public class Auto {
    private String number;
    private String color;
    private int power;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getPower(int power) {
        this.power = power;
    }

    void setPower(int power) {
        if (power >= 0) {
            this.power = power;
        } else {
            this.power = 0;
        }
    }
    int getPower() {
        return power;
    }
    String getNumber(){
        return number;
    }
    String getColor(){
        return color;
    }
}
