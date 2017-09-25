package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a[] = new int[100];
        int count = 0, vvod, number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        System.out.println("1 - показать массив чисел");
        System.out.println("2 - для добавления числа в первую свободную ячейку");
        System.out.println("3 - для добавления числа в конец");
        System.out.println("4 - удалить позицию №");
        System.out.println("5 - Выход");
        while (true) {

            vvod = scanner.nextInt();
            switch (vvod) {
                case 1:
                    System.out.println("Ваш массив ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                case 2:
                    for (int i = count; i > 0; i--) {
                        a[i] = a[i - 1];
                    }
                    System.out.println("Добавьте число в начало массива: ");
                    a[0] = scanner.nextInt();
                    count++;
                    break;
                case 3:
                    System.out.println("Добавьте число в конец массива: ");
                    a[count] = scanner.nextInt();
                    count++;
                    break;
                case 4:
                    if (a.length ==0) {
                        System.out.println("Массив пустой");
                    }
                    else {
                        number = scanner.nextInt();
                        a[number - 1] = 0;
                        for (int i = number - 1; i < count; i++) {
                            a[i] = a[i + 1];
                        }
                        count--;
                    }
                case 5:
                    System.exit(0);
            }
        }
    }
}
