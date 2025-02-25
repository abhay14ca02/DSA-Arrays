package com.arrays.medium.MergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BruteSolution {
	private static int[][] merge(int[][] intervals) {
		int n = intervals.length;
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> mergedIntervals = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int start = intervals[i][0];
			int end = intervals[i][1];
			// Skipping already merged intervals
			if (!mergedIntervals.isEmpty() && end <= mergedIntervals.get(mergedIntervals.size() - 1)[1]) {
				continue;
			}
			// Find the end of the merged range
			for (int j = i + 1; j < n; j++) {
				if (intervals[j][0] <= end) {
					end = Math.max(end, intervals[j][1]);
				} else {
					break;
				}
			}
			mergedIntervals.add(new int[] { start, end });
		}
		return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
		int[][] result = merge(intervals);
		for (int i = 0; i < result.length; i++) {
			System.out.print("{" + result[i][0] + " " + result[i][1] + "}");
		}

	}
}
//Time Complexity : O(NLonN) + O(2N)
//Space Complexity : O(N)