package com.ScheduleAtFixedRate.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleAtFixedRateMain {

	static class MyTask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println("��ʼʱ�䣺" + new Date());
			
			System.out.println("����ʱ��:" + new Date());
		}
	}
	public static void main(String[] args) {
		// scheduleAtFixedRate��������׷��ִ����
		MyTask myTask = new MyTask();
		
		System.out.println("����ʱ�䣺" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 20);
		
		//ִ��ʱ��
		Date runTime = calendar.getTime();
		System.out.println("ִ��ʱ�䣺" + runTime);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(myTask, runTime, 2000);

	}

}
