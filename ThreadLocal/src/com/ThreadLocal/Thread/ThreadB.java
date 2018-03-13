package com.ThreadLocal.Thread;

import com.ThreadLocal.Tool.Tool;

public class ThreadB extends Thread {

	@Override
	public void run()
	{
		for(int i = 10; i> 0; i--)
		{
			Tool.threadLocal.set("ThreadB 存储的数据:" + i);
			System.out.println("ThreadB 存储的数据:"+ Tool.threadLocal.get());
		}
	}
}
