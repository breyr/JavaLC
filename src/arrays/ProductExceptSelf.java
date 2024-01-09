package arrays;

public class ProductExceptSelf {
    /*
        Given an integer array nums, return an array answer such that answer[i] is equal
        to the product of all the elements of nums except nums[i].

        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

        You must write an algorithm that runs in O(n) time and without using the division operation.
     */

    public static int[] solution(int[] nums) {

        /*
            Prefix:
            1, 2, 3, 4 -> 1, 1, 2, 6
            Suffix:
            1, 2, 3, 4 -> 24, 24, 12, 4
         */

        int size = nums.length;

        int[] prefix = new int[size];
        int[] postfix = new int[size];
        int[] ans = new int[size];

        for(int i = 0; i < size; i++) {
            if (i == 0)
                prefix[i] = nums[i];
            else
                prefix[i] = prefix[i - 1] * nums[i];
        }

        for(int i = size - 1; i >= 0; i--) {
            if (i == size - 1)
                postfix[i] = nums[i];
            else
                postfix[i] = postfix[i + 1] * nums[i];
        }

        for (int i = 0; i < size; i++) {
            if(i == 0) {
                // nothing before
                ans[i] = postfix[i + 1];
            } else if (i + 1 == size) {
                // nothing after
                ans[i] = prefix[i - 1];
            } else {
                // everything in-between
                ans[i] = prefix[i - 1] * postfix[i + 1];
            }
        }

        return ans;
    }
}
