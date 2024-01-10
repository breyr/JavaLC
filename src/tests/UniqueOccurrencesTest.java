package tests;

import mapsandsets.UniqueOccurrences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOccurrencesTest {

    @Test
    void solution() {
        assertAll(
                () -> assertTrue(UniqueOccurrences.solution(new int[]{1,2,2,1,1,3})),
                () -> assertFalse(UniqueOccurrences.solution(new int[]{1,2})),
                () -> assertTrue(UniqueOccurrences.solution(new int[]{-3,0,1,-3,1,1,1,-3,10,0}))
        );
    }
}