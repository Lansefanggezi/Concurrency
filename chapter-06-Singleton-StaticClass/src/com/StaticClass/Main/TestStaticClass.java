package com.StaticClass.Main;

import com.StaticClass.Thread.ThreadStaticClass;

public class TestStaticClass {

	public static void main(String[] args) {
		//ʹ�þ�̬������ʵ�ֵ���ģʽ
		ThreadStaticClass thread1 = new ThreadStaticClass();

		ThreadStaticClass thread2 = new ThreadStaticClass();

		ThreadStaticClass thread3 = new ThreadStaticClass();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
