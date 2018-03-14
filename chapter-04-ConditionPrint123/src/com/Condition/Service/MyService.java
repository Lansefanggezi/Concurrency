package com.Condition.Service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private static ReentrantLock lock = new ReentrantLock();
	
	//"1"相关Condition
	final private static Condition condition1 = lock.newCondition();
	
	//"2"相关Condition
	final private static  Condition condition2 = lock.newCondition();
	
	//"3"相关Condition
	final private static  Condition condition3 = lock.newCondition();
	
	//判断打印对象
	volatile private static int printValue = 1;
	
	//打印“1”的方法
	public void print1()
	{
		try 
		{
			//获得锁
			lock.lock();
			
			while(printValue !=1)
			{
				//进入WAITING
				condition1.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("当前Value：1" + Thread.currentThread().getName());
			Thread.sleep(1000);
			condition2.signalAll();
			
			//打印“2”
			printValue = 2;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
	
	//打印“2”的方法
	public void print2()
	{
		try
		{
			//获得锁
			lock.lock();
			
			while(printValue != 2)
			{
				//进入WAITING
				condition2.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("打印Value：2" + Thread.currentThread().getName());
			Thread.sleep(1000);
			condition3.signalAll();
			printValue = 3;
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
	
	//打印“3”的方法
	public void print3()
	{
		try
		{
			//获得锁
			lock.lock();
			
			while(printValue != 3)
			{
				//进入WAITING
				condition3.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("打印Value：3" + Thread.currentThread().getName());
			Thread.sleep(1000);
			
			//唤醒Condition3
			condition1.signalAll();
			printValue = 1;
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
}
