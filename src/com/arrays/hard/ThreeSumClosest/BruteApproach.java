package com.arrays.hard.ThreeSumClosest;

//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//Return the sum of the three integers. You may assume that each input would have exactly one solution.
//Input: nums = [-1,2,1,-4], target = 1
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//Input: nums = [0,0,0], target = 1, Output: 0
//Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
public class BruteApproach {
	private static int threeSumClosest(int[] nums, int target) {
		int n = nums.length;
		
		int minDiff = Integer.MAX_VALUE;
		int res = Integer.MIN_VALUE;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {

					int currSum = nums[i] + nums[j] + nums[k];
					int currDiff = Math.abs(currSum - target);
					// if currentDiff is less than minDiff, it indicates
					// that this triplet is closer to the target
					if (currDiff < minDiff) {
						res = currSum;
						minDiff = currDiff;
					}
					// If multiple sums are closest, take maximum one
					else if (currDiff == minDiff) {
						res = Math.max(res, currSum);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {

		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int result = threeSumClosest(nums, target);
		System.out.println(result);
	}
}

// Time Complexity : O(N^3)
// Space Complexity : O(1)