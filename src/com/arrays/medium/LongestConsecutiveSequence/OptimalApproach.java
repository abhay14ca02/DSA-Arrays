package com.arrays.medium.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//You must write an algorithm that runs in O(n) time.
//Input: nums = [100,4,200,1,3,2], Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class OptimalApproach {
	private static int findLongestConsecutive(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}
		int longest = 1;
		// put all the array elements into set
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(nums[i]);
		}
		for (int val : nums) {
			// If current element is the starting element of a sequence
			if (set.contains(val) && !set.contains(val - 1)) {

				// Then check for next elements in the sequence
				int cur = val, count = 0;
				while (set.contains(cur)) {

					// Remove this number to avoid recomputation
					set.remove(cur);
					cur++;
					count++;
				}
				// Update optimal length
				longest = Math.max(longest, count);
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		int longest = findLongestConsecutive(nums);
		System.out.println(longest);
	}
}
//Time Complexity : O(N) + O(2*N) = O(3N)
//Space Complexity : O(N)