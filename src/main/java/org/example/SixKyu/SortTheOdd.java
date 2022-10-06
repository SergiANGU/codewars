package org.example.SixKyu;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        System.out.println(Arrays.stream(Arrays.stream(array).toArray()).filter(n -> n % 2 == 0));
        array = Arrays.stream(Arrays.stream(array).toArray()).filter(n -> n % 2 == 0).toArray();
        for (int i : array ){
            System.out.println(i);
        }

        List<Integer> numbers = Arrays.stream(array).boxed().collect(Collectors.toList());
        int[] sortedNumbers = sort(numbers);
        return sortedNumbers;
    }


    private static int[] sort(List<Integer> numbersToSort){
        int arratLength = numbersToSort.size();
        int[]sortedNumbers = new int[arratLength];
        Collections.reverse(numbersToSort);

        for (int i = 0; i<sortedNumbers.length; i++){

        }
        return null;
    }
}
