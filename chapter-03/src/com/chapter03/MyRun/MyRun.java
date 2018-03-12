package com.chapter03.MyRun;

public class MyRun {
	private String lock = new String("");
	
	private Runnable runbale1 = new Runnable()
	{
		@Override
		public void run()
		{
			try{
				synchronized(lock)
				{
					System.out.println("Wait Begin :" + System.currentTimeMillis());
					lock.wait();
					System.out.println("Wait End   :" + System.currentTimeMillis());
					
				}
			}catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	};
	
	private Runnable runnable2 = new Runnable()
	{
		@Override
		public void run()
		{
			synchronized(lock)
			{
				System.out.println("Notify Begion:" + System.currentTimeMillis());
				lock.notify();
				System.out.println("Notify End   :" + System.currentTimeMillis());
			}
		}
	};
	
	public static void main(String [] args)
	{
		//先Notify后Wait, Wait线程将无法唤醒
		MyRun run = new MyRun();
		Thread thread1 = new Thread(run.runnable2);
		thread1.start();
		
		Thread thread2 = new Thread(run.runbale1);
		thread2.start();
	}
		
}
