package org.example.SevenKyu;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcurrencesInStringTest {
    @Test
    public void testSomething() {
        assertEquals(1, OcurrencesInString.strCount("Hello", 'o'));
        assertEquals(2, OcurrencesInString.strCount("Hello", 'l'));
        assertEquals(0, OcurrencesInString.strCount("",'z'));
    }


}