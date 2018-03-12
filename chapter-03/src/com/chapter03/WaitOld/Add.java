package com.chapter03.WaitOld;

public class Add {
	private String lock;
	
	public Add (String lock)
	{
		super();
		this.lock = lock;
	}
	
	public void add()
	{
		synchronized(lock){
			ValueObject.list.add("angString");
			
			//唤醒所有Wait线程
			lock.notifyAll();
		}
	}
}
