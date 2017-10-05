package com.company;

import java.util.Scanner;

public class ArrayList {
    // константа - в коде уже изменить не получится
    private final int INITIAL_SIZE = 100;
    // поле - хранилище данных
    private int elements[];
    // количество элементов массива
    private int count;

    public ArrayList() {
        elements = new int[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Добавить элемент в конец
     * @param element
     */
    public void add(int element) {
        if (count < elements.length) {
            elements[count] = element;
            count++;
        } else
            {
             TODO:
             // увеличение размера массива
            System.err.println("Нет места");
        }
    }

    /**
     * Добавить элемент в начало списка, со сдвигом вправо
     * @param element
     */
    public void addToBegin(int element) {
        for (int i = count; i > 0; i--) {
            elements[i] = elements[i - 1];
        }
        System.out.println("Добавьте число в начало массива: ");
        elements[0] = element;
        count++;
        }

    /**
     * Вставить элемент в заданную позицию со сдвигом
     * @param element сам элемент
     * @param index индекс, куда надо вставить
     */
    public void insert(int element, int index)
    {
        for (int i = count; i > 0; i--) {
        elements[i] = elements[i - 1];
    }
        elements[index]=element;
    }

    /**
     * Получить элемент по индексу
     * @param index
     * @return сам элемент по заданному индексу
     */
    public int get(int index)
    {
        if(index<count)
        {
            return elements[index];
        }
        else
            {
            return -1;
        }

    }

    /**
     * Заменить элемент в заданной позиции новым элементом
     * @param index
     * @param element
     */
    public void replace(int index, int element) {
        elements[index]=element;
    }

    public void sort() {
        int temp;
        for (int i = 0; i < count; i++) {
            for (int j = count - 1; j > i; j--) {
                if (elements[j - 1] > elements[j]) {
                    temp = elements[j - 1];
                    elements[j - 1] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    public void reverse() {
        System.out.println("Элементы в обратном порядке");
        for (int i = 0; i < INITIAL_SIZE / 2; i++) {
            int temp, array = 0;
            temp = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = temp;
        }
        for (int g = 0; g < INITIAL_SIZE; g++) {
            System.out.println(elements[g]);
        }
    }

    public void remove(int index) {

    }

    /**
     * Вернуть индекс элемента, если элемента нет = -1
     * @param element
     * @return
     */
    public int find(int element)  {
        if(element<count)
        {
            return elements[element];
        }
        else
        {
            return -1;
        }

    }
    public void printArray(){
        for(int i=0; i<count; i++)
        {
            System.out.println(elements[i]);
        }
    }
}
