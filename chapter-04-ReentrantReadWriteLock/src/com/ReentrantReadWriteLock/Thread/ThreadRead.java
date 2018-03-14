package com.ReentrantReadWriteLock.Thread;

import com.ReentrantReadWriteLock.Service.ReadAndWrite;

public class ThreadRead extends Thread {

	private ReadAndWrite  readAndWrite = new ReadAndWrite();
	
	public ThreadRead(ReadAndWrite readAndWrite)
	{
		super();
		this.readAndWrite = readAndWrite;
	}
	
	@Override
	public void run()
	{
		readAndWrite.ReadMethod();
	}
}
