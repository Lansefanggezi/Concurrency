package com.TimerTask.Task;

import java.util.TimerTask;

public class MyTaskC extends TimerTask {

	private int i;
	
	public MyTaskC(int i )
	{
		this.i = i; 
	}
	
	@Override
	public void run() {
		System.out.println("��"+ i + "�Σ�����run����");

	}

}
