package com.SingleEnum.object;

public enum MyObjectEnum {
	object;
	private String myObject;
	
	private MyObjectEnum()
	{
		myObject = "���췽��";
	}
	
	public String getMyObject()
	{
		return myObject;
	}
	
}
