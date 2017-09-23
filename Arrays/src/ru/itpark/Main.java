package ru.itpark;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество чисел:");
        Scanner scanner = new Scanner(System.in);
        int a[];
        int n = scanner.nextInt();
        a = new int[n];
        System.out.println("Введите числа:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int z = 0; z < n; z++) {
            if (a[z] % 2 == 0) {
                a[z] = 0;
            }
            System.out.println(a[z] + " ");
        }
        System.out.println("Элементы в обратном порядке");
        for (int i = 0; i < n / 2; i++) {
            int temp, array = 0;
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;


        }
        for (int g = 0; g < n; g++) {
            System.out.println(a[g]);
        }
    }
}
