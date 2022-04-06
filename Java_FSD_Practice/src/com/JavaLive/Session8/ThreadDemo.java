package com.JavaLive.Session8;

public class ThreadDemo {

	public static void main(String[] args) {
		taskThread d = new taskThread();
		Thread t = new Thread(d);
		t.start();
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Entered Main");

	}

}

class taskThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Entered the run Method....");
		
	}
	
}
