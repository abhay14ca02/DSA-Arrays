package com.arrays.medium.findallduplicatenums;

import java.util.ArrayList;
import java.util.List;

//Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears at most twice, 
//return an array of all the integers that appears twice.
// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [2,3]
//Input: nums = [1,1,2]
//Output: [1]
//Input: nums = [1]
//Output: []
public class BruteFindAllDuplicateNums {

	private static List<Integer> findAllDuplicates(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if (count > 1) {
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> ans = findAllDuplicates(arr);
		System.out.println(ans);
	}

}
//Time Complexity : O(N*N)
//Space Complexity :O(1)