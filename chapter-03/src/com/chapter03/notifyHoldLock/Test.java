package com.chapter03.notifyHoldLock;

public class Test {

	public static void main(String[] args) {
		// ����ִ����Notify()���ڵ�ͬ������������ͷ���
		Object lock = new Object();
		
		ThreadA threadA = new ThreadA(lock);
		threadA.setName("A");
		threadA.start();
		
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.setName("notifyThread");
		notifyThread.start();
		
		synNotifyMethodThread syn = new synNotifyMethodThread(lock);
		syn.setName("syn");
		syn.start();
	}

}
