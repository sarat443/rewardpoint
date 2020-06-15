package com.demo;

import java.util.Scanner;

/**
 * Simple Java program to reverse a number in Java using loop and operator
 * This program also shows example of using division operator(/) and Remainder Operator(%)
 */
public class ReverseNumberExample {

    public static void main(String args[]) {
       //input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();
      
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));   
    
    }
  
    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            System.out.println("remainder : "+remainder);
            reverse = reverse*10 + remainder;
            number = number/10;
            System.out.println("number : "+number);

            System.out.println("reverse : "+reverse);
             
            System.out.println("--------------------------");
          
        }while(number > 0);
      
        return reverse;
    }

}
