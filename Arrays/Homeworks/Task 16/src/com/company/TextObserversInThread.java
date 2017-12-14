package com.company;

public abstract class TextObserversInThread {
    public void newThreadEvent(String text) {
        new Thread(() -> handleEvent(text)).start();
    }

    public abstract void handleEvent(String text);
}
