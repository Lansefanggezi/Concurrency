package com.ProducterAndConsumer.thread;

import com.ProducterAndConsumer.entity.Producter;

public class ThreadProducter extends Thread {

	//ЩњВњеп
	private Producter pro;
	
	public ThreadProducter(Producter pro)
	{
		super();
		this.pro = pro;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			pro.setValue();
		}
	}
}
