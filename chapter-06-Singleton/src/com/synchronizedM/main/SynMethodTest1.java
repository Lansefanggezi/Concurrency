package com.synchronizedM.main;

import com.synchronizedM.thread.SynMethodThread;

public class SynMethodTest1 {

	public static void main(String[] args)
	{
		SynMethodThread thread1 = new SynMethodThread();

		SynMethodThread thread2 = new SynMethodThread();
		
		SynMethodThread thread3 = new SynMethodThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
