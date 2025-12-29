package com.arrays.medium.LeadersInAnArray;

import java.util.ArrayList;
import java.util.List;

//Given an array arr[] of size n, the task is to find all the Leaders in the array. 
//An element is a Leader if it is greater than or equal to all the elements to its right side.
//Note: The rightmost element is always a leader or The last element is always a leader

//Input: arr[] = [16, 17, 4, 3, 5, 2], Output: [17 5 2]
//Input: arr[] = [1, 2, 3, 4, 5, 2], Output: [5 2]

public class BruteApproach1 {

	private static List<Integer> findLeaders(int[] arr) {

		List<Integer> leaders = new ArrayList<Integer>();
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			boolean isLeader = true;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] >= arr[i]) {
					isLeader = false;
					break;
				}
			}
			if (isLeader) {
				leaders.add(arr[i]);
			}
		}

		return leaders;
	}

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		List<Integer> leaders = findLeaders(arr);
		System.out.println(leaders);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)