/*
 * ��ʱ��������ʼʱ����������periodʱ��
 * */
package com.TimerTask.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTask;

public class TestPeriodLater {

	public static void main(String[] args) {
		//��ӡ��ǰʱ�� 
		System.out.println("��ǰʱ�䣺" + new Date());
		
		Calendar calendar = Calendar.getInstance();
		Date runDate = calendar.getTime();
		
		MyTask task = new MyTask();
		Timer timer = new Timer();

		//ÿ����ִ��һ��
		timer.schedule(task, runDate, 2000);
		
	}

}
