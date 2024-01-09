package tests;

import arrays.CanPlaceFlowers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    void solution() {
        assertAll(
                () -> assertTrue(CanPlaceFlowers.solution(new int[]{1,0,0,0,1}, 1)),
                () -> assertFalse(CanPlaceFlowers.solution(new int[]{1,0,0,0,1}, 2))
        );
    }
}