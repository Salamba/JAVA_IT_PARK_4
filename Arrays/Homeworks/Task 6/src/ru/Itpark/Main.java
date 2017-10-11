package com.company;

public class Main {

    public static void main(String[] args) {
	Triangle triangle = new Triangle(5,4,8);
	Square square = new Square(5);
	Circle circle = new Circle(10);
	Solve[] solves;
        solves = new Solve[]{triangle, square, circle};
        for (Solve solve : solves){
            solve.Solve();
        }
    }
}
