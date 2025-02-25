package com.arrays.medium.FindifArrayCanBeSorted;

//Input: nums = [8,4,2,30,15], Output: true
public class OptimalSolution {
	private static boolean canSortArray(int[] nums) {

		int n = nums.length;
		// Current Segment
		int numOfSetBits = Integer.bitCount(nums[0]);
		int maxOfSegment = nums[0];
		int minOfSegment = nums[0];
		int maxOfPrevSegment = Integer.MIN_VALUE;

		for (int i = 1; i < n; i++) {
			if (Integer.bitCount(nums[i]) == numOfSetBits) { // they belong to the same segment
				// Find max of current segment
				maxOfSegment = Math.max(maxOfSegment, nums[i]);
				// Find min of current segment
				minOfSegment = Math.min(minOfSegment, nums[i]);
			} else { // Element belongs to a new segment

				if (minOfSegment < maxOfPrevSegment) { // condition to check proper segment arrangement
					return false;
				}

				// Update the previous segment's max
				maxOfPrevSegment = maxOfSegment;

				// New segment starts now
				maxOfSegment = nums[i];
				minOfSegment = nums[i];
				numOfSetBits = Integer.bitCount(nums[i]);
			}
		}

		// Final check for proper segment arrangement
		if (minOfSegment < maxOfPrevSegment) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = { 8, 4, 2, 30, 15 };
		boolean res = canSortArray(nums);
		System.out.println(res);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)