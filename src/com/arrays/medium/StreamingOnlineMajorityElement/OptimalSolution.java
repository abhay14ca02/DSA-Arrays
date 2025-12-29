package com.arrays.medium.StreamingOnlineMajorityElement;

class StreamingMajority {

	private int candidate; // current potential majority
	private int count; // count for the candidate

	public StreamingMajority() {

		this.candidate = -1; // placeholder
		this.count = 0;
	}

	// Process a new number from the stream
	public void process(int num) {
		if (count == 0) {
			candidate = num; // take new candidate
			count = 1;
		} else if (num == candidate) {
			count++;
		} else {
			count--;
		}
	}

	// Get current potential majority element
	public int getCandidate() {
		return candidate;
	}
}

public class OptimalSolution {

	public static void main(String[] args) {

		int[] stream = { 2, 1, 2, 3, 2, 2, 1, 2 };
		StreamingMajority streaming = new StreamingMajority();
		System.out.println("Processing stream:");
		for (int num : stream) {
			streaming.process(num);
			System.out.println("Processed " + num);
		}
		System.out.println("\nPotential majority element (> n/2): " + streaming.getCandidate());

	}
}
// Time Complexity : O(N)
// Space Complexity : O(1)
