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
					System.out.println("�߳�:" + Thread.currentThread().getName() + "����ִ��");
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
		//�����߳�A\B������˳����Է���,A���������Գ����������
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
