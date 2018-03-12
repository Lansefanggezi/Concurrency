package com.chapter03.notifyHoldLock;

public class Service {
	public void testMethod(Object lock)
	{
		try{
			synchronized(lock)
			{
				System.out.println("Begin wait:" + 
			Thread.currentThread().getName() + System.currentTimeMillis());
				lock.wait();
				System.out.println("End wait:"  + 
				Thread.currentThread().getName() + System.currentTimeMillis());
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	public void synNotifyMethod(Object lock)
	{
		try{
			synchronized(lock)
			{
				System.out.println("Notify Begin:" + Thread.currentThread().getName() + ":" +
						+ System.currentTimeMillis());
				lock.notify();
				Thread.sleep(3000);
				System.out.println("Notify End:" + Thread.currentThread().getName() + ":" +
						+ System.currentTimeMillis());
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
