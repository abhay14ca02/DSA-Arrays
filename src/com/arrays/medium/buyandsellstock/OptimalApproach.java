package com.arrays.medium.buyandsellstock;

//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Input: prices = [7,1,5,3,6,4], Output: 5
//Input: prices = [7,6,4,3,1], Output: 0
public class OptimalApproach {
// We will initialize 2 variables maxProfit =0 & bestBuy = prices[0].
// And check if the price of another day(sell day)> bestBuy(buy day) then calculate maxProfit else update bestBuy
	private static int maxProfit(int[] prices) {

		int maxProfit = 0, bestBuy = prices[0];
		for (int i = 1; i < prices.length; i++) {

			if (prices[i] > bestBuy) {
				maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
			}
			bestBuy = Math.min(prices[i], bestBuy);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int profit = maxProfit(prices);
		System.out.println(profit);
	}
}
//Time Complexity:O(N)
//Space Complexity : O(1)