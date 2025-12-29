package com.arrays.hard.KthSmallestElement;

import java.util.Collections;
import java.util.PriorityQueue;

//Given an integer array arr[] and k. Find the k'th smallest element in the given array.
//Note: k is always smaller than the size of the array.
//Input: arr[] = [10, 5, 4, 3, 48, 6, 2, 33, 53, 10], k = 4, Output: 5
//Explanation: 4th smallest element in the given array is 5.
public class OptimalApproach {

	private static int findKthSmallest(int[] nums, int k) {

		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int num : nums) {
			heap.offer(num);
			if (heap.size() > k) {
				heap.poll();
			}
		}
		return heap.peek();
	}

	public static void main(String[] args) {

		int[] nums = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
		int k = 4;
		int res = findKthSmallest(nums, k);
		System.out.println(res);
	}
}

//Time Complexity : O(NLogK)
//Space Complexity: O(K)