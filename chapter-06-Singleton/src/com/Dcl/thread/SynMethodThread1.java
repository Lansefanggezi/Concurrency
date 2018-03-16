package com.Dcl.thread;

import com.Dcl.Object.MyObject1;

public class SynMethodThread1 extends Thread {

	@Override
	public void run()
	{
		System.out.println(MyObject1.getInstance().hashCode());
	}
}
