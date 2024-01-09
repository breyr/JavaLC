package tests;

import arrays.StringCompression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCompressionTest {

    @Test
    void solution() {
        assertEquals(6, StringCompression.solution(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }
}