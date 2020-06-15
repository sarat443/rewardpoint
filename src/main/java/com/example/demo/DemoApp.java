package com.example.demo;

public class DemoApp {
	static String name = "Sharat";
	static Integer i = new Integer(10); 
    static Integer j = new Integer(20); 
	
    public static void main(String[] args) {
		
		DisplayObj obj = new DisplayObj();
		obj.setName(name);
		display(obj);
		displayName(name);
		System.out.println("name is >>>> : "+obj.getName());
		System.out.println("nameDisplay is >>>> : "+name);
		
		  
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j); 
	   } 
		
	
	public static void display(DisplayObj obj) {
		obj.setName("Meitei");
		
		
	}
	
	public static void displayName(String name) {
		DemoApp.name = "Meitei";
		
	}
	
	 // swap() doesn't swap i and j 
	   public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = i; 
	      DemoApp.i = j; 
	      DemoApp.j = temp; 
	   } 
	   

}
