package com.arrays.easy.findduplicatenum;

//You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and ‘N’ - 1 at least once. 
//There is a single integer value that is present in the array twice.
//arr = [1, 2, 3, 4, 4], the duplicate integer value present in the array is 4. Hence, the answer is 4 in this case.
//Input : arr [] ={6 3 1 5 4 3 2}
//Output : 3
//Input : arr[] ={5 2 1 3 4 4}
//Output : 4
public class Optimal2XOR {

	private static int findDuplicate(int[] arr, int n) {

		int xor1 = 0, xor2 = 0;

		for (int i = 0; i <= n; i++) {
			xor1 = xor1 ^ arr[i];
			xor2 = xor2 ^ i;
		}
		return xor1 ^ xor2;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 1, 5, 4, 3, 2 };
		int n = arr.length - 1;// As we have duplicates in the array so number will be range [1, N-1] i.e 1 to
								// N-1
		int duplicate = findDuplicate(arr, n);
		System.out.println("Duplicate Num is :- " + duplicate);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(1)
