package com.synchronizedM.thread;

import com.synchronizedM.objec.MyObject;

public class SynMethodThread extends Thread {

	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
