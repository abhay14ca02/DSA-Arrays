package com.arrays.easy.MaximumProductofTwoElements;

//Given the array of integers nums, you will choose two different indices i and j of that array. 
//Return the maximum value of (nums[i]-1)*(nums[j]-1).
//Input: nums = [3,4,5,2], Output: 12 
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, 
//that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
public class OptimalApproach1 {

	private static int maxProduct(int[] nums) {
		int n = nums.length;
		int maxRes = 0;
		int currentMax = nums[0];
		for (int i = 1; i < n; i++) {
			maxRes = Math.max(maxRes, (currentMax - 1) * (nums[i] - 1));
			currentMax = Math.max(currentMax, nums[i]);
		}
		return maxRes;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 2 };
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(1)