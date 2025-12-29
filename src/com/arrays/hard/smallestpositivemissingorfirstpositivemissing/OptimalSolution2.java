package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//Input: nums = [1,2,0]
//Output: 3
//Input: nums = [3,4,-1,1]
//Output: 2
//Input: nums = [7,8,9,11,12]
//Output: 1
public class OptimalSolution2 {

	private static int findFirstPositiveMissing(int[] nums) {

		int n = nums.length;
		int i = 0;
		// Place each number in its correct position
		while (i < n) {
			int val = nums[i];
			if (val >= 1 && val <= n && nums[val - 1] != val) {
				// Swap nums[i] with nums[val - 1]
				int temp = nums[val - 1];
				nums[val - 1] = nums[i];
				nums[i] = temp;
			} else {
				i++;
			}
		}

		// Find the first missing positive

		for (i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}

		// If all positions are correct, missing number is n+1

		return n + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0 };
		int firstMissing = findFirstPositiveMissing(nums);
		System.out.println(firstMissing);
	}
}

//Time Complexity : O(N+N)
//Space Complexity : O(1)
