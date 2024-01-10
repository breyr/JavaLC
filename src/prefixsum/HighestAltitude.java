package prefixsum;

public class HighestAltitude {
    public static int solution(int[] gain) {
        // sum from left to right, starting at 0, while keeping track of the max value
        int max = 0;
        int[] sums = new int[gain.length + 1];
        sums[0] = 0;
        for(int i = 0; i < gain.length; i++) {
            sums[i + 1] = sums[i] + gain[i];
            if(sums[i + 1] > max)
                max = sums[i + 1];
        }
        return max;
    }
}
