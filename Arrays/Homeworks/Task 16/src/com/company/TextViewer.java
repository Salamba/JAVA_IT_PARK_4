package com.company;

import java.util.LinkedList;

public class TextViewer {

    private LinkedList<TextObserversInThread> tasks;

    private String text;

    public TextViewer() {
        this.tasks = new LinkedList<>();
    }

    public void setText(String text) {
        this.text = text;
    }

    public void textProcess() {
        for (TextObserversInThread x: tasks) {
            x.newThreadEvent(text);
        }
    }

    public void addTask(TextObserversInThread task) {
        tasks.add(task);
    }
}
