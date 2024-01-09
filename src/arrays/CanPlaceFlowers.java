package arrays;

public class CanPlaceFlowers {
    /*
        You have a long flowerbed in which some of the plots are planted, and some are not.
        However, flowers cannot be planted in adjacent plots.

        Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty,
        and an integer n, return true if n new flowers can be planted in the flowerbed without violating the
        no-adjacent-flowers rule and false otherwise.
     */

    public static boolean solution(int[] flowerbed, int n) {
        // modifying the array in place
        int size = flowerbed.length;
        // no flowers
        if (n == 0) return true;
        // iterate over flowerbed
        for (int i = 0; i < size; i++) {
            // if first index, don't check previous
            // if last index, don't check next
            // only if the current is a 0, next is 0, and last is 0, can we set the current index to 1
            // index checks first in or because then the other condition isn't checked if first is true
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == size-1 || flowerbed[i+1] == 0)) {
                n--;
                if (n == 0) return true;
                flowerbed[i] = 1;
            }
        }
        return false;
    }
}
