package com.chapter03.WaitOld;

public class Subtract {
	private String lock;
	
	public Subtract(String lock)
	{
		super();
		this.lock = lock;
	}
	
	public void sub()
	{
		try
		{
			synchronized(lock)
			{
//				while(ValueObject.list.size() == 0)
				while(ValueObject.list.size() == 0)
				{
					System.out.println("线程:" + Thread.currentThread().getName()
							+ "开始:" +System.currentTimeMillis());
					lock.wait();
					System.out.println("线程:" + Thread.currentThread().getName()
							+ "结束:" +System.currentTimeMillis());
				}
				ValueObject.list.remove(0);
				System.out.println("List的 Size:" + ValueObject.list.size());
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
