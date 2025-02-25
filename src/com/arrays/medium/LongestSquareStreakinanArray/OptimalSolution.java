package com.arrays.medium.LongestSquareStreakinanArray;

import java.util.HashSet;
import java.util.Set;

//Approach-2 (Using set)
//T.C : O(N) //
//S.C : O(N)
public class OptimalSolution {
	private static int longestSquareStreak(int[] nums) {
		Set<Integer> st = new HashSet<>();
		for (int num : nums) {
			st.add(num);
		}
		int maxStreak = 0;
		for (int num : nums) {
			int streak = 0;
			long curr = num;
			while (st.contains((int) curr)) {
				streak++;
				if (curr * curr > 1e5) {
					break;
				}
				curr = curr * curr; // square
			}
			maxStreak = Math.max(maxStreak, streak);
		}
		return maxStreak < 2 ? -1 : maxStreak;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 6, 16, 8, 2 };
		int result = longestSquareStreak(nums);
		System.out.println(result);
	}

}
