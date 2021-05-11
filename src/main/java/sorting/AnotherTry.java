package sorting;

import java.util.Arrays;

public class AnotherTry {
	public static void main(String[] args) {
		int[] arr = new int[]{1, 8, 4, 2, 5, 200, 178, 136, 78, 150, 16};
		insertSort(arr);
//		insertionSortImperative(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 4));
		System.out.println(binarySearch(arr, 10));
		System.out.println(binarySearch(arr, 3));
		System.out.println(binarySearch(arr, 200));
		System.out.println(binarySearch(arr, 150));
	}
	
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int value = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > value) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = value;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void insertionSortImperative(int[] input) {
		for (int i = 1; i < input.length; i++) {
			int key = input[i];
			int j = i - 1;
			while (j >= 0 && input[j] > key) {
				input[j + 1] = input[j];
				j = j - 1;
			}
			input[j + 1] = key;
		}
	}
	
	public static int[] quickSort(int[] arr) {
		if (arr.length <= 1) {
			return arr;
		}
		return quickSort(arr, 0, arr.length - 1);
	}
	
	private static int[] quickSort(int[] arr, int low, int high) {
		int mid = (high - low) / 2 + low;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		
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
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
		
		return arr;
	}
	
	
	public static int binarySearch(int[] arr, int search) {
		int min = 0;
		int max = arr.length - 1;
		int mid;
		while (min <= max) {
			mid = (max - min) / 2 + min;
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
	
	public static void bubleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		int mid = arr[i];
		arr[i] = arr[j];
		arr[j] = mid;
	}
}
