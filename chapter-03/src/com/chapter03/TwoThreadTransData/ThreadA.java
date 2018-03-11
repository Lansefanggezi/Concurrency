package com.chapter03.TwoThreadTransData;

public class ThreadA extends Thread {
	private Mylist list;
	
	public ThreadA(Mylist list)
	{
		super();
		this.list = list;
	} 
	@Override
	public void run()
	{
		try
		{
			for(int i = 0; i <10; i++)
			{
				list.add();
				System.out.println(Thread.currentThread().getName() + "添加了" + (i+1) + "个元素了。" );
//				System.out.println();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
