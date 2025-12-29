package com.arrays.hard.TrappingRainWaterI;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1], Output: 6
//Input: height = [4,2,0,3,2,5], Output: 9
public class BetterSolution {

	private static int trapWater(int[] height) {
		int n = height.length;
		int[] leftMax = new int[n];
		int[] rightMax = new int[n];
		leftMax[0] = height[0];
		rightMax[n - 1] = height[n - 1];

		// For each index i from 1 to n-1: Build leftMax
		for (int i = 1; i < n; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], height[i]);
		}
		// For each index i from n-2 down to 0: Build rightMax
		for (int i = n - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], height[i]);
		}
		// Compute water at each index
		int waterStore = 0;
		for (int i = 0; i < n; i++) {
			int minHeight = Math.min(leftMax[i], rightMax[i]);
			int minWater = minHeight - height[i];

			if (minWater > 0) {
				waterStore += minWater;
			}
		}

		return waterStore;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterStored = trapWater(height);
		System.out.println(waterStored);
	}
}
//Time Complexity :O(N+N+N)----> O(3N)
//Space Complexity : O(N+N)----> O(2N)