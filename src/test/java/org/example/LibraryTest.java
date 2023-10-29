package org.example;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class LibraryTest {

    @Test
    public void testMain() {
        // Since the main method only prints a message, we cannot test its output directly.
        // We can only ensure that it executes without throwing any exceptions.
        Library.main(new String[]{});
    }

    @Test
    public void testMySort() {
        int[] inputArray = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = Library.mySort(inputArray);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testMySortEmptyArray() {
        int[] inputArray = {};
        int[] expected = {};
        int[] sorted = Library.mySort(inputArray);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testDetectOdd() {
        int inputNumber = 5;
        boolean expected = true;
        boolean isOdd = Library.detectOdd(inputNumber);
        assertEquals(expected, isOdd);
    }

    @Test
    public void testDetectEven() {
        int inputNumber = 4;
        boolean expected = false;
        boolean isOdd = Library.detectOdd(inputNumber);
        assertEquals(expected, isOdd);
    }
}