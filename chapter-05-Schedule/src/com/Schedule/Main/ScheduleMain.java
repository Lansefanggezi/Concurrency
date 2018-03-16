package com.Schedule.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Timer;
import java.util.TimerTask;

public class ScheduleMain {
	
	static class MyStask extends TimerTask
	{
		@Override
		public void run()
		{
			System.out.println("��ʼʱ�䣺" + new Date());
			System.out.println("����ʱ�䣺" + new Date());
		}
	}

	public static void main(String[] args) {
		// schedule����������׷��ִ����
		MyStask myStask = new MyStask();
		System.out.println("���� ʱ�䣺" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND )- 20);
		
		//����ʱ��
		Date runDate = calendar.getTime();
		System.out.println("�ƻ�����ʱ�䣺" + runDate );
		
		Timer timer = new Timer();
		timer.schedule(myStask, runDate, 2000);
	}

}
