package com.arrays.hard.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimalSolution {
	private static int[][] merge(int[][] intervals) {
		int n = intervals.length;
		if (n == 0)
			return new int[0][0];

		// Sort intervals by start
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

		List<int[]> mergedIntervals = new ArrayList<>();
		// Add the first interval
		mergedIntervals.add(intervals[0]);

		for (int i = 1; i < n; i++) {// Start from 1
			int start = intervals[i][0];
			int end = intervals[i][1];

			// Get the last interval in the merged list.
			int[] last = mergedIntervals.get(mergedIntervals.size() - 1);
			// Check if there is an overlap with the last interval in the merged list.
			if (last[1] < start) {
				// No overlap, so we can add the current interval as it is.
				mergedIntervals.add(intervals[i]);
			} else {
				// Overlap exists, so we extend the last interval's end time.
				last[1] = Math.max(last[1], end);
			}
		}
		return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] result = merge(intervals);
		for (int i = 0; i < result.length; i++) {
			System.out.print("{" + result[i][0] + " " + result[i][1] + "} ");
		}
	}
}
//Time Complexity : O(NLogN) + O(N)
//Space Complexity : O(N)
