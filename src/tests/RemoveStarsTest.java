package tests;

import org.junit.jupiter.api.Test;
import stacks.RemoveStars;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsTest {

    @Test
    void solution() {
        assertAll(
                () -> assertEquals("lecoe", RemoveStars.solution("leet**cod*e")),
                () -> assertEquals("", RemoveStars.solution("erase*****"))
        );
    }
}