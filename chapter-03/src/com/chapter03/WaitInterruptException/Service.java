package com.chapter03.WaitInterruptException;

public class Service {
	public void waitMethod(Object lock)
	{
		try{
			synchronized(lock){
				System.out.println("WaitMethod : begin");
				lock.wait();
				System.out.println("WaitMethod : end");
			}
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
			System.out.println("���쳣��,����Ϣ��catch�ڲ���ӡ.");
		}
	}
}
