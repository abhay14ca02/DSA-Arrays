package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//Input: nums = [1,2,0]
//Output: 3
//Input: nums = [3,4,-1,1]
//Output: 2
//Input: nums = [7,8,9,11,12]
//Output: 1
public class Optimal1FirstPositiveMissing {

	private static int findFirstPositiveMissing(int[] nums) {

		int n = nums.length;
		boolean contains1 = false;
		for (int i = 0; i < n; i++) {
			if (nums[i] == 1) {
				contains1 = true;
			}

			if (nums[i] <= 0 || nums[i] > n) {// [1,n]
				nums[i] = 1;
			}
		}
		if (contains1 == false) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			int num = Math.abs(nums[i]);
			int idx = num - 1;
			if (nums[idx] < 0) {
				continue;
			}
			nums[idx] *= -1;
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				return i + 1;
			}
		}
		return n + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 0 };
		int firstMissing = findFirstPositiveMissing(nums);
		System.out.println(firstMissing);
	}
}
