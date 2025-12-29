package com.arrays.easy.MaximumProductofTwoElements;

import java.util.Arrays;

//Given the array of integers nums, you will choose two different indices i and j of that array. 
//Return the maximum value of (nums[i]-1)*(nums[j]-1).
//Input: nums = [3,4,5,2], Output: 12 
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, 
//that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
public class BetterApproach {

	private static int maxProduct(int[] nums) {

		int n = nums.length;
		Arrays.sort(nums);

		return (nums[n - 1] - 1) * (nums[n - 2] - 1);
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 2 };
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
}
//Time Complexity:O(NLogN)
//Space Complexity:O(1)