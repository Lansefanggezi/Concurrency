package com.StaticClass.Thread;

import com.StaticClass.Object.MyObject;

public class ThreadStaticClass extends java.lang.Thread {

	@Override
	public void run()
	{
		System.out.println(MyObject.getInstance().hashCode());
	}
}
