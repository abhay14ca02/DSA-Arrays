package com.arrays.easy.CountElementsWithMaximumFrequency;

//You are given an array nums consisting of positive integers.
//Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//The frequency of an element is the number of occurrences of that element in the array.
//Input: nums = [1,2,2,3,1,4] ,Output: 4
//Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
//So the number of elements in the array with maximum frequency is 4.
//Input: nums = [1,2,3,4,5], Output: 5
//Explanation: All elements of the array have a frequency of 1 which is the maximum.
//So the number of elements in the array with maximum frequency is 5.
public class BetterApproach {

	private static int maxFrequencyElements(int[] nums) {

		int n = nums.length;
		int[] count = new int[101];
		int totalFreq = 0;
		int maxFreq = 0;
		for (int i = 0; i < n; i++) {
			count[nums[i]]++;
			maxFreq = Math.max(maxFreq, count[nums[i]]);
		}
		for (int i = 0; i < 101; i++) {
			if (count[i] == maxFreq) {
				totalFreq = totalFreq + maxFreq;
			}
		}
		return totalFreq;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 1, 4 };
		int totalFreq = maxFrequencyElements(nums);
		System.out.println(totalFreq);
	}
}
//Time Complexity : O(N) + O(N)
//Space Complexity : O(101) i.e, O(1)