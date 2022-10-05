package org.example.FiveKyu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DirReductionTest {
    DirReduction solution = new DirReduction();
    @Test
    public void testSimpleDirReduc() {
        String[] map = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] expected = {"WEST"};
        String[] finalMap = solution.dirReduc(map);
        Assertions.assertArrayEquals(expected, finalMap);
    }


}