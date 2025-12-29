package com.arrays.medium.LongestConsecutiveSequence;

import java.util.Arrays;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Input: nums = [100,4,200,1,3,2], Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class BetterApproach {
	private static int findLongestConsecutive(int[] nums) {

		int n = nums.length;
		if (n < 1) {
			return 0;
		}
		int longest = 1;
		int count = 1;
		// Sort the array
		Arrays.sort(nums);
		// Find the maximum length by traversing the array
		for (int i = 1; i < n; i++) {
			// Skip duplicates
			if (nums[i] == nums[i - 1]) {
				continue;
			}
			// Check if the current element is equal to previous element + 1
			if (nums[i] == nums[i - 1] + 1) {
				count++;
			} else {
				// Reset the count
				count = 1;
			}
			longest = Math.max(longest, count);
		}
		return longest;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		int longest = findLongestConsecutive(nums);
		System.out.println(longest);
	}

}

// Time Complexity : O(NLogN) + O(N)
// Space Complexity : O(1)
