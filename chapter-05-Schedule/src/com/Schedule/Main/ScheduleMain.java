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
			System.out.println("开始时间：" + new Date());
			System.out.println("结束时间：" + new Date());
		}
	}

	public static void main(String[] args) {
		// schedule方法不具有追赶执行性
		MyStask myStask = new MyStask();
		System.out.println("现在 时间：" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND )- 20);
		
		//运行时间
		Date runDate = calendar.getTime();
		System.out.println("计划运行时间：" + runDate );
		
		Timer timer = new Timer();
		timer.schedule(myStask, runDate, 2000);
	}

}
