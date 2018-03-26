package com.WitNotifyInsertTest.service;

public class DBTools {

	//���ݿ�������־��Ϊfalse��ʾû������,��������
	volatile private boolean flg = false;
	
	synchronized public void addMethod()
	{
		try {
			while(flg)
			{
				wait();
			}
			
			//���
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
			
			//���
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
