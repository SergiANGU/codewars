package org.example.SixKyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class SixKyuExamTest {
    @Test
    public void happyPath() {
        Assertions.assertEquals(23, new SixKyuExam().solution(10));
    }

    @Test
    public void testNegativo() {
        Assertions.assertEquals(0, new SixKyuExam().solution(-10));
    }
}