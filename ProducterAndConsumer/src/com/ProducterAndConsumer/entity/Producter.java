package com.ProducterAndConsumer.entity;

public class Producter {
	
	//Lock用
	private String lock;
	
	//构造方法
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
				System.out.println("set的值是:" + value);
				ValueObject.value = value;
				lock.notify();
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
