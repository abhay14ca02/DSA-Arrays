package com.arrays.easy.countnoofoccurrencebetween2elments;

public class OptimalSolution {

	private static int countNoOfOccurrence(int[] arr, int num1, int num2) {

		int num1Index = -1;
		int num2Index = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num1) {
				num1Index = i;
			}
			if (arr[i] == num2) {
				num2Index = i;
			}
		}
		if (num1Index == -1 || num2Index == -1) {

			return 0;
		}
		return (num2Index - num1Index - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 10, 6 };
		int num1 = 4;
		int num2 = 6;
		int noOfOccureence = countNoOfOccurrence(arr, num1, num2);
		System.out.println(noOfOccureence);
	}
}
