package com.piped.thread;

import java.io.PipedWriter;

import com.piped.service.WriteData;

public class WriterThread extends Thread {

	private WriteData  witerDate;
	private PipedWriter out;
	public WriterThread( PipedWriter out,WriteData writeData)
	{
		this.witerDate = writeData;
		this.out = out;
	}
	
	@Override
	public void run()
	{
		witerDate.writeMethod(out);
	}
}
