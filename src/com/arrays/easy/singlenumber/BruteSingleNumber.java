package com.arrays.easy.singlenumber;

//Single Number
//Given an array arr[] of positive integers where every element appears even times except for one. Find that number occurring an odd number of times
//Input : arr[] = { 1, 1, 2, 2, 2 }
//Output : 2
public class BruteSingleNumber {

	private static int getSingleNumber(int[] arr) {

		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] != Integer.MAX_VALUE)
				continue;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					count++;
					arr[j] = Integer.MAX_VALUE;
				}
			}
			if (count % 2 != 0) {
				break;
			}
		}
		return arr[i - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 2};
		System.out.println(getSingleNumber(arr));
	}
}
