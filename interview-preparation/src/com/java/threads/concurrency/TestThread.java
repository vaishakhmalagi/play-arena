package com.java.threads.concurrency;

public class TestThread {
	public static void main(String args[]) {
		ThreadA a1 = new ThreadA();
		ThreadA a2 = new ThreadA();
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a2.start();
	
	}

}
