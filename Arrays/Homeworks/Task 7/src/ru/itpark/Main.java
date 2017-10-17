package com.company;

public class Main {

    public static void main(String[] args) {
        if (Program.isLetter('5')) {
            System.out.println("Это буква");
        }
        if (Program.isDigit('5')) {
            System.out.println("Это цифра");
        }
        if (Program.isLower('5')) {
            System.out.println("Это не заглавная Буква");
        }
        if (Program.isUpper('5')) {
            System.out.println("Это заглавная Буква");
        }
        char number[] = {'1', '4', '5', '6'};
        int x = Program.parse(number);
        if (x!=-1){
            System.out.println(x);
        }
        else
        {
            System.out.println("Введено недопустимое значение");
        }
    }
}
