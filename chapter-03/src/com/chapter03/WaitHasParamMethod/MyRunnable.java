package com.chapter03.WaitHasParamMethod;

public class MyRunnable {
	private static Object lock = new Object();
	static private Runnable runnable1 = new Runnable()
	{
		@Override
		public void run()
		{
			try{
				synchronized(lock)
				{
					System.out.println("Wait Begin :" + System.currentTimeMillis());
					//穿上一个参数
					lock.wait(5000);
					System.out.println("Wait End : " + System.currentTimeMillis());
				}
			}catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	};
	public static void main(String[] args)
	{
		//执行wait(5000)后,过了5秒钟,自动唤醒
		Thread thread = new Thread(runnable1);
		thread.start();
	}
}
