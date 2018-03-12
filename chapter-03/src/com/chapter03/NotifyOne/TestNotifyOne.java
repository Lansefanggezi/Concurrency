package com.chapter03.NotifyOne;

public class TestNotifyOne {

	public static void main(String[] args) {
		// Notify只能随机唤醒一个Wait线程
		
		try{
			Object lock = new Object();
			ThreadA a = new ThreadA(lock);
			a.start();
			
			ThreadB b = new ThreadB(lock);
			b.start();
			
			ThreadC c = new ThreadC(lock);
			c.start();
			
			Thread.sleep(3000);
			
			NotifyThread notifyThread = new NotifyThread(lock);
			notifyThread.start();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
