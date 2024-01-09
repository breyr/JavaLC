package arrays;

public class MergeStrings {

    /*
        You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
        starting with word1. If a string is longer than the other, append the additional letters onto the end of
        the merged string.

        Return the merged string.
     */

    public static String solution(String word1, String word2) {
        // alternately add characters from each string to a new string
        // if the lengths of either string has passed, then the remaining characters of the other word are added
        // use the max of either length for the for loop

        int minLength = Math.min(word1.length(), word2.length());
        StringBuilder out = new StringBuilder();
        // declare i outside for loop so there is no need for an additional variable to keep track of current pos
        int i = 0;
        for (; i < minLength; i++) {
            // add char from first word
            out.append(word1.charAt(i));
            // add char from second word
            out.append(word2.charAt(i));
        }

        // i here is equal to minLength
        if (word1.length() > i) {
            out.append(word1.substring(i));
        } else if (word2.length() > i) {
            out.append(word2.substring(i));
        }

        return out.toString();
    }
}
