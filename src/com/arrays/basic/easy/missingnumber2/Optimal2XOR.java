package com.arrays.basic.easy.missingnumber2;

//Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
//Find the number(between 1 to N), that is not present in the given array.
//Input : array[] ={1,2,4,5}
//Output : 3
public class Optimal2XOR {

	private static int findMissingNumber(int[] arr, int n) {

		int xor1 = 0, xor2 = 0;

		for (int i = 0; i < n - 1; i++) {
			xor1 = xor1 ^ arr[i];
			xor2 = xor2 ^ (i + 1);
		}
		xor2 = xor2 ^ n;
		return xor2 ^ xor1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 5 };
		int n = 5;
		int findMissingNum = findMissingNumber(arr, n);
		System.out.println("Missing Num :: " + findMissingNum);
	}
}
