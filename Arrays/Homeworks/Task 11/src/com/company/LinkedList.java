package com.company;
import java.util.Iterator;
import javax.xml.soap.Node;

public class LinkedList<T> implements Iterable<T> {
    private Node head;

    public Node getTail() {
        Node tail = null;
        return tail;
    }
    private Node tail;
private int count;

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T> {
        private LinkedList.Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode!=null;
        }

        @Override
        public T next() {
        T element = (T) currentNode.value;
        currentNode=currentNode.next;
        return element;
        }
    }
    private static class Node<E>{
        E value;
        Node <E> next;
        Node(E value){
            this.value=value;
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }
    public void add(T element){
        Node<T> newNode = new Node<>(element);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        count++;
    }
    public  T get(int index){
        if (index<0 && index>=count){
            throw new IllegalArgumentException();
        }
        Node<T> currentNode = head;
        for (int i=0;i<index;i++){
            currentNode=currentNode.next;
        }
        return currentNode.value;
    }
}
