package org.example.SevenKyu;

import java.util.stream.IntStream;

public class SumOfNumbers {
        public int GetSum(int a, int b) {
            int init = a <= b ? a : b;
            int end = (a > b ? a : b) + 1;
            System.out.println(init + " - " + end);
            return IntStream.range(init, end).sum();
        }
}
