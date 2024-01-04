package arrays;

import java.util.HashMap;

public class ValidAnagram {

    /*
        Problem Definition:
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
        typically using all the original letters exactly once.
     */

    public static boolean isAnagram(String s, String t) {
        // 1. have to check if the strings are of the same length, otherwise we can just return
        // 2. count the letters for the first string
        // 3. loop through the second string and subtract from the counts
        // 4. loop through the hashmap and check if any count is not equal to zero
        //   a. if the value is zero then the second string is an anagram
        //   b. if the value isn't zero then the second string isn't an anagram
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> counts = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!counts.containsKey(curr)) {
                counts.put(curr, 0);
            }
            counts.put(curr, counts.get(curr) + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            char curr = t.charAt(i);
            if(!counts.containsKey(curr)) return false;
            counts.put(curr, counts.get(curr) - 1);
        }

        // loop through hashmap values
        for(Integer count : counts.values()) {
            if (count != 0) return false;
        }

        return true;
    }

}
