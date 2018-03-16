package com.Dcl.Object;

public class MyObject1 {

	private static MyObject1 myObject;
	
	private MyObject1()
	{
		
	}
	
	//Í¬²½´úÂë¿é
	public static MyObject1 getInstance()
	{
		try {
			if(myObject != null)
			{
				
			}else
			{
				synchronized(MyObject1.class){
					Thread.sleep(300);
					if(myObject == null)
					{
						myObject = new MyObject1();
					}
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		return myObject;
	}
}
