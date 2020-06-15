package com.demo.rmduplicates;

import java.util.HashSet;
import java.util.Set;

public class RemovedDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {2,2,3,3,4,5};
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < inputArr.length; i++) {
			set.add(inputArr[i]);
			
		}
		System.out.println("output arr > "+set);
		
		set.forEach(val -> {
			System.out.println("out > : "+val.toString());
		});

	}

}
