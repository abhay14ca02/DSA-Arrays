package com.arrays.easy.FindClosestNumberToZero;

//Given an integer array nums of size n, return the number with the value closest to 0 in nums. 
// If there are multiple answers, return the number with the largest value.
// Input: nums = [-4,-2,1,4,8]
// Output: 1
// Input: nums = [2,-1,1]
// Output: 1
// Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.
public class OptimalSolution {
	private static int findClosestNumber(int[] nums) {
		int closest = Integer.MAX_VALUE;
		for (int num : nums) {
			if (Math.abs(num) < Math.abs(closest)) {
				closest = num;
			}
			// If same distance, take the larger value
			else if (Math.abs(num) == Math.abs(closest)) {
				closest = Math.max(closest, num);
			}
		}
		return closest;
	}

	public static void main(String[] args) {

		int nums[] = { 2, -1, 1 };
		int res = findClosestNumber(nums);
		System.out.println(res);
	}

}

// Time Complexity : O(N)
// Space Complexity : O(1)