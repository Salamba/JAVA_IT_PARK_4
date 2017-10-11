package com.company;

import static java.lang.StrictMath.sqrt;

public class Square extends Solve {
    private double storona;
    public double S;
    Square(double storona) {
        this.storona = storona;
    }
        public void Solve(){
            S=storona*storona;
            System.out.println( "Площадь квадрата " + S );
    }
}
