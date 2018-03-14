package com.Condition.Main;

import com.Condition.Service.MyService;
import com.Condition.Thread.ThreadGet;
import com.Condition.Thread.ThreadSet;

public class TestConditionManyToMany {

	public static void main(String[] args) {
		// 用Condition实现：生产者/消费者 多对多循环打印
		
		MyService service = new MyService();
		
		ThreadGet[] threadGet = new ThreadGet[10];
		ThreadSet[] threadSet = new ThreadSet[10];
		
		for(int i = 0; i<10; i++)
		{
			threadGet[i] = new ThreadGet(service);
			threadSet[i] = new ThreadSet(service);
			
			threadGet[i].start();
			threadSet[i].start();
		}
		

	}

}
