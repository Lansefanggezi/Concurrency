package com.chapter03.WaitInterruptException;

public class TestInterruptedException {

	public static void main(String[] args) {
		// 当一个线程执行wait()方法时,再执行interrupt()方法,会爆出异常
		try{
			Object lock = new Object();
			
			ThreadA threadA = new ThreadA(lock);
			
			threadA.start();
			
			//可以适当的sleep
			threadA.sleep(1000);
			
			threadA.interrupt();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}

}
