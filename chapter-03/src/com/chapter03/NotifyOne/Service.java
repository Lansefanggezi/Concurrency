package com.chapter03.NotifyOne;

public class Service {
	public void testMethod(Object lock)
	{
		try{
			synchronized(lock)
			{
				System.out.println("Begin Wait(): " + System.currentTimeMillis()
				+ "�߳�����:" + Thread.currentThread().getName());
				lock.wait();
				System.out.println("End Wait():" + System.currentTimeMillis()
				+ "�߳�����:" + Thread.currentThread().getName()); 
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
