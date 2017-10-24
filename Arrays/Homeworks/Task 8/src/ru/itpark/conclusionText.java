package ru.itpark;

public class conclusionText implements ru.itpark.Observer {
    public void handleEvent(String Text){
        int aCode;
        int count = 0;
        char Array[] = Text.toCharArray();
        for (int i=0;i<Array.length;i++){
            aCode = (int)Array[i];
            if (aCode>=65 && aCode<=90 || aCode>=97 && aCode<=122){
                count++;
            }
        }
        System.out.println("Количество букв: " + count);
    }
}
