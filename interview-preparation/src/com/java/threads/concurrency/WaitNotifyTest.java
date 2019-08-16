package com.java.threads.concurrency;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg1 = new Message("message 1");
		Message msg2 = new Message("message 2");
		Message msg3 = new Message("message 3");
		Waiter waiter = new Waiter(msg1);
		new Thread(waiter, "waiter").start();

		Waiter waiter1 = new Waiter(msg2);
		new Thread(waiter1, "waiter1").start();

		Notifier notifier = new Notifier(msg3);
		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");
	}

}