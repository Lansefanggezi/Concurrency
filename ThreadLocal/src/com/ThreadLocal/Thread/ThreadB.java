package com.ThreadLocal.Thread;

import com.ThreadLocal.Tool.Tool;

public class ThreadB extends Thread {

	@Override
	public void run()
	{
		for(int i = 10; i> 0; i--)
		{
//			Tool.threadLocal.set("ThreadB �洢������:" + i);
//			Tool.threadLocalExtens.set("ThreadB �洢������:" + i);
			System.out.println("ThreadB �洢������:"+ Tool.threadLocalExtens.get());
		}
	}
}
