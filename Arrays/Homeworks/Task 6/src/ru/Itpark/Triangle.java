package com.company;

public class Triangle extends Solve {
    private double storonaA;
    private double storonaB;
    private double storonaC;
    private double S;
    private double P;
    public Triangle(double storonaA,double storonaB,double storonaC){
        this.storonaA=storonaA;
        this.storonaB=storonaB;
        this.storonaC=storonaC;
    }
    public void Solve(){
        P=(storonaA+storonaB+storonaC)/2;
        S=(P-storonaA)*(P-storonaB)*(P-storonaC);
        System.out.println("Периметр треугольника равен: " + S);
    }
}
