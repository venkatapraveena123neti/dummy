package com.cg.eightTwo.ui;

import java.util.Timer;

public class MyMain implements Runnable {
	static int counter = 0;

	public static void main(String[] args) {
		MyMain main = new MyMain();
		Thread thread = new Thread(main);
		thread.start();

	}

	@Override
	public void run() {

		while (true) {
			System.out.println(System.currentTimeMillis());
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

	}
}