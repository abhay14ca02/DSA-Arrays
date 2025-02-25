package com.arrays.basic.easy.missingnumber1lc;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
// Input: nums = [3,0,1]
// Output: 2
public class BruteMissingNumber {

	private static int findMissingNum(int[] arr) {

		int n = arr.length;
		for (int i = 1; i <= n; i++) {
			int flag = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				return i;
			}

		}
		return -1;
	}
	public static void main(String[] args) {

		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int missingNum = findMissingNum(arr);
		System.out.println("Missing Number is : " + missingNum);
	}
}
// Time Complexity : O(N*N)
// Space Complexity : O(1)