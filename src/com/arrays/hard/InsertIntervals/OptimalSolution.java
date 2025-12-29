package com.arrays.hard.InsertIntervals;

import java.util.ArrayList;
import java.util.List;

//You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] 
//represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. 
//You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
//Insert newInterval into intervals such that intervals is still sorted in ascending order by starti 
//and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
//Return intervals after the insertion.
//Note that you don't need to modify intervals in-place. You can make a new array and return it.
//Input: intervals = [[1,3],[6,9]], newInterval = [2,5], Output: [[1,5],[6,9]]

public class OptimalSolution {

	private static int[][] insert(int[][] intervals, int[] newInterval) {
		List<int[]> result = new ArrayList<>();
		int n = intervals.length, i = 0;
		while (i < n) {
			if (intervals[i][1] < newInterval[0]) {
				result.add(intervals[i]); // Interval completely before newInterval
			} else if (intervals[i][0] > newInterval[1]) {
				break; // Interval completely after newInterval, stop merging
			} else {
				// Merge the intervals and check further
				newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
				newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
			}
			i++;
		}
		// Add the merged newInterval
		result.add(newInterval);

		// Add remaining intervals after newInterval
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