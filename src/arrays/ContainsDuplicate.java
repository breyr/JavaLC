package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean solutionHashMap(int[] nums) {
        // given an integer array nums, return true
        // if any value appears at least twice in the array
        // and false if all values are distinct

        HashMap<Integer, Integer> counts = new HashMap<>();
        // go through each element in nums and add to counts
        for (Integer ele : nums) {
            if (!counts.containsKey(ele)) {
                counts.put(ele, 0);
            }
            counts.put(ele, counts.get(ele) + 1);
        }

        for (Integer key : counts.keySet()) {
            if (counts.get(key) >= 2) {
                return true;
            }
        }

        return false;
    }

    public static boolean solutionHashSet(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(Integer n : nums) {
            if(numbers.contains(n)) {
                return true;
            }
            numbers.add(n);
        }
        return false;
    }

}
