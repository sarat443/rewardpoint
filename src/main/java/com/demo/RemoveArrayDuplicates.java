package com.demo;

import java.util.Arrays;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] orig = {2,3,3,1};
	    Arrays.sort(orig);
	    
	    int remo[] = new int[orig.length];
	    remo[0] = orig[0];
	    System.out.println(Arrays.toString(remo));
	    int pre = orig[0];
	    
	    for(int i=0; i< orig.length; i++) {
	    	int ch = orig[i];
	    	if(pre != orig[i]) {
	    		remo[i] = ch;
	    	}
	    	pre = ch;
	    	
	    }
	    
	  System.out.println(Arrays.toString(remo));

	}

}
