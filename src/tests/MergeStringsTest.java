package tests;

import arrays.MergeStrings;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsTest {

    @Test
    @DisplayName("Merge Strings Alternatively")
    void solution() {
        assertAll(
                () -> assertEquals("apbqcr", MergeStrings.solution("abc", "pqr")),
                () -> assertEquals("apbqrs", MergeStrings.solution("ab", "pqrs"))
        );
    }
}