package tests;

import arrays.ValidAnagram;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    @DisplayName("Valid Anagram")
    void isAnagram() {
        assertAll(
                () -> assertTrue(ValidAnagram.isAnagram("anagram", "nagaram")),
                () -> assertFalse(ValidAnagram.isAnagram("rat", "car"))
        );
    }
}