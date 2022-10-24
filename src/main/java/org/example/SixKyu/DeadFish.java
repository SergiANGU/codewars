package org.example.SixKyu;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        List <Integer> listValues = new ArrayList<>();
        int value = 0;
        for (int i=0 ; i<data.length();i++){
            switch (data.charAt(i)){
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value = value*value;
                    break;
                case 'o':
                    listValues.add(value);
                    break;
                default:
                    System.out.println("No comand");
                    break;

            }
        }
        int[] valuesArray = listValues.stream().mapToInt(i->i).toArray();

        return valuesArray;
    }
}
