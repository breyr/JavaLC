package tests;

import arrays.GreatestNumberCandies;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GreatestNumberCandiesTest {

    @Test
    @DisplayName("GNC - Test 1")
    void solution() {
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        int[] inputCandies = {2,3,5,1,3};
        int inputExtraCandies = 3;
        List<Boolean> got = GreatestNumberCandies.solution(inputCandies, inputExtraCandies);
        assertEquals(expected, got);
    }
}