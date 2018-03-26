package com.piped.thread;

import java.io.PipedReader;

import com.piped.service.ReadData;

public class ReadThread extends Thread {

	private PipedReader input;
	private ReadData readDate;
	
	public ReadThread(PipedReader input , ReadData readDate)
	{
		this.input = input;
		this.readDate = readDate;
	}
	
	@Override
	public void run()
	{
		readDate.ReadMethod(input);
	}
}
