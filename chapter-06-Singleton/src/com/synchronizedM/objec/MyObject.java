package com.synchronizedM.objec;

public class MyObject {

	private static MyObject myObject;
	
	private MyObject()
	{
		
	}
	
	//ͬ������������Ч�ʱȽϵ�
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
