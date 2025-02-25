package com.arrays.easy.findduplicatenum;

//You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and ‘N’ - 1 at least once. 
//There is a single integer value that is present in the array twice.
//arr = [1, 2, 3, 4, 4], the duplicate integer value present in the array is 4. Hence, the answer is 4 in this case.
//Input : arr [] ={6 3 1 5 4 3 2}
//Output : 3
//Input : arr[] ={5 2 1 3 4 4}
//Output : 4
public class BruteFindDuplicate {

	private static int findDuplicate(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = i; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 6, 3, 1, 5, 4, 3, 2 };
		int n = arr.length;
		int duplicate = findDuplicate(arr, n);
		System.out.println("Duplicate num is : "+duplicate);

	}
}
//Time Complexity : O(N*N)
//Space Complexity : O(1)
