package com.arrays.medium.groupanagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Input: strs = [""]
//Output: [[""]]
//Input: strs = ["a"]
//Output: [["a"]]
public class BetterApproach {

	private static List<List<String>> findGropAnagrams(String[] strs) {

		List<List<String>> result = new ArrayList<List<String>>();
		// Create a map to group the anagrams, where the key is the sorted string, and
		// the value is a list of original strings.
		Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();
		// Iterate over each string in the array.
		for (String word : strs) {
			char charArray[] = word.toCharArray();

			Arrays.sort(charArray);

			// Create a new string from the sorted character array.
			String sortedStr = String.valueOf(charArray);

			// If the sorted string key is not present in the map, initialize the list.
			// Then add the original string to the list associated with the sorted string key.
		      if (!anagramsMap.containsKey(sortedStr)) {
		    	  anagramsMap.put(sortedStr, new ArrayList<>());
		      
		      }
		      anagramsMap.get(sortedStr).add(word);
		}
		for(Map.Entry<String, List<String>> entry:anagramsMap.entrySet()){
			result.add(entry.getValue());
        }
		return result;
	}

	public static void main(String[] args) {
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> result = findGropAnagrams(strs);
		System.out.println(result);
	}

}
//Time Complexity : O(m * n log n).
//Space Complexity : O(m * n) 