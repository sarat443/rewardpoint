package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		String str = "I am java a java dev";
		String[] strArrs = str.split(" ");
		Map<String, String> targetMap = new HashMap<String, String>();
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for(int i=0; i< strArrs.length ; i++) {
		 System.out.println("output > : "+strArrs[i]);
		 if(i == 0) {
		   countMap.put(strArrs[i], new Integer(1));
		 } else {
			 if(countMap.containsKey(strArrs[i])) {
				 int count = new Integer(countMap.get(strArrs[i])).intValue();
				 System.out.println("output > : "+count+1);
				 countMap.put(strArrs[i], new Integer(count+1));
				 
			 } else {
				 countMap.put(strArrs[i], new Integer(1));
			 }
			 
		 }
			
		   
		   System.out.println("Map : countMap : > : "+countMap);
		}
		
		
		

	}
	
	
}


