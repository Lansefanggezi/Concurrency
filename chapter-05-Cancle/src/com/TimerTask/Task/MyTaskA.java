package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	
	@Override
	public void run()
	{
		System.out.println("进入 MyTaskA run方法 :" + new Date() + Thread.currentThread().getName());
		//这是TimerTask的cancle（）方法
		this.cancel();
		System.out.println("退出 MyTaskA run方法：" + new Date());
	}
	
}
