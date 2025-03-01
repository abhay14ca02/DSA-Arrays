package com.arrays.medium.InsertIntervals;

import java.util.ArrayList;
import java.util.List;

public class OptimalSolution {

	private static int[][] insert(int[][] intervals, int[] newInterval) {
		int i = 0;
		List<int[]> result = new ArrayList<>();
		int n = intervals.length;

		while (i < n) {
			if (intervals[i][1] < newInterval[0]) {
				result.add(intervals[i]);
			} else if (intervals[i][0] > newInterval[1]) {
				break;
			} else {
				// Merge the intervals and check further
				newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
				newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			}
			i++;
		}

		result.add(newInterval);
		while (i < n) {
			result.add(intervals[i]);
			i++;
		}

		return result.toArray(new int[result.size()][]);
	}

	public static void main(String[] args) {
		int[][] intervals = { { 1, 3 }, { 6, 9 } };
		int[] newInterval = { 2, 5 };
		int[][] result = insert(intervals, newInterval);
		for (int i = 0; i < result.length; i++) {
			System.out.print("{" + result[i][0] + " " + result[i][1] + "} ");
		}
	}
}
//T.C : O(n)
//S.C : O(n)