package tests;

import arrays.ReverseWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @Test
    void solution() {
        assertAll(
                () -> assertEquals("blue is sky the", ReverseWords.solution("the sky is blue")),
                () -> assertEquals("world hello", ReverseWords.solution("  hello world  ")),
                () -> assertEquals("example good a", ReverseWords.solution("a good   example"))
        );
    }
}