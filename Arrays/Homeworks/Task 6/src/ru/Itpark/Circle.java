package com.company;

import static java.lang.Math.sqrt;

public class Circle extends Solve {

    private double radius;
    private double s;
    public double getRadius() {
        return radius;
    }

    public double getS() {
        return s;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public void Solve(){
        s=3.14 * sqrt(radius);
        System.out.println("Площадь круга: " + s);
    }

}
