package tests;

import org.junit.jupiter.api.Test;
import prefixsum.HighestAltitude;

import static org.junit.jupiter.api.Assertions.*;

class HighestAltitudeTest {

    @Test
    void solution() {
        assertAll(
                () -> assertEquals(1, HighestAltitude.solution(new int[]{-5, 1, 5, 0, -7})),
                () -> assertEquals(0, HighestAltitude.solution(new int[]{-4, -3, -2, -1, 4, 3, 2}))
        );
    }
}