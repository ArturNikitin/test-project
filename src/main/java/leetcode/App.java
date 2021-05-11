package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 3, 4, 4, 4, 4}));
	}
	
	// [1,15,4,7,10,2] 6
	public static int[] twoSum(int[] nums, int targetSum) {
		Set<Integer> results = new HashSet<>();
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (results.add(nums[i]))
				return new int[] {nums[i], targetSum - nums[i]};
			else
				results.add(targetSum - 1);
		}
		
		return new int[]{0};
	}
	
	public static int removeDuplicates(int[] nums) {
		int length = nums.length;
		int currentNum = nums[0];
		int count = 0;
		boolean isRepetative = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == currentNum) {
				count++;
				isRepetative = true;
			} else if (count != 0 && !isRepetative) {
				length += count;
				count = 0;
				isRepetative = false;
			} else
				currentNum = nums[i];
		}
		
		return length;
	}
	
	
	public static boolean isPalindrome(int x) {
		List<Integer> list = new ArrayList<>();
		if (x < 0) return false;
		while (x != 0) {
			int number = x % 10;
			x /= 10;
			list.add(number);
		}
		int j = list.size() - 1;
		int i = 0;
		while (j > i) {
			if (list.get(i) != list.get(j)) {
				return false;
			}
			j--;
			i++;
		}
		return true;
	}
}
