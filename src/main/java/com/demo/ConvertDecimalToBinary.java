package com.demo;
import java.time.temporal.ValueRange;
import java.util.Scanner;

//This program generates convert decimal to binary
public class ConvertDecimalToBinary {


    public static int getNumberOfBytes(int n) {
        int bytes = 0;
        ValueRange byteRange = ValueRange.of(Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println("byteRange  : "+byteRange);
        ValueRange shortRange = ValueRange.of(Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.println("shortRange  : "+shortRange);
        ValueRange intRange = ValueRange.of(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println("intRange  : "+intRange);
        
        if (byteRange.isValidValue(n)) {
            bytes = 1;
        } else if (shortRange.isValidValue(n)) {
            bytes = 2;
        } else if (intRange.isValidValue(n)) {
            bytes = 4;
        }
        
        System.out.println("bytes :::: "+bytes);
        return bytes;
    }

    //Convert a positive decimal number to binary
    public static String convertPositiveNumberToBinary(int n, int bytes,boolean reverse) {
    	
        int bits = 8 * bytes;
        StringBuilder sb = new StringBuilder(bits); //in-bits
        if (n == 0) {
            sb.append("0");
        } else {
            while (n > 0) {
                sb.append(n % 2);
                n >>= 1;  //aka n/2
            }
        }

        if (sb.length() < bits) {
            for (int i = sb.length(); i < bits; i++) {
                sb.append("0");

            }
        }
        if (reverse) {
            return sb.toString();
        } else {
            return sb.reverse().toString();
        }
    }

    //Convert negative decimal number to binary
    public static String convertNegativeNumberToBinary(int n, int bytes) {
        int m = -n; //conver to positve
        String binary = convertPositiveNumberToBinary(m,bytes,true);
        int len = binary.length();
        StringBuilder sb = new StringBuilder(len); //in-bits
        boolean foundFirstOne = false;
        for(int i=0; i < len;i++) {
            if(foundFirstOne)  {
                if(binary.charAt(i) == '1') {
                    sb.append('0');
                }
                else {
                    sb.append('1');
                }
            }
            else {
                if(binary.charAt(i) == '1') {
                    foundFirstOne = true;
                }
                sb.append(binary.charAt(i));
            }
        }
        return sb.reverse().toString();

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int bytes = getNumberOfBytes(n);
            
            String binary;

            if(n >= 0) {
                binary = convertPositiveNumberToBinary(n,bytes,false);
            }
            else {
                binary = convertNegativeNumberToBinary(n,bytes);
            }
            System.out.println(String.format("Binary representation of {%s} is {%s}",n,binary));
        }
        scanner.close();
    }
}


