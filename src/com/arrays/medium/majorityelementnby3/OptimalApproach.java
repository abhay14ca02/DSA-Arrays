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
		int count1 = 0;
		int count2 = 0;
		int majorityEle1 = Integer.MIN_VALUE;
		int majorityEle2 = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (count1 == 0 && nums[i] != majorityEle2) {
				count1 = 1;
				majorityEle1 = nums[i];
			} else if (count2 == 0 && nums[i] != majorityEle1) {
				count2 = 1;
				majorityEle2 = nums[i];
			} else if (nums[i] == majorityEle1) {
				count1++;
			} else if (nums[i] == majorityEle2) {
				count2++;
			} else {
				count1--;
				count2--;
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		count1 = 0;
		count2 = 0;
		for (int i = 0; i < n; i++) {
			if (nums[i] == majorityEle1 || nums[i] == majorityEle2) {
				count1++;
			    count2++;
			}	
		}
		int mini = (int) (n / 3) + 1;
		if (count1 >= mini)
			list.add(majorityEle1);
		if (count2 >= mini)
			list.add(majorityEle2);

		return list;
	}

	public static void main(String[] args) {

		int[] nums = { 11, 33, 33, 11, 33, 11 };
		List<Integer> result = findMajorityElement(nums);
		System.out.println(result);
	}
}
//Time Complexity: O(N)
//Space Complexity: O(1)
