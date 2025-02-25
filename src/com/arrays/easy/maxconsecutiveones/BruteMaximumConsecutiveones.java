package com.arrays.easy.maxconsecutiveones;

//Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array
//input arr[] = {1, 1, 0, 1, 1, 1}
//Output = 3
public class BruteMaximumConsecutiveones {
	private static int findMaxConsectuiveOnes(int[] arr, int n) {

		int maxConsectuiveOnes = 0;

		for (int i = 0; i < n; i++) {

			int count = 0;
			
			for (int j = 0; j < n; j++) {

				if (arr[i] == 1 && arr[j] == 1) {
					count++;
				} else {
					count = 0;
				}
				
				if (count > maxConsectuiveOnes) {
					System.out.println("Maximum : " + maxConsectuiveOnes+" "+count);
					maxConsectuiveOnes = count;
					
				}
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
//Time Complexity : O(N * N)
//Space Complexity : O(1)