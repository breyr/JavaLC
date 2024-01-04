package tests;

import arrays.TwoSum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    @DisplayName("Two Sum - test 1")
    void test1() {
        // returning the position of the current index first, and then the index of a number
        // from the hashmap
        int[] expected = {1, 0};
        int[] inputArray = {2, 7, 11, 15};
        int target = 9;

        int[] res = TwoSum.solution(inputArray, target);
        assertArrayEquals(expected, res);
    }

    @Test
    @DisplayName("Two Sum - test 2")
    void test2() {
        // returning the position of the current index first, and then the index of a number
        // from the hashmap
        int[] expected = {2, 1};
        int[] inputArray = {3, 2, 4};
        int target = 6;

        int[] res = TwoSum.solution(inputArray, target);
        assertArrayEquals(expected, res);
    }

    @Test
    @DisplayName("Two Sum - test 3")
    void test3() {
        // returning the position of the current index first, and then the index of a number
        // from the hashmap
        int[] expected = {1, 0};
        int[] inputArray = {3, 3};
        int target = 6;

        int[] res = TwoSum.solution(inputArray, target);
        assertArrayEquals(expected, res);
    }
}