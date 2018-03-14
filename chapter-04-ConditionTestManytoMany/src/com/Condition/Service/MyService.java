package com.Condition.Service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	
	public void setValue()
	{
		try {
			//上锁
			lock.lock();
			
			while(hasValue)
			{
				System.out.println("又可能 SET SET 相连。");
				//WAITING
				condition.await();
			}
			System.out.println("打印 SET ");
			hasValue = true;
			
			//唤醒所有线程
			condition.signalAll();
		} catch (InterruptedException e) {
			System.out.println("Set Catch");
			e.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
	
	public void get()
	{
		try {
			lock.lock();
			while(!hasValue)
			{
				System.out.println("又可能 GET GET 相连。");
				//WAITING
				condition.await();
			}
			System.out.println("打印 GET ");
			hasValue = false;
			
			//唤醒所有线程
			condition.signalAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
}
