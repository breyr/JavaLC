package tests;

import arrays.ProductExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    @Test
    void solution() {
        int[] expected = new int[]{24, 12, 8, 6};
        int[] got = ProductExceptSelf.solution(new int[]{1,2,3,4});
        assertArrayEquals(expected, got);
    }
}