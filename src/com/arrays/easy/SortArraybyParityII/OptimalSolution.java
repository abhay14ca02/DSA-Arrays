package com.arrays.easy.SortArraybyParityII;

//Input: nums = [4,2,5,7], Output: [4,5,2,7]
public class OptimalSolution {
	private static int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;
		for (int i = 0, j = 1; i < n; i += 2) {
			if (nums[i] % 2 == 1) {
				while (nums[j] % 2 == 1) {
					j += 2;
				}
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 2, 5, 7 };
		int[] result = sortArrayByParityII(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)