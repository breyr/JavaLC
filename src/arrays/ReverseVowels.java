package arrays;

import java.util.*;

public class ReverseVowels {
    /*
        Given a string s, reverse only all the vowels in the string and return it.
        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
     */

    public static String solution(String s) {
        char[] word = s.toCharArray();
        Stack<Character> vowelsToReplace = new Stack<>();
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        // get placements of vowels
        for (char c : word) {
            if (vowels.contains(Character.toLowerCase(c))) {
                // add to placements at position
                vowelsToReplace.push(c);
            }
        }

        // replace vowels
        for (int i = 0; i < word.length; i++) {
            if (vowels.contains(Character.toLowerCase(word[i]))) {
                // add to placements at position
                word[i] = vowelsToReplace.pop();
            }
        }

        return String.valueOf(word);
    }
}
