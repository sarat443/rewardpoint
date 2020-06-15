package com.demo;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inStr = "MMM";

		StringBuilder strBdr = new StringBuilder();
		for (int i = inStr.length() - 1; i >= 0; i--) {
			//System.out.println(inStr.charAt(i));
			strBdr.append(inStr.charAt(i));

		}
		System.out.println("strBdr : " + strBdr.toString());
		if (inStr.equals(strBdr.toString())) {
			System.out.println(inStr + " is Polindrom ? " + inStr.equals(strBdr.toString()));
		} else {
			System.out.println(inStr + " is Polindrom ? " + inStr.equals(strBdr.toString()));
		}
		System.out.println("Is Longest Polindrom ? " + isLongestPalindrom(inStr));

	}

	public static String isLongestPalindrom(String inStr) {

		int start = 0;
		int end = 0;

		for (int i = 0; i < inStr.length(); i++) {
			int len1 = expandAroundCenter(inStr, i, i);
			
			int len2 = expandAroundCenter(inStr, i, i+1);
			
			int len = Math.max(len1,  len2);
			
			if(len > end - start) {
				start = i - (len-1)/2;
				end = i + (len/2);
			}
			System.out.println(i+". len1 : "+len1+" len2 : "+len2+" len : "+len + " start : "+start+" end : "+end+" (end - start)->"+(end - start));
		}

		return inStr.substring(start, end+1);

	}
	
	public static int expandAroundCenter(String inStr, int left, int right) {
		int L = left;
		int R = right;
		System.out.println("Before : L : "+L +"  and R : "+R);
		while (L >= 0 && R < inStr.length() && inStr.charAt(L) == inStr.charAt(R)) {
	        L--;
	        R++;
	        System.out.println(" IN -> L : "+L +"  and R : "+R);
	    }
		System.out.println("-------------------------------");
		return R-L-1;
	}

}
