package ru.itpark;

public class conclusionSpace implements Observer {
    public void handleEvent(String Text){
        int count = 0;
        int aCode;
        char Array[] = Text.toCharArray();
        for (int i=0;i<Array.length;i++){
            aCode = (int)Array[i];
            if (aCode ==32){
                count++;
            }
        }
        System.out.println("Количество пробелов: " + count);
    }
}
