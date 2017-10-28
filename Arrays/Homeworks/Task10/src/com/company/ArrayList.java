package com.company;

public class ArrayList implements List {

    Object[] object = new Object[10];
    int count=0;


    @Override
    public void add(Object element) {
        object[count]=element;
        count++;
    }

    @Override
    public void addToBegin(Object element) {
        for (int i=count;i>0;i--) {
            object[i] = object[i-1];
        }
            object[0]=element;
            count++;
        }

    @Override
    public Object get(int index) {
        if (index>=0 && index<count){
            return object[count];
        }
        return null;
    }

    @Override
    public void remove(Object element) {
        for (int i=0;i<count;i++){
            if (object[i].equals(element)){
                for (int z=i;z>count;z++){
                    object[z]=object[z+1];
                }
                count--;
            }
        }
    }

    @Override
    public int indexOf(Object element) {
        for (int i=0;i<count;i++) {
            if (object.equals(element)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }
    private class ArrayListIterator implements Iterator {
int index=0;
        @Override
        public Object next() {
            return object[index++];
        }

        @Override
        public boolean hasNext() {
            return index!=count;
        }
    }
}