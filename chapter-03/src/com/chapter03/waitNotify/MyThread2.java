package com.chapter03.waitNotify;

public class MyThread2 extends Thread {
	private Object lock;
	
	public MyThread2(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		synchronized(lock)
		{
			System.out.println(Thread.currentThread().getName() 
					+ "开始notify时间：" + System.currentTimeMillis());
			lock.notify();
			System.out.println(Thread.currentThread().getName()
					+ "结束notify时间：" + System.currentTimeMillis());
		}
	}
}
