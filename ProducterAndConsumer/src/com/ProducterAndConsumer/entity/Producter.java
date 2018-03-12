package com.ProducterAndConsumer.entity;

public class Producter {
	
	//Lock��
	private String lock;
	
	//���췽��
	public Producter(String lock)
	{
		super();
		this.lock = lock;
	}
	
	public void setValue()
	{
		try{
			synchronized(lock)
			{
				if(!ValueObject.value.equals(""))
				{
					lock.wait();
				}
				String value = System.currentTimeMillis() + "-"
						+ System.nanoTime();
				System.out.println("set��ֵ��:" + value);
				ValueObject.value = value;
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
