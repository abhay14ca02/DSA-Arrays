package com.arrays.easy.SquaresofaSortedArray;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10], Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
public class OptimalApproach {
	private static int[] sortedSquares(int[] nums) {

		int n = nums.length;
		int start = 0;
		int end = n - 1;
		int i = n - 1;
		int[] result = new int[n];
		while (i >= 0) {

			int startSquare = nums[start] * nums[start];
			int endSquare = nums[end] * nums[end];
			if (endSquare > startSquare) {
				result[i] = endSquare;
				end--;
			} else {
				result[i] = startSquare;
				start++;
			}
			i--;
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = { -4, -1, 0, 3, 10 };
		int[] result = sortedSquares(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity:O(N)
//Space Complexity:O(N)