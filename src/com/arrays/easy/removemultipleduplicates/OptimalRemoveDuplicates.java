package com.arrays.easy.removemultipleduplicates;

//Remove Duplicates in-place from Sorted Array. The relative order of the elements should be kept the same
//intput arr[]={1,1,2,2,2,3,3}
//output : 1,2,3
public class OptimalRemoveDuplicates {

	private static int removeDuplicateElements(int[] arr) {

		// We can use 2 pointer approach to remove duplicates
		int idx = 0;
		for (int j = 1; j < arr.length; j++) {

			if (arr[idx] != arr[j]) {

				idx++;
				arr[idx] = arr[j];

			}
		}
		return idx + 1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5 };
		int size = removeDuplicateElements(arr);

		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
