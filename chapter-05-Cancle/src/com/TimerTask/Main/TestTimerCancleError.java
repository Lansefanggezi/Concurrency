package com.TimerTask.Main;

import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTaskC;

public class TestTimerCancleError {

	public static void main(String[] args) {
		//会存在因为timer没有抢到queue的锁的情况，导致没有把任务清除 
		int i = 0;
		
		System.out.println("当前时间：" + new Date());
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
