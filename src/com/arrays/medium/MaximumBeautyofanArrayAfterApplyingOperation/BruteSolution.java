package com.arrays.medium.MaximumBeautyofanArrayAfterApplyingOperation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
//Maximum Beauty of an Array After Applying Operation

public class BruteSolution {

	private static int maximumBeauty(int[] nums, int k) {

		// Convert nums into ranges
		List<int[]> ranges = new ArrayList<>();

		for (int num : nums) {
			ranges.add(new int[] { num - k, num + k });
		}
		// Sort the ranges based on their start point
		ranges.sort((a, b) -> Integer.compare(a[0], b[0]));

		int maxBeauty = 0;
		Deque<Integer> deque = new ArrayDeque<>();
		// Iterate over sorted ranges
		for (int[] range : ranges) {
			while (!deque.isEmpty() && deque.peekFirst() < range[0]) {
				deque.pollFirst();
			}
			deque.offerLast(range[1]);

			maxBeauty = Math.max(maxBeauty, deque.size());
		}

		return maxBeauty;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 6, 1, 2 };
		int k = 2;
		int maxBeauty = maximumBeauty(nums, k);
		System.out.println(maxBeauty);
	}

}
//Time Complexity : O(NlogN)
//Space Complexity : O(N)
