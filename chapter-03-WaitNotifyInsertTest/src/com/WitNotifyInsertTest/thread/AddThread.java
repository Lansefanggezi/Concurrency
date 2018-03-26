package com.WitNotifyInsertTest.thread;

import com.WitNotifyInsertTest.service.DBTools;

public class AddThread extends Thread {

	private DBTools tools ;
	
	public AddThread(DBTools tools)
	{
		this.tools = tools;
	}
	
	@Override
	public void run()
	{
		tools.addMethod();
	}
}
