package com.arrays.medium.FindPivotInteger;

//Given a positive integer n, find the pivot integer x such that:
//The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
//Return the pivot integer x. If no such integer exists, return -1. 
//It is guaranteed that there will be at most one pivot index for the given input.
//Input: n = 8 ,Output: 6
//Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
public class BruteApproach {

	private static int findPivotInteger(int n) {

		for (int x = 1; x <= n; x++) {
			int leftSum = 0, rightSum = 0;
			for (int j = 1; j <= x; j++) {
				leftSum += j;
			}
			for (int k = x; k <= n; k++) {
				rightSum += k;
			}
			if (leftSum == rightSum) {
				return x;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int n = 8;
		int res = findPivotInteger(n);
		System.out.println(res);
	}
}
//Time Complexity : O(N^2)
//Space Complexity : O(1)