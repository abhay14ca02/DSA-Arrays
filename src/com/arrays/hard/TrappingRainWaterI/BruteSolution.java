package com.arrays.hard.TrappingRainWaterI;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1], Output: 6
//Input: height = [4,2,0,3,2,5], Output: 9
public class BruteSolution {
	private static int trapWater(int[] height) {
		int waterStored = 0;
		int n = height.length;
		// For every element of the array
		for (int i = 1; i < n - 1; i++) {

			// Find the maximum element on its left
			int leftMax = height[i];
			for (int j = 0; j < i; j++) {
				leftMax = Math.max(leftMax, height[j]);
			}
			// Find the maximum element on its right
			int rightMax = height[i];
			for (int j = i + 1; j < n; j++) {
				rightMax = Math.max(rightMax, height[j]);
			}
			// Update the maximum water
			waterStored += Math.min(leftMax, rightMax) - height[i];
		}

		return waterStored;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterStored = trapWater(height);
		System.out.println(waterStored);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)