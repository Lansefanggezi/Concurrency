/*
 * Ïû·ÑÕß
 * */
package com.ProAndCon.Thread;

import com.ProAndCon.entity.Consumer;
import com.ProAndCon.entity.MyStack;

public class ThreadCon extends Thread {

	private Consumer con;
	
	public ThreadCon(Consumer con)
	{
		super();
		this.con = con;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			con.popService();
		}
	}
}
