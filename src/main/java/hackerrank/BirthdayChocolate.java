package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {
    public static void main(String[] args) {
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i < s.size(); i++) {
            int sum = 0;
            List<Integer> sumList = new ArrayList<>();
            for (int j = i; j < s.size(); j++) {
                sum += s.get(j);
                sumList.add(j);

                if (sum == d && sumList.size() == m) {
                    result++;
                    break;
                }

                if (sum > d) {
                    break;
                }
            }
        }
        return result;
    }
}
