package com.arrays.easy.SortArraybyParityII;

//Input: nums = [4,2,5,7], Output: [4,5,2,7]
public class BruteApproach {
	private static int[] sortArrayByParityII(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		int i = 0;
		int j = 1;
		for (int num : nums) {

			if (num % 2 == 0) {
				result[i] = num;
				i += 2;
			} else {
				result[j] = num;
				j += 2;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 4, 2, 5, 7 };
		int[] result = sortArrayByParityII(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
