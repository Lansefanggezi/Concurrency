package com.pipeInputOutput.Thread;

import java.io.PipedOutputStream;

import com.pipeInputOutput.service.WriteData;

public class ThreadWrite extends Thread {

	private WriteData writeDate;
	private PipedOutputStream pipe;
	
	public ThreadWrite(WriteData writeDate, PipedOutputStream pipe)
	{
		super();
		this.writeDate = writeDate;
		this.pipe = pipe;
	}
	
	@Override
	public void run()
	{
		writeDate.WirMethod(pipe);
	}
}
