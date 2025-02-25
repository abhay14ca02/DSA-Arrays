package com.arrays.easy.SortArraybyParityI;

//Input: nums = [3,1,2,4], Output: [2,4,3,1]
public class BruteSolution {

	private static int[] sortArrayByParity(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];

		int j = n - 1;
		int i = 0;
		for (int num : nums) {
			if (num % 2 == 0) {
				result[i++] = num;
			}
			if (num % 2 != 0) {
				result[j--] = num;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 4 };
		int[] result = sortArrayByParity(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)