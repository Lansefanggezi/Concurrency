package com.synchronizedM.objec;

public class MyObject1 {

	private static MyObject1 myObject;
	
	private MyObject1()
	{
		
	}
	
	//Í¬²½´úÂë¿é
	public static MyObject1 getInstance()
	{
		try {
			synchronized(MyObject1.class){
				if(myObject != null)
				{
					
				}else
				{
					Thread.sleep(300);
					myObject = new MyObject1();
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return myObject;
	}
}
