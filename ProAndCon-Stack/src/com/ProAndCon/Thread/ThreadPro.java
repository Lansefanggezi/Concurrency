package com.ProAndCon.Thread;

import com.ProAndCon.entity.Producter;

public class ThreadPro extends Thread {

	private Producter pro;
	
	public ThreadPro(Producter pro)
	{
		super();
		this.pro = pro;
	}
	
	@Override
	public void run()
	{
		pro.pushService();
	}
}
