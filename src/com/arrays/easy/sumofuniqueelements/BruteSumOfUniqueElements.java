package com.arrays.easy.sumofuniqueelements;

//Sum of Unique Elements
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array
public class BruteSumOfUniqueElements {
	private static int sumOfUniqueElements(int[] nums) {

		int sum = 0;
		for (int i = 0; i < nums.length; i++) {

			int count = 1;

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {

					count++;
					nums[j] = Integer.MAX_VALUE;
				}
			}

			if (nums[i] != Integer.MAX_VALUE) {

				if (count == 1) {

					sum = sum + nums[i];
				}
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		System.out.println(sumOfUniqueElements(nums));
	}

}
