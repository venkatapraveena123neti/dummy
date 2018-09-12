package com.cg.eightFour.ui;

public class MyMain {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			Customer c = new Customer();
			Thread thread1 = new Thread(c);
			thread1.start();
			Thread.sleep(1000);
			Biller b = new Biller();
			Thread thread2 = new Thread(b);
			thread2.start();
			Thread.sleep(1000);
		}

	}

}

class Customer extends Thread {
	public void run() {
		System.out.println("customer giving product to biller");
		

	}
}

class Biller extends Thread {
	public void run() {
		System.out.println("biller bills the products");
		

	}
}
