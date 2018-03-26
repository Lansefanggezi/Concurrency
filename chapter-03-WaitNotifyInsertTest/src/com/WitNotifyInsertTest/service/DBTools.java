package com.WitNotifyInsertTest.service;

public class DBTools {

	//数据可消除标志，为false表示没有数据,不可消除
	volatile private boolean flg = false;
	
	synchronized public void addMethod()
	{
		try {
			while(flg)
			{
				wait();
			}
			
			//输出
			for(int i = 0; i< 5; i++)
			{
				System.out.println("AddMethod");
			}
			
			flg = true;
			notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized public void popMethod()
	{
		try {
			while(!flg)
				wait();
			
			//输出
			for(int i = 0; i< 5; i++)
			{
				System.out.println("PopMethod");
			}
			flg = false;
			notifyAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
