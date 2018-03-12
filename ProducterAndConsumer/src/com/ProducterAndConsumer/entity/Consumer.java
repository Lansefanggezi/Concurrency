package com.ProducterAndConsumer.entity;

public class Consumer {
	//Lock用
	private String lock;
	
	//狗屁杂牌方法
	public Consumer(String lock)
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
				if(ValueObject.value.equals(""))
				{
					lock.wait();
				}
				System.out.println("get的值是:" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
