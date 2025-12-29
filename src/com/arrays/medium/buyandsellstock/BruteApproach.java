package com.arrays.medium.buyandsellstock;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Input: prices = [7,1,5,3,6,4], Output: 5
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell
//Input: prices = [7,6,4,3,1], Output: 0
public class BruteApproach {
//We try every possible pair of days (buy day and sell day) and calculate the profit.
//The maximum profit among all these pairs is our answer. If no profit is possible, return 0.
//Loop through all days to consider each as a possible buy day.
//For each buy day, loop through all future days to consider them as sell days
//Calculate the profit for each (buy, sell) pair
	private static int findMaxProfit(int[] prices) {
		int maxProfit = 0;
		int n = prices.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int profit = prices[j] - prices[i];
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = findMaxProfit(prices);
		System.out.println(maxProfit);
	}
}

// Time Complexity : O(N*N)
// Space Complexity : O(1)