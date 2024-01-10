package mapsandsets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    /*
        Given an array of integers arr, return true if the number of occurrences of
        each value in the array is unique or false otherwise.
     */

    public static boolean solution(int[] arr) {
        // create counts
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        for (int n : arr) {
            if (!numCounts.containsKey(n))
                numCounts.put(n, 0);
            numCounts.put(n, numCounts.get(n) + 1);
        }

        // create set from list of values
        Set<Integer> uniqueCounts = new HashSet<>(numCounts.values());

        // if the sizes are equal, then the values are unique
        return uniqueCounts.size() == numCounts.size();
    }
}
