package com.chapter03.WaitOld;

public class TestWaitOld {

	public static void main(String[] args) {
		// Wait���������ı��,���ܳ��ָ��ֺ��
		try
		{
			String lock = new String("");
			Add add = new Add(lock);
			Subtract sub = new Subtract(lock);
			//��sizeΪ0ʱ,����remov�̶߳���Wait
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
