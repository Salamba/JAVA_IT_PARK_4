package com.company;

public class Square extends Area {
    private double a;
    public Square(double a){
        this.a = a;
    }
    public void Area(){
        double S = a * a;
        System.out.println("Area Square:" + S);
        }
    }
