package com.java.threads.concurrency;

public class ThreadA extends Thread {

	int counter = 0;

	public synchronized void print() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			counter = counter + 1;

		}
		System.out.println();
		System.out.println("Counter" + counter);
	}

	@Override
	public void run() {
		print();
	}

}
