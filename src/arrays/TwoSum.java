package arrays;

import java.util.HashMap;

public class TwoSum {


    /*
        Given an array of integers nums and an integer target, return indices of the two numbers such
        that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.
     */

    public static int[] solution(int[] nums, int target) {
        // 1. go through list of integers and calculate a remainder from the target
        // 2. if the target is in a hashmap, then return the index of the current number and the other
        // 3. the hashmap stores the number and its index
        HashMap<Integer, Integer> numPositions = new HashMap<>();
        int[] out = new int[2];
        for(int i = 0; i < nums.length; i++) {
            // calculate remainder needed to reach target
            int remainder = target - nums[i];
            // check if the remainder is a value within the hashmap
            // - meaning the value is an element in nums
            if (numPositions.containsKey(remainder)) {
                out[0] = i;
                out[1] = numPositions.get(remainder);
                break;
            }
            numPositions.put(nums[i], i);
        }
        return out;
    }

}
