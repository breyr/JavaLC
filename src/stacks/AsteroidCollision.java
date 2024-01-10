package stacks;

import java.util.Stack;

public class AsteroidCollision {
    /*
        We are given an array asteroids of integers representing asteroids in a row.

        For each asteroid, the absolute value represents its size, and the sign represents its direction
        (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

        Find out the state of the asteroids after all collisions. If two asteroids meet,
        the smaller one will explode. If both are the same size, both will explode.
        Two asteroids moving in the same direction will never meet.
     */

    public static int[] solution(int[] asteroids) {
        // create stack and compare the asteroids from the end
        Stack<Integer> rocks = new Stack<>();

        // if stack is empty, push
        // if current asteroid is in the same direction as the previous one append
        // if current asteroid is in a different direction, peek the current asteroid and keep the bigger one

        // create stack
        for(int a : asteroids) {
            rocks.push(a);
        }

//        Stack<Integer> depot = new Stack<>();
//        int numRocks = rocks.size();
//        int count = 0;
//        // three cases are being covered here
//        // 1. count < numRocks means we look at all asteroids and there are no edge cases
//        // 2. !rocks.isEmpty() means all asteroids are destroyed
//        // 3. rocks.size() > 1 means there is one asteroid left after a pop operation
//        while(count < numRocks && !rocks.isEmpty() && rocks.size() > 1) {
//            int currAsteroid = rocks.pop();
//            int next = rocks.peek();
//            // negative means moving left, positive means moving right
//            if ((currAsteroid < 0 && next < 0) || (currAsteroid > 0 && next > 0))
//                depot.push(currAsteroid);
//            // if currAsteroid is positive, then it will never collide with the next one
//            // if currAsteroid is negative, then the next asteroid must be positive
//            else if (currAsteroid > 0) {
//                depot.push(currAsteroid);
//            } else {
//                // if bigger is on stack as next element
//                if (Math.abs(next) < Math.abs(currAsteroid)) {
//                    rocks.pop(); // remove smaller
//                    depot.push(currAsteroid); // add bigger rock
//                } else if (Math.abs(next) == Math.abs(currAsteroid)) {
//                    // same size, remove from stack and don't add
//                    rocks.pop();
//                }
//            }
//            count++;
//        }

        return new int[]{};
    }

}
