package hackerrank;

import java.util.Arrays;

public class BreakingTheRecords {
    public static void main(String[] args) {
        int[] scores = new int[]{3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }

    public static int[] breakingRecords(int[] scores) {
        int[] result = new int[]{0, 0};
        int min = scores[0];
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                result[1]++;
            }
            if (scores[i] > max) {
                max = scores[i];
                result[0]++;
            }
        }
        return result;
    }
}
