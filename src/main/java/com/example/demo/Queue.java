package com.example.demo;

public class Queue {
	boolean availableStatus = false;
	int n = 0;
	
	synchronized void put(int n) throws Exception{
		while(availableStatus) {
			wait();
		}
		this.n = n;
		availableStatus = true;
		System.out.println("Put : "+n);
		notify();
		Thread.sleep(5000);
	
	}
	synchronized int get() throws Exception{
		while(!availableStatus) {
			availableStatus = false;
			System.out.println("Got : "+n);
			wait();
		}
		availableStatus = false;
		notify();
		return n;
	}

}
