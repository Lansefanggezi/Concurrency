package com.chapter03.TwoThreadTransData;

public class ThreadB extends Thread {
	private Mylist list;
	
	public ThreadB (Mylist list)
	{
		super();
		this.list = list;
	}
	
	@Override
	public void run()
	{
		try{
			while(true)
			{
				if(list.size() == 5)
				{
					System.out.println(Thread.currentThread().getName() + "size == 5�ˣ� ��Ҫ�Ƴ��ˡ�");
					throw new InterruptedException();
				}
			}
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
