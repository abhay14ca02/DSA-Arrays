package com.arrays.medium.findduplicatenum;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.
//Input: nums = [1,3,4,2,2]
//Output: 2
//Input: nums = [3,3,3,3,3]
//Output: 3

public class OptimalFindDuplicate {

	private static int findDuplicateNum(int[] nums) {

		// This problem can be solved by Hare and Tortoise method. Also known as slow
		// and fast pointer technique
		// We will initialize slow pointer and fast pointer with nums[0]
		// slow pointer will move one step forward and fast pointer will move 2 step
		// forward. If slow == fast then cycle is detected. And we will come
		// out of the while loop. Again we will move slow or fast pointer to starting of the
		// nums i.e, slow = nums[0]
		// Now, slow and fast move one step forward together if slow == fast then we
		// will get duplicate element.

		int slow = nums[0];
		int fast = nums[0];

		// Detect a cycle

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];

		} while (slow != fast);

		// if slow === fast then cycle is detected. Now set fast = nums[0] and move slow
		// and fast one step forward together if slow == fast
		// then we will get duplicate element

		fast = nums[0];

		while (slow != fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		// Either return slow or fast they must have met on one point
		// This is the starting point of the cycle. It means repeating element
		// will start from that point only
		return slow; // fast

	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 2, 2 };
		int duplicateNum = findDuplicateNum(nums);
		System.out.println("Duplicate Element :: " + duplicateNum);
	}
}

//Time Complexity : O(N)
//Space Complexity : O(1)
