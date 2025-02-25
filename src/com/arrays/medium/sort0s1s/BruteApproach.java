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
	public static void main(String[] args) {
		int [] nums = {1,0,0,0,1};
		segregateNums(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
//Time Complexity:O(NLogN)
//Space Complexity:O(1)