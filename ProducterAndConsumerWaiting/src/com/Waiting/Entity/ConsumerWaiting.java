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
					System.out.println("消费者:" + Thread.currentThread().getName()
							+ "WAITING了.");
					lock.wait();
				}
				System.out.println("消费者:" + Thread.currentThread().getName()
						+ "RUNNABLE了.");
				//消费
				ValueObject.value = "";
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
