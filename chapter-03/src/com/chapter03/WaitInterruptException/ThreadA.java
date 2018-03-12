package com.chapter03.WaitInterruptException;

public class ThreadA extends Thread {
	private Object lock;
	
	public ThreadA(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		Service service = new Service();
		service.waitMethod(lock);
	}
}
