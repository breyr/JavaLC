package arrays;

public class TripletSeq {
    /*
        Given an integer array nums, return true if there exists a triple of indices (i, j, k)
        such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
     */

    public static boolean solution(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;

        for (int num : nums) {
            // if num is <= i, then it's the smallest
            if (num <= i) {
                i = num;
            }
            // if num <= j, then it's the middle value
            else if (num <= j) {
                j = num;
            }
            // otherwise, num is the largest in the triplet
            else {
                return true;
            }
        }

        return false;
    }
}
