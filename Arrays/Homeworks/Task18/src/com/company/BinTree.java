package com.company;

import java.util.Scanner;

public class BinTree {
    public Node root;

    public BinTree(int value) {
        root = new Node(value);
    }

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public void beginPrefix() {
        prefix(root);
        System.out.println();
    }

    public void beginInFix() {
        inFix(root);
        System.out.println();
    }

    public void beginPostFix() {
        postFix(root);
        System.out.println();
    }

    private void postFix(Node current) {
        if (current == null) return;
        postFix(current.left);
        postFix(current.right);
        System.out.print(current.value + " ");
    }

    private void inFix(Node current) {
        if (current == null) return;
        inFix(current.left);
        System.out.print(current.value + " ");
        inFix(current.right);
    }

    private void prefix(Node current) {
        if (current == null) return;
        System.out.print(current.value + " ");
        prefix(current.left);
        prefix(current.right);
    }

    public void add(Node current, int value) {
        if (value < current.value) {
            if (current.left==null) {
                current.left = new Node(value);
            }else {
                add(current.left,value);
            }
        }
        else if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
            } else {
                add(current.right, value);
            }
        }
    }
}
