package com.arrays.hard.containsduplicateIII;

import java.util.TreeSet;
//You are given an integer array nums and two integers indexDiff and valueDiff.
//Find a pair of indices (i, j) such that:
//i != j, abs(i - j) <= indexDiff, abs(nums[i] - nums[j]) <= valueDiff and
//Return true if such pair exists or false otherwise.
//Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
//Output: true
public class ContainsDupliacteIII {

	private static boolean containsDuplicateIII(int[] nums,int indexDiff, int valueDiff) {
		// Use TreeSet to maintain a sorted set.
		TreeSet<Long> sortedSet= new TreeSet<Long>();
		 // Iterate through the array of numbers.
        for (int i = 0; i < nums.length; ++i) {
            // Try finding a value in the set within the range of (value - valueDiff) and (value + valueDiff).
            Long floorValue = sortedSet.ceiling((long) nums[i] - (long) valueDiff);
            if (floorValue != null && floorValue <= (long) nums[i] + (long) valueDiff) {
                // If such a value is found, return true.
                return true;
            }
            // Add the current number to the sorted set.
            sortedSet.add((long) nums[i]);
            // If the sorted set size exceeded the allowed index difference, remove the oldest value.

            if (i >= indexDiff) {
                sortedSet.remove((long) nums[i - indexDiff]);
            }
        }
        // Return false if no such pair is found in the set.
        return false;
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int indexDiff=3; 
		int valueDiff=0;
		boolean value = containsDuplicateIII(nums,indexDiff,valueDiff);
		System.out.println(value);
	}
}
//Time: O(NLogK)
//Space: O(k)