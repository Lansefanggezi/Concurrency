package com.SingleEnum.object;

public enum MyObjectEnum {
	object;
	private String myObject;
	
	private MyObjectEnum()
	{
		myObject = "构造方法";
	}
	
	public String getMyObject()
	{
		return myObject;
	}
	
}
