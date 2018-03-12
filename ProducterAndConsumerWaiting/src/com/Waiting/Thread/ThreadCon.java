package com.Waiting.Thread;

import com.Waiting.Entity.ConsumerWaiting;

public class ThreadCon extends Thread {

	private ConsumerWaiting con;
	
	public ThreadCon(ConsumerWaiting con)
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
