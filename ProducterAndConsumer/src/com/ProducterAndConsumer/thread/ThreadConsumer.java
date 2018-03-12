package com.ProducterAndConsumer.thread;

import com.ProducterAndConsumer.entity.Consumer;

public class ThreadConsumer extends Thread {

	//Ïû·ÑÕß
	private Consumer con;
	
	public ThreadConsumer(Consumer con)
	{
		super();
		this.con = con;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			con.getValue();
		}
	}
}
