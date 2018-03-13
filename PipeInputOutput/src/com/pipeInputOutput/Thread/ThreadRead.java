package com.pipeInputOutput.Thread;

import java.io.PipedInputStream;

import com.pipeInputOutput.service.ReadData;

public class ThreadRead extends Thread {

	private ReadData readData;
	private PipedInputStream pipe;
	
	public ThreadRead(ReadData readData, PipedInputStream pipe)
	{
		super();
		this.readData = readData;
		this.pipe = pipe;
	}
	
	@Override
	public void run()
	{
		readData.readMethod(pipe);
	}
}
