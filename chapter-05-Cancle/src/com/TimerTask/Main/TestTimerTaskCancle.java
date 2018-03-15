package com.TimerTask.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTaskA;
import com.TimerTask.Task.MyTaskB;

public class TestTimerTaskCancle {

	public static void main(String[] args) {
		// 测试TimerTask的Cancle方法
		
		try {
			System.out.println("当前时间：" + new Date());
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 20);
			//计划运行时间
			Date runDate = calendar.getTime();
			System.out.println("计划运行时间：" + runDate);
			
			MyTaskA myTaskA = new MyTaskA();
			MyTaskB myTaskB = new MyTaskB();
			
			Timer timer = new Timer();
			timer.schedule(myTaskA, runDate, 3000);
			Timer timer1 = new Timer();
			timer1.schedule(myTaskB, runDate, 3000);
			//TimerTask类的cancle方法是将自己从任务队列中清除，但是本身任务会执行完
			//同一个Timer是同一个线程
			Thread.sleep(4000);
			timer1.cancel();
			
			System.out.println(Thread.activeCount());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
