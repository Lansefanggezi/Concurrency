package com.ProAndCon.entity;

public class Producter {

	private MyStack stack;
	
	public Producter(MyStack stack)
	{
		super();
		this.stack = stack;
	}
	
	public void pushService()
	{
		stack.push();
	}
}
