package com.company;

public class Program {
    public static boolean isLetter(char c) {
        int a = c;
        if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDigit(char c) {
        int a = c;
        if (a >= 48 && a <= 57) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUpper(char c) {
        int a = c;
        if (a >= 65 && a <= 90) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLower(char c) {
        int a = c;
        if (a >= 97 && a <= 122) {
            return true;
        } else {
            return false;
        }
    }

    public static int parse(char[] number) {
        double count = 0;
        int k = 0;
        for (int i = 0; i < number.length; i++) {
            if ((int) number[i] >= 48 && (int) number[i] <= 57) {
                switch ((int) (number[i])) {
                    case 48:
                        k = 0;
                        break;
                    case 49:
                        k = 1;
                        break;
                    case 50:
                        k = 2;
                        break;
                    case 51:
                        k = 3;
                        break;
                    case 52:
                        k = 4;
                        break;
                    case 53:
                        k = 5;
                        break;
                    case 54:
                        k = 6;
                        break;
                    case 55:
                        k = 7;
                        break;
                    case 56:
                        k = 8;
                        break;
                    case 57:
                        k = 9;
                        break;
                }
                count = count + k * Math.pow(10, (number.length - i - 1));
            }
            else {
                return  -1;
            }
        }
        return (int) count;
    }
}
