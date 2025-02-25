package com.arrays.medium.resultantarrayafterremovinganagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given a 0-indexed string array words, where words[i] consists of lowercase English letters.
//In one operation, select any index i such that 0 < i < words.length and words[i - 1] and words[i] are anagrams, 
//and delete words[i] from words. Keep performing this operation as long as you can select an index that satisfies the conditions.
//Return words after performing all operations. It can be shown that selecting the indices for each operation
//in any arbitrary order will lead to the same result.
//Input: words = ["abba","baba","bbaa","cd","cd"]
//Output: ["abba","cd"]
//Input: words = ["a","b","c","d","e"]
//Output: ["a","b","c","d","e"]
public class OptimalApproach {
	private static List<String> removeAnagrams(String[] words) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length;) {
			int j = i + 1;
			while (j < words.length && isAnagram(words[i], words[j]))
				++j;
			result.add(words[i]);
			i = j;
		}
		return result;
	}

	private static boolean isAnagram(String a, String b) {
		if (a.length() != b.length())
			return false;

		int[] count = new int[26];

		for (final char c : a.toCharArray())
			++count[c - 'a'];

		for (final char c : b.toCharArray())
			--count[c - 'a'];

		return Arrays.stream(count).allMatch(c -> c == 0);
	}

	public static void main(String[] args) {
		String[] words = { "abba", "baba", "bbaa", "cd", "cd" };
		List<String> listStr = removeAnagrams(words);
		System.out.println(listStr);
	}
}
//Time Complexity : O(N)
//Space Complexity : O(N)