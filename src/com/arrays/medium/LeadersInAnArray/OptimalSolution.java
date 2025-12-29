package com.arrays.medium.LeadersInAnArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given an array arr[] of size n, the task is to find all the Leaders in the array. 
//An element is a Leader if it is greater than or equal to all the elements to its right side.
//Note: The rightmost element is always a leader or The last element is always a leader

//Input: arr[] = [16, 17, 4, 3, 5, 2], Output: [17 5 2]
//Input: arr[] = [1, 2, 3, 4, 5, 2], Output: [5 2]

public class OptimalSolution {

	private static List<Integer> findLeaders(int[] arr) {

		List<Integer> leaders = new ArrayList<Integer>();
		int n = arr.length;

		// The last element is always a leader
		int maxFromRight = arr[n - 1];

		leaders.add(maxFromRight);

		for (int i = n - 2; i >= 0; i--) {

			if (arr[i] > maxFromRight) {
				maxFromRight = arr[i];
				leaders.add(maxFromRight);
			}
		}
		Collections.reverse(leaders);
		return leaders;
	}

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		List<Integer> leaders = findLeaders(arr);
		System.out.println(leaders);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(1)