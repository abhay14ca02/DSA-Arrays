package com.arrays.easy.SetMismatch;

//You have a set of integers s, which originally contains all the numbers from 1 to n. 
//Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
//which results in repetition of one number and loss of another number.
//Input: nums = [1,2,2,4], Output: [2,3]
public class OptimalSolution {

	private static int[] findErrorNums(int[] nums) {

		int n = nums.length;
		int duplicate = -1;
		int missing = -1;
		for (int i = 0; i < n; i++) {
			int idx = Math.abs(nums[i]) - 1;
			if (nums[idx] < 0) {
				duplicate = Math.abs(nums[i]);
			} else {
				nums[idx] *= -1;
			}
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] > 0) {
				missing = (i + 1);
				break;
			}
		}
		int[] ans = { duplicate, missing };
		return ans;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 4 };
		int[] ans = findErrorNums(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
//Time Complexity : O(N)
//Space Complexity: O(1)