package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TextViewer textViewer = new TextViewer();
        textViewer.setText("Салямба it.park!");

        textViewer.addTask(new findNumber());
        textViewer.addTask(new findText());
        textViewer.textProcess();
    }
}

