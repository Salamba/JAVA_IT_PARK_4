package com.company;

public class findText extends TextObserversInThread {
    @Override
    public void handleEvent(String text) {
        int count = 0;
        if (text!=null){
           char[] chars = text.toCharArray();
           for (char chars1: chars){
               if (chars1>='a' && chars1<='z' || chars1>='A' && chars1<='Z' || chars1>='а' && chars1<='я' || chars1>='А' && chars1<='Я'){
                    count ++;
               }
           }
        }
        System.out.println("Количество букв " + count);
    }
}
