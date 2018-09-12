package com.cg.eigthThree.ui;

public class MyMain implements Runnable {
	static MyMain m1;
	static MyMain m2;
	static Thread t;
	static Thread t1;
	private int num = (int) (Math.random() * 10);
	private int fact = 1;
	int i = num;

	@Override
	public void run() {

		synchronized (t) {
			
			System.out.println("number " + num);
			

		}

		synchronized (t1) {
			
			while (i > 0) {
				fact = fact * i;
				i--;
			}
			System.out.println("factorial" + fact);
		}

		
	}

	public static void main(String[] args) throws InterruptedException {
		m1 = new MyMain();
		m2 = new MyMain();

		t = new Thread(m1);
		t1 = new Thread(m2);
		t.start();
		t1.start();
		//t1.sleep(2000);

	}

}
