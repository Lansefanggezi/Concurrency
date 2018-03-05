package com.chapter01.Thread;

public class test {
	public static void main(String [] args)
	{
		MyThread myThread = new MyThread();
		
		System.out.println(Thread.currentThread().getName());
	}
}
