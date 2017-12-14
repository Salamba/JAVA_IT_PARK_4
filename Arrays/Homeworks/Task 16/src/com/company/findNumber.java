package com.company;

public class findNumber extends TextObserversInThread {

    @Override
    public void handleEvent(String text) {
        int count = 0;
        if (text!=null){
            char[] chars = text.toCharArray();
            for (char chars1:chars){
                if (chars1>='0' && chars1<='9'){
                    count++;
                }
            }
        }
        System.out.println("Количество цифр: " + count);
    }
}
