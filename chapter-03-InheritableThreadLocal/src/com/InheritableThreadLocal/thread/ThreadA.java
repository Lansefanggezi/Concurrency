package com.InheritableThreadLocal.thread;

import com.InheritableThreadLocal.service.Tools;

public class ThreadA extends Thread {

	@Override
	public void run()
	{
		try {
			for(int i =0; i< 5; i++)
			{
				System.out.println(Tools.inheritableThreadLocal.get() + "ThreadA");
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
