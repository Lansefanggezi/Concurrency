package com.Condition.Thread;

import com.Condition.Service.MyService;

public class ThreadGet extends Thread {

	private MyService service;
	
	public ThreadGet(MyService service)
	{
		super();
		this.service = service;
	}
	
	@Override
	public void run()
	{
		service.get();
	}
}
