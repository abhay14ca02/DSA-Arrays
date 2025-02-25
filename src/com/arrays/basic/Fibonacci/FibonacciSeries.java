package com.arrays.basic.Fibonacci;

public class FibonacciSeries {

	private static void findFibonacciSeries(int n) {

		int arr[] = new int[n + 2];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < n; i++) {

			arr[i] = arr[i - 2] + arr[i - 1];
		}

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	private static int findNthTermInFibonacciSeries(int n) {

		int arr[] = new int[n + 2];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < n; i++) {

			arr[i] = arr[i - 2] + arr[i - 1];
		}

		return arr[n - 1];
	}

	public static void main(String[] args) {
		int n = 10;
		
		findFibonacciSeries(n);

		System.out.println();

		int nthTerm = findNthTermInFibonacciSeries(n);

		System.out.println("Nth Term of Fibonacci Series is : " + nthTerm);
	}

}
