/*
 * 延时导致任务开始时间间隔不再是period时间
 * */
package com.TimerTask.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTask;

public class TestPeriodLater {

	public static void main(String[] args) {
		//打印当前时间 
		System.out.println("当前时间：" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		Date runDate = calendar.getTime();
		
		MyTask task = new MyTask();
		Timer timer = new Timer();

		//每两秒执行一次
		timer.schedule(task, runDate, 2000);
		
	}

}
