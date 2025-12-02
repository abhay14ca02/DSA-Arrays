package com.arrays.medium.TwoSumII;

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
//find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] 
//and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

//Input: numbers = [2,7,11,15], target = 9
//Output: true
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

//Input: numbers = [2,3,4], target = 6
//Output: true

public class BetterApproach2 {

	private static boolean twoSum(int[] nums, int target) {
		int n = nums.length;

		// O(N)
		for (int i = 0; i < n; i++) {
			int complement = target - nums[i];
			if (binarySearch(nums, i + 1, n - 1, complement))
				return true;
		}
		return false;

	}

	private static boolean binarySearch(int[] nums, int left, int right, int complement) {
		// LogN
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == complement) {
				return true;
			} else if (nums[mid] < complement) {
				left++;
			} else {
				right--;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		boolean isFound = twoSum(nums, target);
		System.out.println(isFound);

	}
}

// Time Complexity : O(N) + O(LogN)
// Space Complexity : O(1)