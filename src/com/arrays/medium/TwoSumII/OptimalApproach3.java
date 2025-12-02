package com.arrays.medium.TwoSumII;

//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
//find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] 
//and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

//Input: numbers = [2,3,4], target = 6
//Output: [1,3]

public class OptimalApproach3 {

	private static int[] twoSum(int[] nums, int target) {
		int n = nums.length;
		int[] res = { -1, -1 };
		int left = 0;
		int right = n - 1;
		while (left < right) {
			long currSum = (long) nums[left] + nums[right];
			if (currSum == target) {
				res[0] = left + 1;
				res[1] = right + 1;
				return res;
			} else if (currSum < target) {
				left++;
			} else {
				right--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int nums[] = { 2, 7, 11, 15 };
		int target = 9;
		int res[] = twoSum(nums, target);
		System.out.print("{" + res[0] + " " + res[1] + "}");
	}
}

// Time Complexity : O(N)
// Space Complexity : O(1)