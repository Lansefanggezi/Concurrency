package com.chapter01.Thread;

public class MyThread extends Thread {
	@Override
	public void run()
	{
		super.run();
		System.out.println("MyThread");
	}
}
