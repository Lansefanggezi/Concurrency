package com.chapter01.main;

import com.chapter01.Thread.MyThread;

public class MyThreadTest {
	public static void main(String [] args)
	{
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("���н�����");
		//����̨�ֿ��ܻ��ȴ�ӡ���н�������ʾ��ʹ�ö��̼߳���ʱ��
		//�����ִ��˳��͵���˳���Ǻ�ִ�н��û�б�Ȼ�Ĺ�ϵ��
	}
}
