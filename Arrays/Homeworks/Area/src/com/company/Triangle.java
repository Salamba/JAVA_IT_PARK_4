package com.company;

public class Triangle extends Area{
    private double a;
    private double h;
    public Triangle(double a, double h){
        this.a = a;
        this.h = h;
    }
    public void Area() {
        double S = a * h / 2;
        System.out.println("Area Triangle:" + S);
    }
}
