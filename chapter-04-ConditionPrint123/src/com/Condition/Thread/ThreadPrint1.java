package com.Condition.Thread;

import com.Condition.Service.MyService;

public class ThreadPrint1 extends Thread {

	private MyService service;
	
	public ThreadPrint1(MyService service)
	{
		super();
		this.service = service;
	}
	
	@Override
	public void run()
	{
		service.print1();
	}
	
}
