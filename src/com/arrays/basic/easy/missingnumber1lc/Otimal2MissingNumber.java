package com.arrays.basic.easy.missingnumber1lc;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array
//Input: nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
//Output: 8
//Two important properties of XOR are the following:
//XOR of two same numbers is always 0 i.e. a ^ a = 0
//XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a
public class Otimal2MissingNumber {

	private static int findMissingNum(int[] arr) {
		int n = arr.length;
		int xor1 = 0, xor2 = 0;
		for (int i = 1; i <= n; i++) {
			xor1 = xor1 ^ i;
		}
		for (int i = 0; i < n; i++) {

			xor2 = xor2 ^ arr[i];
		}
		return xor1 ^ xor2;
	}
	// Here Time Complexity : O(N) + O(N) ---> O(2N)
	// Space Complexity : O(1)
	// We can optimize further

	private static int findMissingNumber(int[] arr) {
		int n = arr.length;
		int xor1 = 0, xor2 = 0;
		for (int i = 0; i < n; i++) {
			xor1 = xor1 ^ arr[i];
			xor2 = xor2 ^ (i + 1);
		}
		return xor2 ^ xor1;
	}
	// Here Time Complexity : O(N)
	// Space Complexity : O(1)
	public static void main(String[] args) {
		int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int missingNum = findMissingNum(arr);
		int missingNum1 = findMissingNumber(arr);
		System.out.println("Missing Number is :: " + missingNum);
		System.out.println("Missing Num is :: " + missingNum1);
	}

}
