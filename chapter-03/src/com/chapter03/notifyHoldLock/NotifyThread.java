package com.chapter03.notifyHoldLock;

public class NotifyThread extends Thread {
	private Object lock;
	
	public NotifyThread(Object lock)
	{
		super();
		this.lock = lock;
	}
	
	@Override
	public void run()
	{
		Service serrice = new Service();
		serrice.synNotifyMethod(lock);
	}
}
