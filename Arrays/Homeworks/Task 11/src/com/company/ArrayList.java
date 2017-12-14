package com.company;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {
    private final static int MAX_ARR_SIZE=100;
    private T[] object;

    public ArrayList() {
        this.object = (T[]) new Object[MAX_ARR_SIZE];
    }
    public void add(T element,int index){
        object[index]=element;
    }
    public T get(int index){
        if (index<=MAX_ARR_SIZE && index>=0){
            return object[index];
        }else return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        int index = -1;
        @Override
        public boolean hasNext() {
            index++;
            return index!=MAX_ARR_SIZE;
        }

        @Override
        public T next() {
            return object[index];
        }
    }
}
