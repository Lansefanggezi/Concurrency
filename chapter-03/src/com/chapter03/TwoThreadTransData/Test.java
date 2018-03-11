package com.chapter03.TwoThreadTransData;

public class Test {

	public static void main(String[] args) {
		// 不使用等待/通知机制实现线程间的通信
		// 很有可能监听不到
		Mylist service = new Mylist();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
	}

}
