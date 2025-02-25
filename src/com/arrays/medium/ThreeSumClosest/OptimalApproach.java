package com.arrays.medium.ThreeSumClosest;

import java.util.Arrays;

public class OptimalApproach {
	private static int threeSumClosest(int[] nums, int target) {
		int n = nums.length;
		Arrays.sort(nums);
		int res = 0;
		int closestSum = Integer.MAX_VALUE;
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int currSum = nums[i] + nums[j] + nums[k];
				// If |currSum - target| < minDiff, then we have
				// found a triplet which is closer to target
				if (Math.abs(currSum - target) < closestSum) {
					closestSum = Math.abs(currSum - target);
					res = currSum;
				}
				// If multiple sums are closest, take maximum one
				else if (Math.abs(currSum - target) == closestSum) {
					res = Math.max(res, currSum);
				}
				// If currSum > target then we will decrease the
				// right pointer to move closer to target
				if (currSum > target)
					k--;
				// If currSum <= target then we will increase the
				// left pointer to move closer to target
				else
					j++;
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
//Time Complexity: O(NLogN)+O(N^2)
//Space Complexity:O(1)