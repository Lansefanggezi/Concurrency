package com.Condition.Main;

import com.Condition.Service.MyService;
import com.Condition.Thread.ThreadPrint1;
import com.Condition.Thread.ThreadPrint2;
import com.Condition.Thread.ThreadPrint3;

public class Print123 {

	public static void main(String[] args) {
		
		// 顺序打印123 
		MyService service = new MyService();
		
		//线程
		ThreadPrint1[] threadPrint1 = new ThreadPrint1[5];
		ThreadPrint2[] threadPrint2 = new ThreadPrint2[5];
		ThreadPrint3[] threadPrint3 = new ThreadPrint3[5];
		
		//启动线程
		for(int i = 0; i<5 ; i++)
		{
			threadPrint1[i] = new ThreadPrint1(service);
			threadPrint1[i].setName("Print1");
			
			threadPrint2[i] = new ThreadPrint2(service);
			threadPrint2[i].setName("Print2");
			
			threadPrint3[i] = new ThreadPrint3(service);
			threadPrint3[i].setName("Print3");
			
			//逆序启动
			threadPrint1[i].start();
			threadPrint2[i].start();
			threadPrint3[i].start();
		}
	}

}
