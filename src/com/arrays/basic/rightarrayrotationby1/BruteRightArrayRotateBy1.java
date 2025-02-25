package com.arrays.basic.rightarrayrotationby1;

// Clockwise or Right Rotation
// arr [] = {9,8,7,6,4,2,1,3}
// Rotate the given array by 1 in Right Rotation
// We need to move elements towards right of the array except one element
//output - {3,9,8,7,6,4,2,1}
public class BruteRightArrayRotateBy1 {

	private static void rightRotateByOne(int[] arr) {

		int n = arr.length;
		
		int tempArr[] = new int[n];
		
		// Copy last element to temp variable
		
		int temp = arr[n - 1];
		
		// Copy (n-d) elements to the tempArr array
		
		for (int i = 1; i < n; i++) {

			tempArr[i] = arr[i - 1];
			
		}
		// Copy temp to the tempArr [0]
		
		tempArr[0] = temp;

		// Copy tempArr to original array
		
		for (int i = 0; i < n; i++) {
			arr[i] = tempArr[i];
		}

		// Print rotated array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {

		int arr[] = { 9, 8, 7, 6, 4, 2, 1, 3 };
		rightRotateByOne(arr);
	}

}
// Time Complexity : O(N)
// Space Complexity : O(N)