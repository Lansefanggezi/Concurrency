package com.chapter03.waitNotify;

public class MyThread1 extends Thread {
	private Object lock;
	
	public MyThread1(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		try {
			synchronized(lock)
			{
				System.out.println(Thread.currentThread().getName() + "开始 wait时间："
						+ System.currentTimeMillis());
					lock.wait();
				System.out.println(Thread.currentThread().getName() + "结束wait时间："
						+ System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
