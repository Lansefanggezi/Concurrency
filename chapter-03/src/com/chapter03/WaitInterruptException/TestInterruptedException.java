package com.chapter03.WaitInterruptException;

public class TestInterruptedException {

	public static void main(String[] args) {
		// ��һ���߳�ִ��wait()����ʱ,��ִ��interrupt()����,�ᱬ���쳣
		try{
			Object lock = new Object();
			
			ThreadA threadA = new ThreadA(lock);
			
			threadA.start();
			
			//�����ʵ���sleep
			threadA.sleep(1000);
			
			threadA.interrupt();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
