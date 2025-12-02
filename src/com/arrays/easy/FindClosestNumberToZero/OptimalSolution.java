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
		int bestNum = Integer.MAX_VALUE;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			if (Math.abs(num) < Math.abs(bestNum)) {
				bestNum = num;
			} else if (Math.abs(num) == Math.abs(bestNum)) { // tie-breaking rule
				bestNum = Math.max(bestNum, num);
			}
		}

		return bestNum;
	}

	public static void main(String[] args) {

		int nums[] = { 2, -1, 1 };
		int res = findClosestNumber(nums);
		System.out.println(res);
	}

}
