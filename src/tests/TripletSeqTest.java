package tests;

import arrays.TripletSeq;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripletSeqTest {

    @Test
    void solution() {
        assertAll(
                () -> assertTrue(TripletSeq.solution(new int[]{1,2,3,4,5})),
                () -> assertFalse(TripletSeq.solution(new int[]{5,4,3,2,1})),
                () -> assertTrue(TripletSeq.solution(new int[]{2,1,5,0,4,6}))
        );
    }
}