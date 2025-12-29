package com.arrays.hard.containerwithmostwater;

//You are given an integer array height of length n. There are n vertical lines drawn such that the 
//two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Input: height = [1,8,6,2,5,4,8,3,7], Output: 49
//Input: height = [1,1], Output: 1
public class OptimalApproach {
	private static int maxArea(int[] height) {

		int maxWater = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			int wt = right - left;
			int ht = Math.min(height[left], height[right]);
			int currentWater = wt * ht;
			maxWater = Math.max(maxWater, currentWater);
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxWater;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		int maxWater = maxArea(height);
		System.out.println(maxWater);
	}
}
//Time Complexity : O(N)
//Space Complexity :O(1)