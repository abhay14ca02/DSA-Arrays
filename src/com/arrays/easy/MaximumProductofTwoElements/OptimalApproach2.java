package com.arrays.easy.MaximumProductofTwoElements;

//Given the array of integers nums, you will choose two different indices i and j of that array. 
//Return the maximum value of (nums[i]-1)*(nums[j]-1).
//Input: nums = [3,4,5,2], Output: 12 
//Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, 
//that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
public class OptimalApproach2 {

	private static int maxProduct(int[] nums) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			if (nums[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = nums[i];
			} else {
				secondLargest = Math.max(secondLargest, nums[i]);
			}
		}
		return ((firstLargest - 1) * (secondLargest - 1));
	}

	public static void main(String[] args) {
		int[] nums = { 1, 5, 4, 5 };
		int maxProduct = maxProduct(nums);
		System.out.println(maxProduct);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(1)