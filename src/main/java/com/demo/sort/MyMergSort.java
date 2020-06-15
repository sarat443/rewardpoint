package com.demo.sort;

import java.util.Arrays;

public class MyMergSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {6,10,2,4,1,20,76};
		
		mergeSort(input);
		
		System.out.println("output : "+Arrays.toString(input));
		
		
		
		

	}
	
	public static void mergeSort(int input[]) {
		mergeSort(input, 0, input.length - 1);
		
	}
	
	 static void mergeSort(int input[], int start, int end) {
		
		 int mid = (start+end)/2;
		 if(start < end ) {
			 mergeSort(input, start, mid);
			 mergeSort(input,mid+1, end);
		 }
		 
		 int i = 0;
		 int first = start;
		 int last = mid+1;
		 
		 int tmp[] = new int[(end - start)+1];
		 
		 while(first <= mid && last<= end) {
			 tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
		 }
		 
		 while(first <= mid) {
			 tmp[i++] = input[first++] ;
		 }
		 while (last <= end) {
			 tmp[i++] = input[last++];
		 }
		 
		 i = 0;
		 while(start <= end) {
			 input[start++] = tmp[i++];
		 }
		 
		
		
	}

}
