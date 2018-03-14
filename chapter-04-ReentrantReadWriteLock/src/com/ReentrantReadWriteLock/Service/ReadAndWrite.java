package com.ReentrantReadWriteLock.Service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWrite {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	//读方法
	public void ReadMethod()
	{
		try {
			System.out.println("当前的方法是读：" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			
			lock.readLock().lock();
			System.out.println("当前的锁是读锁：" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.readLock().unlock();
		}
	}
	
	//写方法
	public void WriteMethod()
	{
		try
		{
			System.out.println("当前的方法是写：" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			lock.writeLock().lock();	
			
			System.out.println("当前的锁是写锁：" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.writeLock().unlock();
		}
	}
}
