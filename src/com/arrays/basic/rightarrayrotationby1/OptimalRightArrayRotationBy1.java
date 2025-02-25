package com.arrays.basic.rightarrayrotationby1;

//Clockwise or Right Rotation
//arr [] = {9,8,7,6,4,2,1,3}
//Rotate the given array by 1 in Right Rotation
//We need to move elements towards right of the array except one element
//output - {3,9,8,7,6,4,2,1}
public class OptimalRightArrayRotationBy1 {

	private static void rightRotateByOne(int[] arr) {

		int n = arr.length;
		
		// Copy last element to temp variable
		
		int temp = arr[n - 1];
		
		// Shift (n-d) elements to the back/end of array
		
		for (int i = n - 2; i >= 0; i--) {

			arr[i + 1] = arr[i];

		}
		// Copy temp to original array at 0th index
		 arr[0] = temp;

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
// Space Complexity : O(1)