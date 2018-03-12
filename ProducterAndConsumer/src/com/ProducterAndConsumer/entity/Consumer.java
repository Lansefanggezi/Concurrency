package com.ProducterAndConsumer.entity;

public class Consumer {
	//Lock��
	private String lock;
	
	//��ƨ���Ʒ���
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
				System.out.println("get��ֵ��:" + ValueObject.value);
				ValueObject.value = "";
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
