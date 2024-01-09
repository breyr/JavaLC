package tests;

import arrays.ReverseVowels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    @Test
    void reverseVowels() {
        assertEquals("holle", ReverseVowels.solution("hello"));
    }
}