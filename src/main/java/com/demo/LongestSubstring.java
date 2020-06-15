package com.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. Input: "abcabcbb" Output: 3 Explanation: The answer is "abc",
 * with the length of 3.
 *
 */
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputStr = "abcabcfbb";
		
		System.out.println(" output > using Bruth force >> : "+lengthOfLongestSubstringSet(inputStr));
		
		System.out.println(" output > using set >> : "+lengthOfLongestSubstringSet(inputStr));
		System.out.println(" output > using Map >> : "+lengthOfLongestSubstringMap(inputStr));

	}
	
	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				if (allUnique(s, i, j)) {
					ans = Math.max(ans, j - i);
				}
			}
		}
		return ans;
	}

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) 
            	return false;
            set.add(ch);
        }
        return true;
    }
	
	public static int lengthOfLongestSubstringSet(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
	
	public static int lengthOfLongestSubstringMap(String s) {
		//String inputStr = "abcabcfecdf";
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
        	System.out.println(s.charAt(j));
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            //System.out.println("i : "+i);
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
            System.out.println("i : "+i+" j : "+ j+" map : "+map + "ans > : "+ans);
        }
        return ans;
    }

}


