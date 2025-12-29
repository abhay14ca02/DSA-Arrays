package com.arrays.medium.majorityelementnby3;

import java.util.ArrayList;
import java.util.List;

//Given an integer array of size n, find all elements that appear more than [ n/3 ] times.
//Input: nums = [3,2,3], Output: [3]
//Input: nums = [1], Output: [1]
//Input: nums = [1,2], Output: [1,2]

public class OptimalApproach {
	private static List<Integer> findMajorityElement(int[] nums) {
		int n = nums.length;
		int count1 = 0, majorityEle1 = 0;
		int count2 = 0, majorityEle2 = 0;
		for (int num : nums) {
			if (num == majorityEle1) {
				count1++;
			} else if (num == majorityEle2) {
				count2++;
			} else if (count1 == 0) {
				majorityEle1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				majorityEle2 = num;
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}

		List<Integer> result = new ArrayList<Integer>();
		count1 = 0;
		count2 = 0;
		for (int num : nums) {
			if (num == majorityEle1) {
				count1++;
			} else if (num == majorityEle2) {
				count2++;
			}
		}
		if (count1 > n / 3)
			result.add(majorityEle1);
		if (count2 > n / 3)
			result.add(majorityEle2);

		return result;
	}

	public static void main(String[] args) {

		int[] nums = { 11, 33, 33, 11, 33, 11 };
		List<Integer> result = findMajorityElement(nums);
		System.out.println(result);
	}
}
//Time Complexity: O(N)
//Space Complexity: O(1)
