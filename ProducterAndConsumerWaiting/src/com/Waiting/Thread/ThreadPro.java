package com.Waiting.Thread;

import com.Waiting.Entity.ProducterWaiting;

public class ThreadPro extends Thread {

	private ProducterWaiting pro;
	
	public ThreadPro(ProducterWaiting pro)
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
