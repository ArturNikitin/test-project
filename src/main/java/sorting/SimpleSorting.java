package sorting;

import java.util.Arrays;

public class SimpleSorting {
	
	public static void main(String[] args) {
		int[] arr = new int[]{6, 5, 1, 3, 7, 9, 6, 6};
		System.out.println(Arrays.toString(arr));
		pickSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binarySearch(arr, 9));
		System.out.println(binarySearch(arr, 0));
	}
	
	private static int[] pickSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minId = i;
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[minId] > arr[j]) {
					minId = j;
				}
			}
			swap(arr, i, minId);
		}
		return arr;
	}
	
	private static int binarySearch(int[] arr, int search) {
		int min = 0;
		int max = arr.length - 1;
		while (max >= min) {
			int mid = (max + min) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] > search) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}
	
	private static int[] bublleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int mid = arr[i];
		arr[i] = arr[j];
		arr[j] = mid;
	}
	
	
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int currentNumber = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > currentNumber) {
					int m = arr[j];
					arr[j] = currentNumber;
					arr[j + 1] = m;
				}
			}
		}
	}
	
	private static int[] quickSort(int[] arr) {
		if (arr.length == 2) {
			if (arr[0] > arr[1]) {
				int m = arr[0];
				arr[0] = arr[1];
				arr[1] = m;
			}
			return arr;
		}
		if (arr.length == 1) {
			return arr;
		}
		if (arr.length == 0) {
			return null;
		}
		
		int pivot = arr[0];
		int leftCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				leftCount++;
			}
		}
		
		int[] left = new int[leftCount];
		int leftPos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < pivot) {
				left[leftPos++] = arr[i];
			}
		}
		
		int[] resultLeft = quickSort(left);
		
		int rightCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > pivot) {
				rightCount++;
			}
		}
		
		int[] right = new int[rightCount];
		int rightPos = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > pivot) {
				right[rightPos++] = arr[i];
			}
		}
		int[] resultRight = quickSort(right);
		
		if (resultLeft != null) {
			for (int i = 0; i < resultLeft.length; i++) {
				arr[i] = resultLeft[i];
			}
		}
		int p = 0;
		if (resultLeft != null) {
			arr[resultLeft.length] = pivot;
			p = resultLeft.length + 1;
		} else {
			arr[0] = pivot;
			p = 1;
		}
		
		int k = 0;
		if (resultRight != null) {
			for (int i = p; i < resultRight.length + p; i++) {
				arr[i] = resultRight[k];
				k++;
			}
			
		}
		
		return arr;
	}
}
