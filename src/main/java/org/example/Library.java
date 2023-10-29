package org.example;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library {
	public static void main(String arg[]) {
		System.out.println("Hello, JUnit 4!");	
	}
	
	public static int[] mySort(int[] inputArray) {
		int[] sorted = inputArray;
		Arrays.sort(sorted);
		return sorted;
	}
	public static boolean detectOdd(int inputNumber) {
		if (inputNumber%2 == 1) {
			return true;
		}else {
			return false;
		} 
	}

	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}

			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No solution.");
	}
}
