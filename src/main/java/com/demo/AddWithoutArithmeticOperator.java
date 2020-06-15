package com.demo;

public class AddWithoutArithmeticOperator
{
   static int addNumber(int a, int b)
   {
      while(b != 0)
      {
         int carry = a & b;
         //System.out.println("carry >>>> "+carry);
         System.out.println("carry >>>> "+carry);
         a = a ^ b;
         System.out.println("a >>>> "+a);
         b = carry << 1;
      }
      return a;
   }
   public static void main(String[] args)
   {
      System.out.println(addNumber(30, 25));
      //System.out.println(subtractNumber(30, 25));
      
   }
   
   static int subtractNumber(int i, int j) 
   { 
      while(j != 0) 
      { 
         int carry = (~i) & j; 
         i = i ^ j; 
         System.out.println("j >>>> "+j);
         j = carry << 1; 
      }
      return i;
   }
}