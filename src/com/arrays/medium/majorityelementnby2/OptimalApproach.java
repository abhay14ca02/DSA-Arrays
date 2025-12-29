package com.arrays.medium.majorityelementnby2;

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists in the array.
//Input: nums = [3,2,3], Output: 3
//Input: nums = [2,2,1,1,1,2,2], Output: 2
public class OptimalApproach {
	private static int majorityElement(int[] nums) {

		int n = nums.length;

		int majorityElement = 0;
		int count = 0;

		for (int num : nums) {
			if (count == 0) {
				majorityElement = num;
			}
			if (majorityElement == num) {
				count++;
			} else {
				count--;
			}
		}

		// Checking if the stored element is the majority element: we need to check this
		// if there is no majority element
		// If there is certain majority element then simply we can return majority
		// element.

		int cnt1 = 0;
		for (int num : nums) {
			if (num == majorityElement)
				cnt1++;
		}

		return (cnt1 > n / 2) ? majorityElement : -1;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int element = majorityElement(nums);
		System.out.println(element);
	}
}
//Time Complexity:O(N)
//Space Complexity:O(1)