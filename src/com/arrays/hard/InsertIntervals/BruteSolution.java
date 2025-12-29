package com.arrays.hard.InsertIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given an array of non-overlapping intervals where intervals[i] = [starti, endi] 
//represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. 
//You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
//Insert newInterval into intervals such that intervals is still sorted in ascending order by starti 
//and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
//Return intervals after the insertion.
//Note that you don't need to modify intervals in-place. You can make a new array and return it.
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5], Output: [[1,5],[6,9]]

public class BruteSolution {
	private static int[][] insert(int[][] intervals, int[] newInterval) {

		int n = intervals.length;
		if (n == 0)
			return new int[0][0];

		List<int[]> intervals2 = new ArrayList<>(Arrays.asList(intervals));
		intervals2.add(newInterval);
		// Sort intervals by start
		intervals2.sort((a, b) -> Integer.compare(a[0], b[0]));
		List<int[]> merged = new ArrayList<>();
		// Add the first interval
		merged.add(intervals2.get(0));
		for (int i = 1; i < intervals2.size(); i++) {// Start from 1
			int[] current = intervals2.get(i);
			int[] last = merged.get(merged.size() - 1);
			// Check if there is an overlap with the last interval in the merged list.
			if (last[1] < current[0]) {
				// No overlap, so we can add the current interval as it is.
				merged.add(current);
			} else {
				// Overlap exists, so we extend the last interval's end time.
				last[1] = Math.max(last[1], current[1]);
			}
		}
		return merged.toArray(new int[merged.size()][]);
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
//T.C : O(NLogN) + O(n)
//S.C : O(N) + O(N)