package com.arrays.medium.majorityelementnbyk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//Given an integer array nums and an integer k, find all elements appearing more than n/m times.
//Input : nums: [3, 1, 2, 2, 1, 2, 3, 3], k = 4

public class OptimalSolution {

	private static List<Integer> findMajorityNK(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();

		if (k < 2) {
			return result;
		}
		Map<Integer, Integer> candidates = new HashMap<Integer, Integer>();
		for (int num : nums) {

			// Phase 1: Candidate selection
			if (candidates.containsKey(num)) {
				candidates.put(num, candidates.get(num) + 1);
			} else if (candidates.size() < k - 1) {
				candidates.put(num, 1);
			} else {
				// decrement count of all candidates by 1
				Iterator<Map.Entry<Integer, Integer>> itr = candidates.entrySet().iterator();
				while (itr.hasNext()) {
					Map.Entry<Integer, Integer> entry = itr.next();
					candidates.put(entry.getKey(), entry.getValue() - 1);
					if (entry.getValue() - 1 == 0) {
						itr.remove();
					}
				}
			}

		}

		// Phase 2: Verification
		// Reset counts to 0
		for (int num : candidates.keySet()) {
			candidates.put(num, 0);
		}
		// Count actual occurrences
		for (int num : nums) {
			if (candidates.containsKey(num)) {
				candidates.put(num, candidates.get(num) + 1);
			}
		}
		// Even though, if we don't use Phase 2 and Count actual occurrences it will
		// work for small input array
		
		// Collect elements appearing more than n/k times
		int n = nums.length;
		for (int num : candidates.keySet()) {
			if (candidates.get(num) > n / k) {
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 2, 1, 2, 3, 3 };
		int k = 4;
		List<Integer> result = findMajorityNK(nums, k);
		System.out.println(result);
	}
}

// Time Complexity : O(N*K)
// Space Complexity : O(K)