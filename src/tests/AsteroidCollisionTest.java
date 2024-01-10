package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stacks.AsteroidCollision;

import static org.junit.jupiter.api.Assertions.*;

class AsteroidCollisionTest {

    @Test
    @DisplayName("Asteroid Collision - Test 1")
    void test1() {
        int[] expected = new int[]{5, 10};
        int[] input = new int[]{5, 10, -5};
        assertArrayEquals(expected, AsteroidCollision.solution(input));
    }

    @Test
    @DisplayName("Asteroid Collision - Test 2")
    void test2() {
        int[] expected = new int[0];
        int[] input = new int[]{8, -8};
        assertArrayEquals(expected, AsteroidCollision.solution(input));
    }

    @Test
    @DisplayName("Asteroid Collision - Test 3")
    void test3() {
        int[] expected = new int[]{10};
        int[] input = new int[]{10, 2, -5};
        assertArrayEquals(expected, AsteroidCollision.solution(input));
    }
}