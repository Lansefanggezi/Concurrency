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
			System.out.println("开始时间：" + new Date());
			
			System.out.println("结束时间:" + new Date());
		}
	}
	public static void main(String[] args) {
		// scheduleAtFixedRate方法具有追赶执行性
		MyTask myTask = new MyTask();
		
		System.out.println("现在时间：" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 20);
		
		//执行时间
		Date runTime = calendar.getTime();
		System.out.println("执行时间：" + runTime);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(myTask, runTime, 2000);

	}

}
