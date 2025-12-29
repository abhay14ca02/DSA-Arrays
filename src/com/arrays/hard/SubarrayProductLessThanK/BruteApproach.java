package com.arrays.hard.SubarrayProductLessThanK;

//Given an array of integers nums and an integer k, return the number of contiguous 
//subarrays where the product of all the elements in the subarray is strictly less than k.
//Input: nums = [10,5,2,6], k = 100, Output: 8
//Explanation: The 8 subarrays that have product less than 100 are:
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]

public class BruteApproach {
	public static int subarrayProductLessThanK(int[] nums, int k) {

		int n = nums.length, total = 0;
		for (int i = 0; i < n; i++) {
			int prod = 1;
			for (int j = i; j < n; j++) {
				prod *= nums[j];
				if (prod < k) {
					total += 1;
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int[] nums = { 10, 5, 2, 6 };
		int k = 100;
		int res = subarrayProductLessThanK(nums, k);
		System.out.println(res);

	}
}
//Time Complexity: O(N^2)
//Space Complexity : O(1)