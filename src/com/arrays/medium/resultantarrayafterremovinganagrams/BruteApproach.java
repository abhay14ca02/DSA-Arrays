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
public class BruteApproach {
	private static List<String> removeAnagrams(String[] words) {

		List<String> result = new ArrayList<String>();
		// String to keep track of the previous word (sorted version)
		String previousWordSorted = "";
		for (String word : words) {
			char[] newWord = word.toCharArray();
			Arrays.sort(newWord);
			// Create a string from the sorted char array
			String sortednewWord = String.valueOf(newWord);
			// Check if the sorted current word is different from the previous sorted word
			if (!sortednewWord.equals(previousWordSorted)) {
				// If different, it's not an anagram of the previous word, so add it to the
				// result
				result.add(word);
			}
			// Update the previous word to be the sorted current word for the next iteration
			previousWordSorted = sortednewWord;
		}
		return result;
	}

	public static void main(String[] args) {

		String[] words = { "abba","baba","bbaa","cd","cd" };
		List<String> listStr = removeAnagrams(words);
		System.out.println(listStr);
	}
}
//Time Complexity : O(N * klogk)
//Space Complexity : O(N)