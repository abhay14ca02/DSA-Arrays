package com.arrays.medium.CheckifArrayIsSortedandRotated;

public class OptimalSolution {
	private static boolean checkSortedRotated(int[] nums) {
		int n = nums.length;
		int peak = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] > nums[(i + 1) % n]) {
				peak++;
			}
		}
		return peak <= 1;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 4, 5, 1, 2 };
		boolean check = checkSortedRotated(nums);
		System.out.println(check);
	}

}
//Time Complexity : O(N)
//Space Complexity : O(1)