package com.Condition.Thread;

import com.Condition.Service.MyService;

public class ThreadSet extends Thread {

	private MyService service;
	
	public ThreadSet(MyService service)
	{
		super();
		this.service = service;
	}
	
	@Override
	public void run()
	{
		service.setValue();
	}
}
