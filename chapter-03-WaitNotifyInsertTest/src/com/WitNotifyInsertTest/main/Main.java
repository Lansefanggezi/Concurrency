package com.WitNotifyInsertTest.main;

import com.WitNotifyInsertTest.service.DBTools;
import com.WitNotifyInsertTest.thread.AddThread;
import com.WitNotifyInsertTest.thread.PopThread;

public class Main {

	public static void main(String[] args) {
		DBTools tools = new DBTools();
		for(int i = 0; i<10; i++)
		{
			AddThread addThread = new AddThread(tools);
			addThread.start();
			PopThread popThread = new PopThread(tools);
			popThread.start();
		}
	}

}
