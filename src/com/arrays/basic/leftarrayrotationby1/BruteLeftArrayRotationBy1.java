package com.arrays.basic.leftarrayrotationby1;

//Counter Clockwise or Anti clockwise Left Rotation
//arr [] = {1,2,3,4,5}
//Rotate the given array by 1 in Left Rotation
//We need to move elements towards left of the array except one element
//output - {2,3,4,5,1}
public class BruteLeftArrayRotationBy1 {

	private static void leftRotateByOne(int[] arr) {

		int n = arr.length;

		int tempArr[] = new int[n];

		int temp = arr[0];

		for (int i = 1; i < n; i++) {

			tempArr[i - 1] = arr[i];
		}

		tempArr[n - 1] = temp;

		for (int i = 0; i < n; i++) {

			arr[i] = tempArr[i];
		}

		// Print rotated array

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		leftRotateByOne(arr);
	}
}

// Time Complexity : O(N)
// Space Complexity : O(N)
