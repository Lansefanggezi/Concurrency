package com.Serializable.Object;

import java.io.Serializable;

public class MyObject implements Serializable {

	private static final long serialVersionUID = 888L;
	
	//�ڲ��෽ʽ
	private static class MyObjectHandler
	{
		private static final MyObject myObject = new MyObject();
	}

	private MyObject()
	{
		
	}
	
	public static MyObject getInstance()
	{
		return MyObjectHandler.myObject;
	}
	
	protected Object readResolve() 
	{
		System.out.println("������readResolve����");
		return MyObjectHandler.myObject;
	}
}
