package arrays;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {

    /*
        There are n kids with candies. You are given an integer array candies, where each candies[i] represents
        the number of candies the ith kid has, and an integer extraCandies, denoting the number of
        extra candies that you have.

        Return a boolean array result of length n, where result[i] is true if,
        after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the
        kids, or false otherwise.

        Note that multiple kids can have the greatest number of candies.
     */

    public static List<Boolean> solution(int[] candies, int extraCandies) {
        // sort candies list to get the max number
        int max = Integer.MIN_VALUE;
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        // create list
        List<Boolean> sol = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                sol.add(true);
            } else {
                sol.add(false);
            }
        }
        return sol;
    }
}
