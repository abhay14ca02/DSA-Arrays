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
public class BruteApproach {

	private static int findMiddleIndex(int[] nums) {

		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 0; j <i; j++) {
				leftSum += nums[j];
			}
			for (int k = i + 1; k < n; k++) {
				rightSum += nums[k];
			}
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -1, 8, 4 };
		int res = findMiddleIndex(nums);
		System.out.println(res);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)
