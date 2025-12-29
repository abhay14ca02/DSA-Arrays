package com.arrays.medium.FindMiddleIndex;

//Given a 0-indexed integer array nums, find the leftmost middleIndex 
//(i.e., the smallest amongst all the possible ones).
//A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == 
//nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
//If middleIndex == 0, the left side sum is considered to be 0. Similarly, 
//if middleIndex == nums.length - 1, the right side sum is considered to be 0.
//Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
//Input: nums = [2,3,-1,8,4], Output: 3
//Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4,The sum of the numbers after index 3 is: 4 = 4
public class OptimalSolution {

	private static int findMiddleIndex(int[] nums) {

		int n = nums.length;
		long totalSum = 0;
		for (int num : nums) {
			totalSum += num;
		}
		long leftSum = 0;
		for (int j = 0; j < n; j++) {
			long rightSum = totalSum - leftSum - nums[j];
			if (leftSum == rightSum) {
				return j;
			}
			leftSum += nums[j];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -1, 8, 4 };
		int res = findMiddleIndex(nums);
		System.out.println(res);
	}
}
// Time Complexity : O(N+N)
// Space Complexity : O(1)