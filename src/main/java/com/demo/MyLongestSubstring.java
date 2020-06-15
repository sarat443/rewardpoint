package com.demo;

import java.util.HashMap;
import java.util.Map;

public class MyLongestSubstring {
	
	public static void main(String[] args) {
		String inputStr = "abcabcfbb";
		int ans =0;
		int j = 0;
		Map<Character, Integer> keyMap = new HashMap<>();
		for(int i=0;i<inputStr.length();i++) {
			if(keyMap.containsKey(inputStr.charAt(i))) {
				j = Math.max(keyMap.get(inputStr.charAt(i)), j);
			}
			ans = Math.max(ans, i-j+1);
			keyMap.put(inputStr.charAt(i), i+1);
		}
		System.out.println(ans);
	}
	
	

}
