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
public class BruteApproach {

	private static int maxFrequencyElements(int[] nums) {
		int n = nums.length;
		int totalFreq = 0;
		int maxFreq = 0;
		boolean isVisited[] = new boolean[n];

		// First pass → find max frequency
		for (int i = 0; i < n; i++) {
			if (isVisited[i])
				continue;
			int count = 0;
			for (int j = i; j < n; j++) {
				if (nums[i] == nums[j]) {
					isVisited[j] = true;
					count++;
				}
			}
			if (count > maxFreq) {
				maxFreq = count;
			}
		}
		// Reset visited array
		isVisited = new boolean[n];
		// Second pass → sum frequencies equal to maxFreq
		for (int i = 0; i < n; i++) {
			if (isVisited[i])
				continue;
			int count = 0;
			for (int j = i; j < n; j++) {
				if (nums[i] == nums[j]) {
					isVisited[j] = true;
					count++;
				}
			}
			if (count == maxFreq) {
				totalFreq += count;
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
//Time Complexity : O(N^2)
//Space Complexity : O(N)