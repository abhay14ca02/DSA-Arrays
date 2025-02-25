package com.arrays.medium.MinimumAverageDifference;

//Minimum Average Difference
public class OptimalSolution {
	private static int minimumAverageDifference(int[] nums) {
		int n = nums.length;
		long totalSum = 0;
		// Total Sum
		for (int i = 0; i < n; i++) {
			totalSum += nums[i];
		}
		int minAvgDiff = Integer.MAX_VALUE;
		int idx = -1;
		long leftSum = 0;
		long rightSum = 0;
		for (int i = 0; i < n; i++) {
			leftSum += nums[i];
			rightSum = totalSum - leftSum;// rightSum+leftSum=totalSum
			int n1 = i + 1;
			int n2 = n - n1;// n1+n2=n
			long leftAvg = leftSum / n1;
			long righAgg = (i == n - 1) ? 0 : rightSum / n2;
			int diff = (int) Math.abs(leftAvg - righAgg);
			if (minAvgDiff > diff) {
				minAvgDiff = diff;
				idx = i;
			}
		}
		return idx;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 5, 3, 9, 5, 3 };
		int minAgvDiff = minimumAverageDifference(nums);
		System.out.println(minAgvDiff);
	}
}
//Time Complexity:O(N)+O(N)
//Space Complexity:O(1)