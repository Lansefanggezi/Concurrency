package com.state.Main;

import com.state.Thread.MyThread;

public class Test1 {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.setName("myThread");
			System.out.println("mian������startǰ"+myThread.getName() + myThread.getState());
			myThread.start();
			System.out.println("mian������start��"+myThread.getName() + myThread.getState());
			Thread.sleep(3000);
			System.out.println("mian������sleep��"+myThread.getName() + myThread.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
