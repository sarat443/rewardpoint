package com.demo.sort;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inArr = { 6, 5, 3, 4, 1, 2 };
		for (int i = 0; i < inArr.length; i++) {
			for (int j = (inArr.length - 1); j > i; j--) {

				if (inArr[j] < inArr[j - 1]) {
					int temp = inArr[j];
					inArr[j] = inArr[j - 1];
					inArr[j - 1] = temp;
				}

			}
		}
		for (int ou : inArr) {
			System.out.println("->  " + ou);
		}

		System.out.println("outpput : " + 5 / 2);

		System.out.println("------------------ mergesort -------------------");
		int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };

		System.out.println("Array before sorting");

		System.out.println(Arrays.toString(input));
		// sorting array using MergeSort algorithm
		mergesort(input);
		
		System.out.println("Array after sorting using mergesort algorithm");
		System.out.println(Arrays.toString(input));

	}

	public static void mergesort(int[] input) {
		mergesort(input, 0, input.length - 1);
	}

	private static void mergesort(int[] input, int start, int end) {
		// break problem into smaller structurally identical problems
		int mid = (start + end) / 2;
		System.out.println("start : "+start);
		System.out.println("mid : "+mid);
		System.out.println("end : "+end);
		System.out.println("------------------ XXXX -------------------");
		if (start < end) {
			System.out.println("------------------ 1 -------------------");
			mergesort(input, start, mid);
			System.out.println("------------------ 2 -------------------");
			mergesort(input, mid + 1, end);
			System.out.println("------------------ 3 -------------------");
		}
		// merge solved pieces to get solution to original problem
		//int[] input = { 87, 57, 370, 110, 90, 610, 02, 710, 140, 203, 150 };
		int i = 0, first = start, last = mid + 1;
		System.out.println("------------------ 4 -------------------");

		int[] tmp = new int[end - start + 1];
	
		while (first <= mid && last <= end) {
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
		}
		System.out.println("111 : " + Arrays.toString(tmp));
		while (first <= mid) {
			tmp[i++] = input[first++];
		}
		System.out.println("222 : " + Arrays.toString(tmp));
		
		while (last <= end) {
			tmp[i++] = input[last++];
			
		}
		System.out.println("333 : " + Arrays.toString(tmp));
		i = 0;
		//System.out.println("start : " + start);
		//System.out.println("end : " + end);
		while (start <= end) {
			//System.out.println("start : " + start);
			input[start++] = tmp[i++];
		}
		
	}
}
