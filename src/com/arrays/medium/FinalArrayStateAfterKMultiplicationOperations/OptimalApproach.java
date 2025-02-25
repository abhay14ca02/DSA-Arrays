package com.arrays.medium.FinalArrayStateAfterKMultiplicationOperations;

import java.util.PriorityQueue;

//You are given an integer array nums, an integer k, and an integer multiplier.
//You need to perform k operations on nums. In each operation:
//Find the minimum value x in nums. If there are multiple occurrences of the minimum value, select the one that appears first.
//Replace the selected minimum value x with x * multiplier.
//Return an integer array denoting the final state of nums after performing all k operations.
public class OptimalApproach {
	private static int[] getFinalState(int[] nums, int k, int multiplier) {

		// Priority queue to store pairs of (value, index) with a custom comparator
		PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> {
			int valueComparison = Integer.compare(a[0], b[0]);
			if (valueComparison == 0) {
				return Integer.compare(a[1], b[1]);
			}
			return valueComparison;

		});
		// Initialize the heap with values and their indices
		for (int i = 0; i < nums.length; i++) {
			heap.offer(new int[] { nums[i], i });
		}
		
		// Perform k iterations
		while (k-- > 0) {
			// Extract the smallest element
			int[] temp = heap.poll();
			int idx = temp[1];
			int number = temp[0];

			// Update the array and reinsert the updated value into the heap
			nums[idx] = number * multiplier;
			heap.offer(new int[] { nums[idx], idx });
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 1, 3, 5, 6 };
		int k = 5;
		int multiplier = 2;
		int[] finalState = getFinalState(nums, k, multiplier);
		for (int i = 0; i < finalState.length; i++) {
			System.out.print(finalState[i] + " ");
		}
	}
}
