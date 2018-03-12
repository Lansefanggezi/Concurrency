package com.Waiting.Main;

import com.Waiting.Entity.ConsumerWaiting;
import com.Waiting.Entity.ProducterWaiting;
import com.Waiting.Thread.ThreadCon;
import com.Waiting.Thread.ThreadPro;

public class TestWaiting {

	public static void main(String[] args) throws InterruptedException {
		// notify()��notify All()������Ӧ��
		String lock = new String("");
		
		ProducterWaiting pro = new ProducterWaiting(lock);
		ThreadPro[] threadPro = new ThreadPro[2];
		
		ConsumerWaiting con = new ConsumerWaiting(lock);
		ThreadCon[] threadCon = new ThreadCon[2];
		
		for(int i = 0; i < 2; i++)
		{
			threadPro[i] = new ThreadPro(pro);
			threadPro[i].setName("������:" + (i+1));
			
			threadCon[i] = new ThreadCon(con);
			threadCon[i].setName("������:" + (i+1));
			
			threadPro[i].start();
			threadCon[i].start();
			
		}
		Thread.sleep(5000);

		//��ȡ�������߳�
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for(int i = 0; i< threadArray.length; i++)
		{
			System.out.println(threadArray[i].getName() + " " + threadArray[i].getState() );
		}
	}

}
