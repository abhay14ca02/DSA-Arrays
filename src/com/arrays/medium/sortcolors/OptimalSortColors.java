package com.arrays.medium.sortcolors;

//Given an array nums with n objects colored red, white, or blue, sort them in-place 
//so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Input: nums = [2,0,2,1,1,0], Output: [0,0,1,1,2,2]
//Input: nums = [2,0,1], Output: [0,1,2]
public class OptimalSortColors {
	private static void sortColors(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				int temp = nums[mid];
				nums[mid] = nums[low];
				nums[low] = temp;
				low++;
				mid++;
			} else if (nums[mid] == 0) {
				mid++;
			} else {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
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
