package com.arrays.easy.maxconsecutiveones;
//Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array
//input arr[] = {1, 1, 0, 1, 1, 1}
// Output = 3
public class OptimalMaxConsectuiveOnes {

	private static int findMaxConsectuiveOnes(int[] arr, int n) {

		int count = 0;
		int maxConsectuiveOnes = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			
			if (count > maxConsectuiveOnes) {
				maxConsectuiveOnes = count;
			}
		}
		return maxConsectuiveOnes;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 };
		int n = arr.length;
		int maxConsectuiveOnes = findMaxConsectuiveOnes(arr, n);
		System.out.println("Maximum Consectuive Ones : " + maxConsectuiveOnes);
	}

}

// Time Complexity : O(N)
// Space Complexity : O(1)