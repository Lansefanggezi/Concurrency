package com.state.Main;

import com.state.Thread.MyThread;

public class Test1 {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.setName("myThread");
			System.out.println("mian方法中start前"+myThread.getName() + myThread.getState());
			myThread.start();
			System.out.println("mian方法中start后"+myThread.getName() + myThread.getState());
			Thread.sleep(3000);
			System.out.println("mian方法中sleep后"+myThread.getName() + myThread.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
