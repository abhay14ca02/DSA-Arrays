package com.arrays.medium.groupanagram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptimalGroupAnagram {

	private static List<List<String>> findGropAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();
		Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();
		for (String word : strs) {

			String frequencyString = getFrequencyString(word);
			// If the frequency string is present, add the string to the list
			if (anagramsMap.containsKey(frequencyString)) {
				anagramsMap.get(frequencyString).add(word);
			} else {
				// else create a new list
				List<String> strList = new ArrayList<>();
				strList.add(word);
				anagramsMap.put(frequencyString, strList);
			}
		}
		for (Map.Entry<String, List<String>> entry : anagramsMap.entrySet()) {
			result.add(entry.getValue());
		}
		return result;
	}

	private static String getFrequencyString(String word) {
		// Frequency buckets
		int[] freqArray = new int[26];
		// Iterate over each character
		for (char ch : word.toCharArray()) {
			freqArray[ch - 'a']++;
		}
		// Start creating the frequency string
		StringBuilder frequencyString = new StringBuilder("");
		char c = 'a';
		for (int i : freqArray) {
			frequencyString.append(c);
			frequencyString.append(i);
			c++;
		}
		return frequencyString.toString();
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = findGropAnagrams(strs);
		System.out.println(result);
	}
}
//Time Complexity : O(n*k) where k is the length of the string
//Space Complexity : O(n)