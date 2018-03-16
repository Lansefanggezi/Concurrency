package com.synchronizedM.objec;

public class MyObject {

	private static MyObject myObject;
	
	private MyObject()
	{
		
	}
	
	//同步整个方法，效率比较低
	synchronized public static MyObject getInstance()
	{
		try {
			if(myObject != null)
			{
				
			}else
			{
				Thread.sleep(300);
				myObject = new MyObject();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return myObject;
	}
}
