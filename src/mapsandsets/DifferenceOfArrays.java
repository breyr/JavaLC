package mapsandsets;

import java.util.*;

public class DifferenceOfArrays {

    /*
        Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

        answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
        answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

        Note that the integers in the lists may be returned in any order.
     */

    public static List<List<Integer>> solution(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // populate the first set
        for (int i : nums1)
            set1.add(i);

        // populate the second set
        for (int i : nums2) {
            set2.add(i);
        }


        ArrayList<Integer> diff1 = new ArrayList<>(set1);
        diff1.removeAll(set2);
        ArrayList<Integer> diff2 = new ArrayList<>(set2);
        diff2.removeAll(set1);

        List<List<Integer>> out = new ArrayList<>();
        out.add(diff1);
        out.add(diff2);

        return out;
    }

}
