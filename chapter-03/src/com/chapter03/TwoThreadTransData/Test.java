package com.chapter03.TwoThreadTransData;

public class Test {

	public static void main(String[] args) {
		// ��ʹ�õȴ�/֪ͨ����ʵ���̼߳��ͨ��
		// ���п��ܼ�������
		Mylist service = new Mylist();
		ThreadA threadA = new ThreadA(service);
		threadA.setName("A");
		threadA.start();
		
		ThreadB threadB = new ThreadB(service);
		threadB.setName("B");
		threadB.start();
	}

}
