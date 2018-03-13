package com.ThreadLocal.Thread;

import com.ThreadLocal.Tool.Tool;

public class ThreadA extends Thread {

	@Override
	public void run()
	{
		for(int i = 0; i<10; i++)
		{
			Tool.threadLocal.set("ThreadA" + i);
			System.out.println("ThreaA ´æ´¢µÄÊý¾Ý£º" + Tool.threadLocal.get());
		}
	}
}
