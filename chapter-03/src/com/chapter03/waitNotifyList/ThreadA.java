package com.chapter03.waitNotifyList;

public class ThreadA extends Thread {
	private Object lock;
	
	public  ThreadA(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		try{
		synchronized(lock)
		{
			if(MyList.size() != 5)
			{
				System.out.println("wait bigain " + System.currentTimeMillis());
				lock.wait();
				System.out.println("wait end"+ System.currentTimeMillis());
			}
		}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
