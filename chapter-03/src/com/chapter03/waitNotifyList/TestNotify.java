package com.chapter03.waitNotifyList;

public class TestNotify {

	public static void main(String[] args) {
		// notify()����ִ�к�,û�������ͷ���
		
		try {
			Object lock = new Object();
			ThreadA threadA = new ThreadA(lock);
			threadA.start();
	
				Thread.sleep(3000);
	
			
			ThreadB threadB = new ThreadB(lock);
			threadB.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
