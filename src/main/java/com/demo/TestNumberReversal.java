package com.demo;

public class TestNumberReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		
		int reve = 0;
		
		do {
			int rem = num%10;
			reve = reve*10 + rem;
			num = num/10;
			
		}while(num > 0);
		
		System.out.println("reversed number : "+reve);
		
		System.out.println("Is Palindrom ? "+isPalindrom(23432));

	}
	
	public static boolean isPalindrom(int num) {
		int reve = 0;
		while(num > reve) {
			reve = reve*10 + num%10;
			num = num/10;
		}
		System.out.println("reve >>>> "+reve);
		System.out.println("num >>>> "+num);
		
		return ((num == reve || num == reve/10));
	}

}
