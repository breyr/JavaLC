package arrays;

public class StringCompression {
    /*
        Given an array of characters chars, compress it using the following algorithm:

        Begin with an empty string s. For each group of consecutive repeating characters in chars:

        If the group's length is 1, append the character to s.
        Otherwise, append the character followed by the group's length.

        The compressed string s should not be returned separately, but instead, be stored in the input character
        array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

        After you are done modifying the input array, return the new length of the array.

        You must write an algorithm that uses only constant extra space.
     */

    public static int solution(char[] chars) {
        // two pointers
        int index = 0;
        int i = 0;
        while (i < chars.length) {
            int j = i;
            // increment j until a new character is encountered or the end of the array
            while (j < chars.length && chars[j] == chars[i]) {
                j++;
            }

            // increment index after replacing value in array
            chars[index++] = chars[i];
            if (j - i > 1) {
                for(char c : Integer.toString(j - i).toCharArray()) {
                    // increment index after placing value in array
                    chars[index++] = c;
                }
            }

            // update pointers
            i = j;
        }

        // index is the length of our new array
        return index;
    }
}
