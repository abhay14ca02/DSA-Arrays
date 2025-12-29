package com.arrays.hard.smallestpositivemissingorfirstpositivemissing;

//Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//Input: nums = [1,2,0], Output: 3
//Input: nums = [3,4,-1,1], Output: 2

public class BruteSolution {

	private static int findSmallestPositiveMissing(int[] arr) {

		int smallest = 1;

		while (true) {
			boolean isSmallest = false;
			for (int num : arr) {
				if (num == smallest) {
					isSmallest = true;
					break;
				}
			}
			if (!isSmallest) {
				return smallest; // first missing positive
			}
			smallest++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		// int[] arr = { 0, -10, 1, 3, -20, 1 };
		int smallestMissing = findSmallestPositiveMissing(arr);
		System.out.println("Smallest Positive Missing Number is " + smallestMissing);

	}

}
// Time Complexity : O(N*N)
// Space Complexity : O(1)
