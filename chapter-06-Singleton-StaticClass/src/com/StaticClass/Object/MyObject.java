package com.StaticClass.Object;

public class MyObject {

	private static class MyObjectHandler
	{
		private static MyObject myObject = new MyObject();
	}
	
	//构造方法私有化
	private MyObject()
	{
		
	}
	
	//此方法必须公开
	public static MyObject getInstance()
	{
		return MyObjectHandler.myObject;
	} 
}
