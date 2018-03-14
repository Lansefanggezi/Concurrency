package com.ReentrantReadWriteLock.Service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWrite {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	//������
	public void ReadMethod()
	{
		try {
			System.out.println("��ǰ�ķ����Ƕ���" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			
			lock.readLock().lock();
			System.out.println("��ǰ�����Ƕ�����" + Thread.currentThread().getName()
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
	
	//д����
	public void WriteMethod()
	{
		try
		{
			System.out.println("��ǰ�ķ�����д��" + Thread.currentThread().getName()
					+ "---" + System.currentTimeMillis());
			lock.writeLock().lock();	
			
			System.out.println("��ǰ������д����" + Thread.currentThread().getName()
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
