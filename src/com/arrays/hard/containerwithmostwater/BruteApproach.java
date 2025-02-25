package com.arrays.hard.containerwithmostwater;

//You are given an integer array height of length n. There are n vertical lines drawn such that the 
//two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//Input: height = [1,8,6,2,5,4,8,3,7], Output: 49
//Input: height = [1,1], Output: 1
public class BruteApproach {

	private static int maxArea(int[] height) {
		int maxWater = 0;
		int n = height.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int wt = (j - i);
				int ht = Math.min(height[i], height[j]);
				int currentWater = wt * ht;
				maxWater = Math.max(maxWater, currentWater);
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
//Time Complexity : O(N*N)
//Space Complexity :O(1)