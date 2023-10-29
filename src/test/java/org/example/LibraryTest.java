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
    public void testSort() {
        int[] inputArray = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = Library.mySort(inputArray);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void testSortEmpty() {
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
    public void testDetectNotOdd() {
        int inputNumber = 4;
        boolean expected = false;
        boolean isOdd = Library.detectOdd(inputNumber);
        assertEquals(expected, isOdd);
    }

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = Library.twoSum(nums, target);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumNoSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 8;
        try {
            Library.twoSum(nums, target);
            fail("Expect IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No solution.", e.getMessage());
        }
    }

    @Test
    public void testTwoSumEmptyArray() {
        int[] nums = {};
        int target = 9;
        try {
            Library.twoSum(nums, target);
            fail("Expect IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("No solution.", e.getMessage());
        }
    }
}