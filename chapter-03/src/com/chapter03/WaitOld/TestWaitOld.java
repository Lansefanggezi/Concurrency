package com.chapter03.WaitOld;

public class TestWaitOld {

	public static void main(String[] args) {
		// Wait条件发生改变后,可能出现各种后果
		try
		{
			String lock = new String("");
			Add add = new Add(lock);
			Subtract sub = new Subtract(lock);
			//当size为0时,两个remov线程都是Wait
			ThreadSub subThread1 = new ThreadSub(sub);
			subThread1.setName("subThread1");
			subThread1.start();
			
			ThreadSub subThread2 = new ThreadSub(sub);
			subThread2.setName("subThread2");
			subThread2.start();
			Thread.sleep(3000);
			ThreadAdd addThread = new ThreadAdd(add);
			addThread.start();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
