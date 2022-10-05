package org.example.SevenKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    SumOfNumbers s = new SumOfNumbers();
    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(-1, 0));
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(4, s.GetSum(4, 4));
    }

}