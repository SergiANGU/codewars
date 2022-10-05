package org.example.FiveKyu;

import java.lang.ref.SoftReference;
import java.util.*;
import java.util.stream.Collectors;

public class DirReduction {


    public String[] dirReduc(String[] arr) {

        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i< arr.length - 1;i++){
            if ((arr[i].equals("NORTH") && arr[i+1].equals("SOUTH"))||
               (arr[i].equals("SOUTH") && arr[i+1].equals("NORTH"))||
               (arr[i].equals("WEST") && arr[i+1].equals("EAST"))||
               (arr[i].equals("EAST") && arr[i+1].equals("WEST"))){
                arr[i] = "";
                arr[i + 1] = "";
            }

        }
        String[] indications = Arrays.stream(arr)
                .filter(s -> !Objects.equals(s, ""))
                .toArray(String[]::new);

        if (indications.length == arr.length) {
            return arr;
        } else {
            return dirReduc(indications);
        }

    }
    public static String[] dirReducStack(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH":
                    if ("SOUTH".equals(lastElement)) {
                        stack.pop();
                    } else {
                        stack.push(direction);
                    }
                    break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }

}
