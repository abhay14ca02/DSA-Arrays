package com.arrays.hard.TrappingRainWaterI;

//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining.
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1], Output: 6
//Input: height = [4,2,0,3,2,5], Output: 9
public class OptimalSolution2 {

	private static int trapWater(int[] height) {
		int n = height.length;
		int waterStored = 0;
		int left = 0, right = n - 1;
		int leftMax = 0, rightMax = 0;

		// Iterate until left meets right
		while (left < right) {
			leftMax = Math.max(leftMax, height[left]);
			rightMax = Math.max(rightMax, height[right]);

			// Compare leftMax and rightMax

			if (leftMax < rightMax) {
				waterStored += leftMax - height[left];
				left++;
			} else {
				waterStored += rightMax - height[right];
				right--;
			}
		}
		return waterStored;
	}

	public static void main(String[] args) {
		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int waterStored = trapWater(height);
		System.out.println(waterStored);
	}
}

//Time Complexity :O(N)
//Space Complexity : O(1)