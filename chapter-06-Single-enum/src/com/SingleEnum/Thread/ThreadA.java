package com.SingleEnum.Thread;

import com.SingleEnum.object.MyObjectEnum;

public class ThreadA extends Thread {

	@Override
	public void run()
	{
		for(int i = 0 ; i < 10; i++)
		{
			System.out.println(MyObjectEnum.object.getMyObject().hashCode());
		}
	}
}
