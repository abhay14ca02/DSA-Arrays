package com.arrays.medium.rearrangearrayelementsbysign;

//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//You should return the array of nums such that the the array follows the given conditions:
//You should return the array of nums such that the the array follows the given conditions:
//Every consecutive pair of integers have opposite signs.
//For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.
//Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]
public class BetterRearrangeArrayBySign {

	private static int[] rearrangeArrayBySign(int[] nums) {

		int n = nums.length;
		int[] posArr = new int[n / 2];
		int[] negArr = new int[n / 2];
		int posSign = 0;
		int negSign = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				posArr[posSign] = nums[i];
				posSign++;
			} else {
				negArr[negSign] = nums[i];
				negSign++;
			}
		}
		posSign = 0;
		negSign = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				nums[i] = posArr[posSign];
				posSign++;
			} else {
				nums[i] = negArr[negSign];
				negSign++;
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int[] nums = { 3, 1, -2, -5, 2, -4 };
		int[] result = rearrangeArrayBySign(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}
//Time Complexity : O(N) + O(N)
//Space Complexity : O(N)