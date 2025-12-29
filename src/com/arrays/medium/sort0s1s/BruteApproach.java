package com.arrays.medium.sort0s1s;

import java.util.Arrays;

//Given an array of length N consisting of only 0s and 1s in random order. 
//Modify the array to segregate 0s on the left and 1s on the right side of the array.
//Input: N = 5, arr[ ] = {1,0,1,1,0}, Output: {0,0,1,1,1}
//Input: N  = 5 , arr[ ] = {1,0,0,0,1}, Output: {0,0,0,1,1}
public class BruteApproach {

	private static void segregateNums(int[] nums) {
		Arrays.sort(nums);
	}

	private static void segregateNums1(int[] nums) {
		int n = nums.length;
		int res[] = new int[n];
		int idx = 0;
		// First copy all zeros
		for (int i = 0; i < n; i++) {
			if (nums[i] == 0) {
				res[idx++] = nums[i];
			}
		}
		// Then copy all non-zeros
		for (int i = 0; i < n; i++) {
			if (nums[i] != 0) {
				res[idx++] = 1;
			}
		}
		System.out.println();
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 0, 0, 0, 1 };
		segregateNums(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		segregateNums1(nums);
	}
}
// First Approach
//Time Complexity: O(NLogN)
//Space Complexity: O(1)
// Second Approach
//Time Complexity : O(N)
//Space Complexity : O(N)