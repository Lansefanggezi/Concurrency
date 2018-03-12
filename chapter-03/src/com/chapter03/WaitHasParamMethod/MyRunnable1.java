package com.chapter03.WaitHasParamMethod;

public class MyRunnable1 {
	static private Object lock =  new Object();
	static private Runnable myRunnable = new Runnable()
	{

			@Override
			public void run()
			{		
				try{
					synchronized(lock)
					{
						System.out.println("Begin Wait :" + System.currentTimeMillis());
						lock.wait(5000);
						System.out.println("End Wait :" + System.currentTimeMillis());
					}
				}catch(InterruptedException ex)
				{
					ex.printStackTrace();
				}
			}

	};
	
	static private Runnable myRunnable2 = new Runnable()
	{
		@Override
		public void run()
		{
			synchronized(lock)
			{
				lock.notify();
			}
		}
	};
	public static void main(String[] args)
	{
		//超过了5秒自动唤醒
		try{
			Thread t1 = new Thread(myRunnable);
			t1.start();
			Thread.sleep(9000);
			Thread t2 = new Thread(myRunnable2);
			t2.start();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
