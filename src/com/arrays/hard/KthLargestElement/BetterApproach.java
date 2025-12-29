package com.arrays.hard.KthLargestElement;

import java.util.PriorityQueue;

//Given an integer array nums and an integer k, return the kth largest element in the array.
//Note that it is the kth largest element in the sorted order, not the kth distinct element.
//Can you solve it without sorting?
//Input: nums = [3,2,1,5,6,4], k = 2, Output: 5
//Input: nums = [3,2,3,1,2,4,5,5,6], k = 4, Output: 4
public class BetterApproach {

	public static int findKthLargest(int[] nums, int k) {

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int num : nums) {
			queue.offer(num);
			if (queue.size() > k) {
				queue.poll();
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
		int res = findKthLargest(nums, k);
		System.out.println(res);

	}
}

//Time Complexity : O(NLogK)
//Space Complexity : O(K)