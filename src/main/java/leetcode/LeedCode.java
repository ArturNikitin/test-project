package leetcode;

import java.util.Arrays;

public class LeedCode {
    public static void main(String[] args) {
        int ints[] = {1, 4, 15, 9, 8, 3, 2, 6, 10, 7, 33, 24, 62, 35, 63, 17};
        int a[][] = new int[5][];
        int[] ab = new int[5];
        int c[][] = {{11, 2}, {1, 2}};
//        bubleSort(ints);
//        pickSort(ints);
        bubleSortNew(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println(binarySearch(ints, 10));
        System.out.println(binarySearch(ints, 3));
        System.out.println(binarySearch(ints, 9));

    }

    public static int[] bubleSortNew(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    swapNew(arr, j, i);
                }
            }
        }

        return arr;
    }

    public static int[] swapNew(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        return arr;
    }

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        return sort(arr, 0, arr.length - 1);
    }

    private static int[] sort(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        int i = low;
        int j = high;
        int pivot = arr[mid];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            sort(arr, low, j);
        if (i < high) {
            sort(arr, i, high);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] pickSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int search) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (arr[mid] == search) {
                return mid;
            } else if (search > arr[mid]) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    public static int[] bubleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int mid = arr[i];
                    arr[i] = arr[j];
                    arr[j] = mid;
                }
            }
        }
        return arr;
    }

    public static String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int indxStart = 0;
        int indextEnd = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = indxStart - indextEnd;
            int indxMin = i - 1;
            int indxMax = i + 1;
            while (indxMin >= 0 && indxMax <= arr.length - 1) {
                if (arr[indxMin] == arr[indxMax] && indxMax - indxMin >= count) {
                    indxStart = indxMin;
                    indextEnd = indxMax;
                }
                indxMin--;
                indxMax++;
            }
        }
        return new String(arr).substring(indxStart, indextEnd);
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int position = 0;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            while (i < nums.length && nums[i - 1] == nums[i]) {
                count++;
                i++;
            }
            nums[position++] = nums[i - 1];
            length -= count;
        }
        return length;
    }
}
