package com.example.demo;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi >>>>> ");
		Queue q = new Queue();
		
		Producer prod = new Producer(q);
		Consumer cons = new Consumer(q);
		

	}

}
