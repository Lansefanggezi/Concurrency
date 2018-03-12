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
					System.out.println("������:" + Thread.currentThread().getName()
							+ "WAITING ��.");
					lock.wait();
				}
				System.out.println("������:" + Thread.currentThread().getName()
						+ "RUNNABLE��.");
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
