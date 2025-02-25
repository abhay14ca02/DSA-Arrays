package com.arrays.medium.MaximumBeautyofanArrayAfterApplyingOperation;

import java.util.Arrays;

//Maximum Beauty of an Array After Applying Operation

public class OptimalSolution {

	private static int maximumBeauty(int[] nums, int k) {
		Arrays.sort(nums);// NLogN
		int n = nums.length;
		int maxBeauty = 0;
		int i = 0;
		int j = 0;
		while (i < n) {
			while (j < n && nums[j] <= nums[i] + 2 * k) {// y=x+2*k
				j++;
			}
			maxBeauty = Math.max(maxBeauty, j - i);
			i++;
		}
		return maxBeauty;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 6, 1, 2 };
		int k = 2;
		int maxBeauty = maximumBeauty(nums, k);
		System.out.println(maxBeauty);
	}
}
//Time Complexity : O(NlogN)+O(N+N)=> O(N+NlogN)
//Space Complexity : O(1)