package com.arrays.hard.SubarrayProductLessThanK;

//Given an array of integers nums and an integer k, return the number of contiguous 
//subarrays where the product of all the elements in the subarray is strictly less than k.
//Input: nums = [10,5,2,6], k = 100, Output: 8
//Explanation: The 8 subarrays that have product less than 100 are:
//[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]

public class OptimalApproach {

	public static int subarrayProductLessThanK(int[] nums, int k) {
		int n = nums.length;
		int prod = 1, total = 0, start = 0;
		for (int end = 0; end < n; end++) {
			prod *= nums[end];
			while (prod >= k && start <= end) {
				prod /= nums[start++];
			}
			total += end - start + 1;
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
//Time Complexity: O(N)
//Space Complexity : O(1)
