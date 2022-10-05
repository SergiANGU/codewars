package org.example.SixKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> filtredNumbers = new ArrayList<>();
        for (int number : elements)
            if (Collections.frequency(filtredNumbers, number) < maxOccurrences) filtredNumbers.add(number);
        return filtredNumbers.stream().mapToInt(Integer::intValue).toArray();
    }

}