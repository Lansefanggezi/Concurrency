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
					//����һ������
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
		//ִ��wait(5000)��,����5����,�Զ�����
		Thread thread = new Thread(runnable1);
		thread.start();
	}
}
