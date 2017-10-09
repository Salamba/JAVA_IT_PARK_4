package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // инзачально это массив null
        ArrayList lists[] = new ArrayList[5];
        // МЕНЮ
        // 1. Создать список (0..4) - создаете нужный список
        // 2. Показть все списки (показываются только ненулевые)
        // 3. Работа со списком - попросить ввести номер спика
        //       1. Добавить
        //       2. Удалить
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Создать список");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Введите номер создаваемого списка: [0..4]");
                    int listNumber = scanner.nextInt();
                    lists[listNumber] = new ArrayList();
                    break;
                case 2:
                    System.out.println("Показать ненулевые списки");
                    for (int i=0;i<lists.length;i++){
                        if (lists[i]!=null) {
                            System.out.println("Список № "+i);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите номер списка: 1 - добавить, 2 - убрать.");
                    listNumber = scanner.nextInt();
                    boolean d=true;
                    while (d)
                    {
                        command = scanner.nextInt();
                        switch (command)
                        {
                            case 1:
                                System.out.println("Введите число:");
                                lists[listNumber].add(scanner.nextInt());
                                break;
                            case 2:
                                lists[listNumber].printArray();
                                break;
                            case 3:
                                lists[listNumber].addToBegin(scanner.nextInt());
                                break;
                            case 4:
                                System.out.println(lists[listNumber].get(scanner.nextInt()));
                                break;
                            case 5:
                                d=false;
                                break;
                            case 6:
                                lists[listNumber].sort();
                            case 7:
                                lists[listNumber].reverse();

                        }
                    }
            }


        }
    }
}