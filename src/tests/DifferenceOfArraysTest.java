package tests;

import mapsandsets.DifferenceOfArrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DifferenceOfArraysTest {

    @Test
    void solution() {
        int[] nums1 = new int[]{1,2,3};
        int[] nums2 = new int[]{2,4,6};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> res1 = new ArrayList<>();
        res1.add(1);
        res1.add(3);
        List<Integer> res2 = new ArrayList<>();
        res2.add(4);
        res2.add(6);
        expected.add(res1);
        expected.add(res2);
        assertEquals(expected, DifferenceOfArrays.solution(nums1, nums2));
    }
}