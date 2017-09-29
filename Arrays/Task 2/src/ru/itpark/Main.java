package ru.itpark;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        func();
    }
    static void func() {
        System.out.println("Введите число:");
        System.out.println("1 - показать массив чисел");
        System.out.println("2 - для добавления числа в первую свободную ячейку");
        System.out.println("3 - для добавления числа в конец");
        System.out.println("4 - удалить позицию №");
        System.out.println("5 - Выход");
        int count = 0,number,s=0;
        int a[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        int vvod;
        while (true) {
            vvod = scanner.nextInt();
            if (vvod >= 1 && vvod <= 5) {
                switch (vvod) {
                    case 1:
                        System.out.println("Ваш массив ");
                        for (int i = 0; i < count; i++) {
                            for (int j = count - 1; j > i; j--) {
                                if (a[j -1] > a[j]) {
                                    s=a[j-1];
                                    a[j-1]=a[j];
                                    a[j]=s;
                                    // System.out.print(a[j] + " ");
                                }
                            }
                        }
                        for (int z=0;z<count;z++){
                            System.out.print(a[z] + " ");
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
                        if (count == 0) {
                            System.out.println("Массив пустой");
                            break;
                        } else {
                            System.out.println("Введите № элемента, который будет удалён из массива: ");
                            number = scanner.nextInt();
                            a[number - 1] = 0;
                            for (int i = number - 1; i < count; i++) {
                                a[i] = a[i + 1];
                            }
                            count--;
                            break;
                        }
                    case 5:
                        System.exit(0);
                }
            }
            else {
                System.out.println("Числа отличаются от 1-5");
            }
        }
    }
}