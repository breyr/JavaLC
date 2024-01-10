package stacks;

import java.util.Stack;

public class RemoveStars {

    /*
        You are given a string s, which contains stars *.

        In one operation, you can:

            Choose a star in s.
            Remove the closest non-star character to its left, as well as remove the star itself.

        Return the string after all stars have been removed.
     */

    public static String solution(String s) {
        // add characters to a stack
        // if you encounter a star do not add the star to the stack, instead pop a character from the stack
        // add the end pop everything into a string and return that string

        Stack<Character> chars = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            // if char is a * then do other logic and continue
            // if the stack is empty then we need to return ""
            if (s.charAt(i) == '*' && !chars.isEmpty()) {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }
        }

        // iterate over stack and append to string
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }

}
