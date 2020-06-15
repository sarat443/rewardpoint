package com.example.demo;

public class Producer implements Runnable{
	Queue q;
	public Producer(Queue q) {
		this.q = q;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		int i=0;
			while(true) {
				try {
			  q.put(i++);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	
	}

}
