package com.arrays.hard.TrappingRainWaterI;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1], Output: 6
//Input: height = [4,2,0,3,2,5], Output: 9
public class OptimalSolution {

	private static int trapWater(int[] height) {
		int n = height.length;
		int leftMax = 0;
		int rightMax = 0;
		int maxHeight = height[0];
		int maxIndex = 0;
		int waterStored = 0;
		// Max height building
		for (int i = 0; i < n; i++) {
			if (height[i] > maxHeight) {
				maxHeight = height[i];
				maxIndex = i;
			}
		}
		// Left max
		for (int i = 0; i < maxIndex; i++) {
			if (leftMax > height[i]) {
				waterStored += leftMax - height[i];
			} else {
				leftMax = height[i];
			}
		}
		for (int i = n - 1; i > maxIndex; i--) {
			if (rightMax > height[i]) {
				waterStored += rightMax - height[i];
			} else {
				rightMax = height[i];
			}
		}
		// Right max
		return waterStored;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterStored = trapWater(height);
		System.out.println(waterStored);
	}
}
//Time Complexity : O(N) + O(maxIndex) + O(N-maxIndex) == O(2N)
//Space Complexity : O(1)
