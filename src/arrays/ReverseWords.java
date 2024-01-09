package arrays;

import java.util.Stack;

public class ReverseWords {
    /*
        Given an input string s, reverse the order of the words.

        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words.
        The returned string should only have a single space separating the words. Do not include any extra spaces.
     */

    public static String solution(String s) {
        // use stack to track the words backwards
        // if there is a space already, then ignore the current space being added
        // cannot have leading or trailing spaces

        Stack<String> wordStack = new Stack<>();

        StringBuilder currWord = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ')) {
                // add to current string
                currWord.append(s.charAt(i));
            } else {
                // this means we hit a space or additional spaces before a word
                if (currWord.isEmpty()) {
                    continue;
                }
                // add string to stack
                wordStack.push(currWord.toString());
                // reset string
                currWord = new StringBuilder();
            }
        }
        // append last word if it exists, meaning there aren't any characters after the last word in the string
        if (!currWord.isEmpty()) {
            wordStack.push(currWord.toString());
        }

        StringBuilder out = new StringBuilder();
        while(!wordStack.empty()) {
            out.append(wordStack.pop());
            if (!wordStack.empty()) {
                out.append(" ");
            }
        }
        return out.toString();
    }
}
