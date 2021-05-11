package hackerrank;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        System.out.println(divisibleSumPair(5, 2, new int[]{5,9,10,7,4}));
    }

    public static int divisibleSumPair(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i < ar.length; i++) {
            int first = ar[i];
            for (int j = 0; j < ar.length; j++) {
                if (((first + ar[j]) % k == 0) && i < j) {
                    result++;
                }
            }
        }

        return result;
    }
}
