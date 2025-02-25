package com.arrays.basic.easy.missingnumber1lc;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
//Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
//Output: 8
public class Optimal1UsingSummation {

	private static int findMissingNum(int[] arr) {

		int n = arr.length;
		int summation = 0, arrSum = 0;
		summation = (n * (n + 1)) / 2;
		for (int i = 0; i < n; i++) {
			arrSum = arrSum + arr[i];
		}
		return summation - arrSum;
	}
	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int missingNum = findMissingNum(arr);
		System.out.println("Missing Number is : " + missingNum);
	}
}
