package com.arrays.hard.CountInversions;

//Given an array of N integers, count the inversion of the array (using merge-sort).
//Inversion of an array: for all i & j < size of array, if i < j 
//then you have to find pair (A[i],A[j]) such that A[j] < A[i].
//Input: array[]:{1,2,3,4,5}, Output = 0
//Input array[] = {5,4,3,2,1}, Output = 10
public class BruteApproach {

	private static int inversionCount(int[] nums) {
		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] > nums[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };
		int count = inversionCount(nums);
		System.out.println(count);
	}
}

//Time Complexity : O(N^2)
//Space Complexity : O(1)