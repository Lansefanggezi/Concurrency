package com.ReentrantReadWriteLock.Thread;

import com.ReentrantReadWriteLock.Service.ReadAndWrite;

public class ThreadWrite extends Thread {

	private ReadAndWrite readAndWrite = new ReadAndWrite();
	
	public ThreadWrite(ReadAndWrite readAndWrite)
	{
		super();
		this.readAndWrite = readAndWrite;
	}
	
	@Override
	public void run()
	{
		readAndWrite.WriteMethod();
	}
}
