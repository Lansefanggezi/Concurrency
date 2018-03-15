package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {
	
	@Override
	public void run()
	{
		System.out.println("进入 MyTaskBrun方法 :" + new Date() + Thread.currentThread().getName());
		System.out.println("退出 MyTaskBrun方法：" + new Date());
	}
	
}
