package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		try {
			System.out.println("����run��" + new Date());
			
			//�߳�Sleep5��
			Thread.sleep(5000);
			System.out.println("�˳�run��" + new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
