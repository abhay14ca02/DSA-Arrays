package com.arrays.medium.sortcolors;

import java.util.Arrays;

//Given an array nums with n objects colored red, white, or blue, sort them in-place 
//so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
//You must solve this problem without using the library's sort function.
//Input: nums = [2,0,2,1,1,0], Output: [0,0,1,1,2,2]
//Input: nums = [2,0,1], Output: [0,1,2]
public class BruteSortColors {
	private static void sortColors(int[] nums) {
		// Sort the nums array
		Arrays.sort(nums);
	}

	private static int[] sort012(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];

		int count0 = 0, count1 = 0;

		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				count0++;
			} else if (nums[i] == 1) {
				count1++;
			}
		}

		for (int i = 0; i < count0; i++) {
			res[i] = 0;
		}

		for (int j = count0; j < count0 + count1; j++) {
			res[j] = 1;
		}

		for (int k = count0 + count1; k < n; k++) {
			res[k] = 2;
		}

		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 0, 2, 1, 1, 0 };
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("=========================");
		int[] res = sort012(nums);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
//Approach 1
//Time Complexity : O(NLogN)
//Space Complexity : O(1)

//Approach 2
//Time Complexity : O(N) + O(N)
//Space Complexity : O(N)