package com.Waiting.Entity;

public class ConsumerWaiting {

	private String lock;
	
	public ConsumerWaiting(String lock)
	{
		super();
		this.lock = lock;
	}
	
	public void getValue()
	{
		try
		{
			synchronized(lock)
			{
				while(ValueObject.value.equals(""))
				{
					System.out.println("������:" + Thread.currentThread().getName()
							+ "WAITING��.");
					lock.wait();
				}
				System.out.println("������:" + Thread.currentThread().getName()
						+ "RUNNABLE��.");
				//����
				ValueObject.value = "";
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
