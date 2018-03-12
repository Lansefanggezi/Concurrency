package com.chapter03.WaitOld;

public class ThreadSub extends Thread {
	private Subtract sub;
	
	public ThreadSub(Subtract sub)
	{
		super();
		this.sub = sub;
	}
	
	@Override
	public void run()
	{
		sub.sub();
	}
}
