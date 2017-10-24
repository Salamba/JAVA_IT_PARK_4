package ru.itpark;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[100];
        try {
            FileInputStream input = new FileInputStream("input.txt");
            int currentByte = input.read();
            int temp=0;

            while (currentByte != -1) {
                currentByte = input.read();
                if (currentByte >=48 && currentByte<=57){
                   temp = temp+ (currentByte-'0')*10+(input.read()-'0');
                    arr[temp] = arr[temp]+1;
                    temp=0;
                }
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        for (int i=0; i<arr.length;i++)
        {
            if (arr[i]!=0){
                System.out.println("Людей в возрасте "+i+" - " + arr[i]);
            }
        }
    }
}
