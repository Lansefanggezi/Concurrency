package com.Condition.Thread;

import com.Condition.Service.MyService;

public class ThreadPrint3 extends Thread {

	private MyService service;
	
	public ThreadPrint3(MyService service)
	{
		super();
		this.service = service;
	}
	
	@Override
	public void run()
	{
		service.print3();
	}
	
}
