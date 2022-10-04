package org.example.SevenKyu;

public class Maskify {
    public static String maskify(String str) {
        char[] stringChar = str.toCharArray();
        if (stringChar.length > 4){
            for (int i = 0; i < stringChar.length - 4; i++){
                stringChar[i] = '#';
            }
        }
        return String.valueOf(stringChar);
    }
}