package org.example.SixKyu;

import java.util.stream.IntStream;

public class SixKyuExam {

    public int solution(int number) {
        return IntStream.range(0,number)
                .filter(num -> num % 3 == 0 || num % 5 == 0)
                .reduce(0, Integer::sum);
    }
}