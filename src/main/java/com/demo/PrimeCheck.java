package com.demo;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number >>> : ");
		
		Scanner scan = new Scanner(System.in);
		int inNum = scan.nextInt();
		for(int i = 2 ; i <= inNum; i++) {
		  if(isPrime(i)) {
			  System.out.println(i);
		  }
		}
		
		

	}
	
	public static boolean isPrime(int inNum) {
		
		boolean isPrime = true;
	    for(int i = 2; i <= inNum/2; i++) {
			int temp = inNum%i;
			//System.out.println("inNum : "+inNum+" temp : "+temp);
			if(temp == 0) {
				isPrime = false;
				//System.out.println("inNum  is not prime ");
				break;
			}
		}
		if(!(inNum == 1) && isPrime) {
			//System.out.println(inNum);
			isPrime = true;
		} else {
			isPrime = false;
			//System.out.println(inNum +" is not a prime");
		}
		return isPrime;
		
	}
	
	public String displayName(String name) {
		return name;
		
	}

}
