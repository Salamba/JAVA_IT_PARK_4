package com.company;

public class Main {

    public static void main(String[] args) {
	Square square = new Square(2.5);
	Rectangle rectangle = new Rectangle(10);
	Triangle triangle = new Triangle(6,4);
	Area[] arr = new Area[]{square, rectangle, triangle};
	 for (int i=0;i<arr.length;i++){
	 	arr[i].Area();
	 }
	}
}
