package com.TimerTask.Main;

import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTaskC;

public class TestTimerCancleError {

	public static void main(String[] args) {
		//�������Ϊtimerû������queue���������������û�а�������� 
		int i = 0;
		
		System.out.println("��ǰʱ�䣺" + new Date());
		while(true)
		{
			i++;
			Timer timer = new Timer();
			MyTaskC myTaskC = new MyTaskC(i);
			timer.schedule(myTaskC, 0);
			timer.cancel();
		}

	}

}
