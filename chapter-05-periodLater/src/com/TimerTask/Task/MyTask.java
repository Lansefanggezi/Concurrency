package com.TimerTask.Task;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		try {
			System.out.println("进入run：" + new Date());
			
			//线程Sleep5秒
			Thread.sleep(5000);
			System.out.println("退出run：" + new Date());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
