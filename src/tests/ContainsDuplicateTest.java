package tests;

import arrays.ContainsDuplicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    @DisplayName("Contains Duplicate - HashMap")
    void solutionHashMap() {
        assertAll(
                () -> assertTrue(ContainsDuplicate.solutionHashMap(new int[]{1,2,3,1})),
                () -> assertFalse(ContainsDuplicate.solutionHashMap(new int[]{1,2,3,4})),
                () -> assertTrue(ContainsDuplicate.solutionHashMap(new int[]{1,1,1,3,3,4,3,2,4,2}))
        );
    }

    @Test
    @DisplayName("Contains Duplicate - HashSet")
    void solutionHashSet() {
        assertAll(
                () -> assertTrue(ContainsDuplicate.solutionHashSet(new int[]{1,2,3,1})),
                () -> assertFalse(ContainsDuplicate.solutionHashSet(new int[]{1,2,3,4})),
                () -> assertTrue(ContainsDuplicate.solutionHashSet(new int[]{1,1,1,3,3,4,3,2,4,2}))
        );
    }
}