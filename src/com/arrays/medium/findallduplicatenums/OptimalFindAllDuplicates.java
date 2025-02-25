package com.arrays.medium.findallduplicatenums;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, 
//return an array of all the integers that appears twice.
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//Input: nums = [1,1,2]
//Output: [1]
//Input: nums = [1]
//Output: []
public class OptimalFindAllDuplicates {

	private static List<Integer> findAllDuplicates(int[] arr) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			int num = Math.abs(arr[i]);
			int idx = num - 1;
			if (arr[idx] < 0) {
				list.add(num);
			} else {
				arr[idx] *= -1;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1, 4 };
		List<Integer> ans = findAllDuplicates(arr);
		System.out.println(ans);
	}
}
