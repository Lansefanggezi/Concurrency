package com.Condition.Thread;

import com.Condition.Service.MyService;

public class ThreadPrint2 extends Thread {

	private MyService service;
	
	public ThreadPrint2(MyService service)
	{
		super();
		this.service = service;
	}
	
	@Override
	public void run()
	{
		service.print2();
	}
	
}
