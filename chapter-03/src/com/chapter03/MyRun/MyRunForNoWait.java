package com.chapter03.MyRun;

public class MyRunForNoWait {
	private String lock = new String("");
	private boolean isNotify = false;
	
	private Runnable runnableA = new Runnable()
	{
		@Override
		public void run()
		{
			try{
				synchronized(lock)
				{
					while(!isNotify){
						System.out.println("Wait Begin : " + System.currentTimeMillis());
						lock.wait();
						System.out.println("Wait End   : " + System.currentTimeMillis() );
					}
					System.out.println("线程:" + Thread.currentThread().getName() + "继续执行");
				}
			}catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	};
	
	private Runnable runnableB = new Runnable()
	{
		@Override
		public void run()
		{
			synchronized(lock)
			{
				System.out.println("Notify Begin:" + System.currentTimeMillis());
				lock.notify();
				isNotify = true;
				System.out.println("Notify End  :" + System.currentTimeMillis());
			}
		}
	};
	
	public static void main(String[] args)
	{
		//交换线程A\B的启动顺序可以发现,A先启动可以出现正常结果
		try
		{
			MyRunForNoWait  myRunForNoWait = new MyRunForNoWait();


			Thread threadA = new Thread(myRunForNoWait.runnableA);
			threadA.start();
			Thread.sleep(3000);
			Thread threadB = new Thread(myRunForNoWait.runnableB);
			threadB.start();
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}

	}
}
