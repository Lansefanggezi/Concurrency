package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTaskB extends TimerTask {
	
	@Override
	public void run()
	{
		System.out.println("���� MyTaskBrun���� :" + new Date() + Thread.currentThread().getName());
		System.out.println("�˳� MyTaskBrun������" + new Date());
	}
	
}
