package com.Dcl.main;

import com.Dcl.thread.SynMethodThread1;

public class SynMethodTest1 {

	public static void main(String[] args)
	{
		SynMethodThread1 thread1 = new SynMethodThread1();

		SynMethodThread1 thread2 = new SynMethodThread1();
		
		SynMethodThread1 thread3 = new SynMethodThread1();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
