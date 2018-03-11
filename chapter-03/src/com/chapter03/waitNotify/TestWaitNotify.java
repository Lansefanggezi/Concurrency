package com.chapter03.waitNotify;

public class TestWaitNotify {

	public static void main(String[] args) {
		// ThreadB释放后 ThreadA开始执行
		Object lock = new Object();
		
		try {
			MyThread1 threadA = new MyThread1(lock);
			threadA.setName("A");
			threadA.start();
			Thread.sleep(3000);
			
			MyThread2 threadB = new MyThread2(lock);
			threadB.setName("B");
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
