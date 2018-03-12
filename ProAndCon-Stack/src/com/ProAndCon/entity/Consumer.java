package com.ProAndCon.entity;

public class Consumer {

	private MyStack stack;
	
	public Consumer(MyStack stack)
	{
		super();
		this.stack = stack;
	}
	
	public void popService()
	{
		stack.pop();
	}
}
