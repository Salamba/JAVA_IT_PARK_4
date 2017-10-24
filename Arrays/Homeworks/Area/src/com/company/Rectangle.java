package com.company;

public class Rectangle extends Area {
    private double radius;
    private static double pi = 3.14159;
    public Rectangle(double radius){
        this.radius = radius;
    }
 public void Area(){
    double S = pi * Math.sqrt(radius);
     System.out.println("Area Rectangle: " + S);
    }
}
