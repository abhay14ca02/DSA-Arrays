package com.arrays.medium.LongestConsecutiveSequence;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Input: nums = [100,4,200,1,3,2], Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class BruteApproach {

	private static int findLongestConsecutive(int[] nums) {

		int n = nums.length;
		if (n < 1) {
			return 0;
		}
		int longest = 1;
		// pick a element and search for its
		// consecutive numbers:
		for (int i = 0; i < n; i++) {
			int ele = nums[i];
			int count = 1;
			// search for consecutive numbers
			// using linear search:
			while (linearSearch(nums, ele + 1) == true) {
				ele += 1;
				count += 1;
			}
			longest = Math.max(count, longest);
		}

		return longest;
	}

	private static boolean linearSearch(int[] nums, int ele) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == ele) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums = { 100, 4, 200, 1, 3, 2 };
		int longest = findLongestConsecutive(nums);
		System.out.println(longest);
	}

}
//Time Complexity:O(N*N)
//Space Complexity:O(1)
