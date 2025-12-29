package com.arrays.medium.sortcolors;

//Given an array nums with n objects colored red, white, or blue, sort them in-place 
//so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Input: nums = [2,0,2,1,1,0], Output: [0,0,1,1,2,2]
//Input: nums = [2,0,1], Output: [0,1,2]
public class BetterSortColors {
	private static void sortColors(int[] nums) {
		int count0 = 0, count1 = 0;
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				count0++;
			} else if (nums[i] == 1) {
				count1++;
			}
		}
		for (int i = 0; i < count0; i++) {
			nums[i] = 0;
		}
		for (int i = count0; i < count0 + count1; i++) {
			nums[i] = 1;
		}
		for (int i = count0 + count1; i < n; i++) {
			nums[i] = 2;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
//Time Complexity : O(N) + O(N)
//Space Complexity : O(1)