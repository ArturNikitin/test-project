package testcases;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class SecondTest extends Test implements TestInterface {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(binarySearch(arr, 7));
    }

    public static int binarySearch(int[] arr, int result){
        int first = 0;
        int last = arr.length-1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] == result) {
                return mid;
            } else if (arr[mid] > result) {
                last = mid - 1;
                mid = (first + last) / 2;
            } else {
                first = mid + 1;
                mid = (first + last) / 2;
            }
        }

        return -1;
    }

    @Override
    public void testMethod() throws IllegalArgumentException {

    }

    public void onlySecondTest() {
        System.out.println("secret Hello");
    }

}
