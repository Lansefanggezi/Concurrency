package com.Condition.Service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

	private static ReentrantLock lock = new ReentrantLock();
	
	//"1"���Condition
	final private static Condition condition1 = lock.newCondition();
	
	//"2"���Condition
	final private static  Condition condition2 = lock.newCondition();
	
	//"3"���Condition
	final private static  Condition condition3 = lock.newCondition();
	
	//�жϴ�ӡ����
	volatile private static int printValue = 1;
	
	//��ӡ��1���ķ���
	public void print1()
	{
		try 
		{
			//�����
			lock.lock();
			
			while(printValue !=1)
			{
				//����WAITING
				condition1.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("��ǰValue��1" + Thread.currentThread().getName());
			Thread.sleep(1000);
			condition2.signalAll();
			
			//��ӡ��2��
			printValue = 2;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.unlock();
		}
	}
	
	//��ӡ��2���ķ���
	public void print2()
	{
		try
		{
			//�����
			lock.lock();
			
			while(printValue != 2)
			{
				//����WAITING
				condition2.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("��ӡValue��2" + Thread.currentThread().getName());
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
	
	//��ӡ��3���ķ���
	public void print3()
	{
		try
		{
			//�����
			lock.lock();
			
			while(printValue != 3)
			{
				//����WAITING
				condition3.await();
			}
			System.out.println(System.currentTimeMillis());
			System.out.println("��ӡValue��3" + Thread.currentThread().getName());
			Thread.sleep(1000);
			
			//����Condition3
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
