package com.demo;

import java.util.Scanner;

public class Re
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the string...");
         
        String inputString = sc.nextLine();
         
        String newInputString = inputString.replaceAll("[AEIOUaeiou. ]", "");
         
        System.out.println("The string without vowels...");
         
        System.out.println(newInputString);
        
        String outStr = "";
        
        for(int i=0 ; i < inputString.length();i++ ) {
        	if(!(inputString.charAt(i) != 'e')) {
        		outStr = outStr+inputString.charAt(i);
        	}
        }
        System.out.println("output : "+outStr);
        sc.close();
    }
}