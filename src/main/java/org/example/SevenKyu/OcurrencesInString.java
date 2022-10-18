package org.example.SevenKyu;

public class OcurrencesInString {

    public static int strCount(String str, char letter) {
        int ocurrences = (int)str.chars().filter(x -> x == letter).count();
        return ocurrences;
    }



}
