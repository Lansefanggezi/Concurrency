package com.chapter01.main;

import com.chapter01.Thread.MyThread;

public class MyThreadTest {
	public static void main(String [] args)
	{
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("运行结束！");
		//控制台又可能会先打印运行结束！表示在使用多线程技术时，
		//代码的执行顺序和调用顺序是和执行结果没有必然的关系的
	}
}
