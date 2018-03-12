package com.Waiting.Entity;

public class ProducterWaiting {

	private String lock;
	public ProducterWaiting(String lock)
	{
		super();
		this.lock = lock;
	}
	
	public void setValue()
	{
		try
		{
			synchronized(lock)
			{
				while(!ValueObject.value.equals(""))
				{
					System.out.println("生产者:" + Thread.currentThread().getName()
							+ "WAITING 了.");
					lock.wait();
				}
				System.out.println("生产者:" + Thread.currentThread().getName()
						+ "RUNNABLE了.");
				String value = System.currentTimeMillis() + "-"
						+System.nanoTime();
				ValueObject.value = value;
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
