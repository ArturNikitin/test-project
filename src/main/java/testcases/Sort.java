package testcases;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{1,4,15,2,3,5,11,6})));
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length-1; i < arr.length; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int middle = arr[i];
                    arr[i] = arr[j];
                    arr[j] = middle;
                }
            }            
        }
        return arr;
    }
}
