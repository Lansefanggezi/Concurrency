package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskA extends TimerTask {
	
	@Override
	public void run()
	{
		System.out.println("���� MyTaskA run���� :" + new Date() + Thread.currentThread().getName());
		//����TimerTask��cancle��������
		this.cancel();
		System.out.println("�˳� MyTaskA run������" + new Date());
	}
	
}
