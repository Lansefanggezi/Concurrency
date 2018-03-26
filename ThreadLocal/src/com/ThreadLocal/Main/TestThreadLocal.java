package com.ThreadLocal.Main;

import com.ThreadLocal.Thread.ThreadA;
import com.ThreadLocal.Thread.ThreadB;
import com.ThreadLocal.Tool.Tool;

public class TestThreadLocal {

	public static void main(String[] args) {
		try {		
			// ThreadLocal可以分别存储线程的数据,并且具有隔离性,第一次调用返回Null
			ThreadA threadA = new ThreadA();
			ThreadB threadB = new ThreadB();
			
			threadA.start();
			threadB.start();
			Thread.sleep(5000);
			
			for(int i = 0 ; i<10; i++)
			{
//				Tool.threadLocal.set("Main" + i);
				//Tool.threadLocalExtens.set("Main" + i);
				System.out.println("Main get value" + Tool.threadLocalExtens.get());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
