package com.TimerTask.Main;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import com.TimerTask.Task.MyTaskA;
import com.TimerTask.Task.MyTaskB;

public class TestTimerTaskCancle {

	public static void main(String[] args) {
		// ����TimerTask��Cancle����
		
		try {
			System.out.println("��ǰʱ�䣺" + new Date());
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(Calendar.SECOND, calendar.get(Calendar.SECOND) - 20);
			//�ƻ�����ʱ��
			Date runDate = calendar.getTime();
			System.out.println("�ƻ�����ʱ�䣺" + runDate);
			
			MyTaskA myTaskA = new MyTaskA();
			MyTaskB myTaskB = new MyTaskB();
			
			Timer timer = new Timer();
			timer.schedule(myTaskA, runDate, 3000);
			Timer timer1 = new Timer();
			timer1.schedule(myTaskB, runDate, 3000);
			//TimerTask���cancle�����ǽ��Լ��������������������Ǳ��������ִ����
			//ͬһ��Timer��ͬһ���߳�
			Thread.sleep(4000);
			timer1.cancel();
			
			System.out.println(Thread.activeCount());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
