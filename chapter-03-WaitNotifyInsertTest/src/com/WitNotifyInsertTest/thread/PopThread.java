package com.WitNotifyInsertTest.thread;

import com.WitNotifyInsertTest.service.DBTools;

public class PopThread extends Thread {

	private DBTools tools;
	
	public PopThread(DBTools tools)
	{
		this.tools = tools;
	}
	@Override
	public void run()
	{
		tools.popMethod();
	}
}
