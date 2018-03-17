package com.StaticClass.Object;

public class MyObject {

	private static class MyObjectHandler
	{
		private static MyObject myObject = new MyObject();
	}
	
	//���췽��˽�л�
	private MyObject()
	{
		
	}
	
	//�˷������빫��
	public static MyObject getInstance()
	{
		return MyObjectHandler.myObject;
	} 
}
