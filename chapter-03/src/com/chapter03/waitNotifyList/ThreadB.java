package com.chapter03.waitNotifyList;

public class ThreadB extends Thread {
	public Object lock;
	
	public ThreadB(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		synchronized(lock)
		{
			for (int i = 0; i<10; i++)
			{
				MyList.add();
				if(MyList.size() == 5)
				{
					lock.notify();
					System.out.println("notify bigin" + System.currentTimeMillis());
				}
			}
			System.out.println("notigy end" + System.currentTimeMillis());
		}
	}
}
