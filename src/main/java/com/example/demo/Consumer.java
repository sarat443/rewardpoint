package com.example.demo;

public class Consumer  implements Runnable{
	Queue q;
	public Consumer(Queue q) {
		this.q = q;
		new Thread(this, "Consumer").start();
	}
	public void run() {
			while(true) {
			try {
			 q.get();
			}catch(Exception e) {
				e.printStackTrace();
			}
			}
	
	}

}