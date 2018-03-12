package com.ProAndCon.Main;

import com.ProAndCon.Thread.ThreadCon;
import com.ProAndCon.Thread.ThreadPro;
import com.ProAndCon.entity.Consumer;
import com.ProAndCon.entity.MyStack;
import com.ProAndCon.entity.Producter;

public class TestStack {

	public static void main(String[] args) throws InterruptedException {
		// ʹ��ջ��ʵ�ֶ������߶�������
		MyStack stack = new MyStack();
		
		//������
		Producter pro1 = new Producter(stack);
		Producter pro2 = new Producter(stack);
		Producter pro3 = new Producter(stack);
		Producter pro4 = new Producter(stack);
		Producter pro5 = new Producter(stack);
		
		ThreadPro threadpro1 = new ThreadPro(pro1);
		ThreadPro threadpro2 = new ThreadPro(pro2);
		ThreadPro threadpro3 = new ThreadPro(pro3);
		ThreadPro threadpro4 = new ThreadPro(pro4);
		ThreadPro threadpro5 = new ThreadPro(pro5);
		
		threadpro1.start();
		threadpro2.start();
		threadpro3.start();
		threadpro4.start();
		threadpro5.start();
		
		//������
		Consumer con1 = new Consumer(stack);
		Consumer con2 = new Consumer(stack);
		Consumer con3 = new Consumer(stack);
		Consumer con4 = new Consumer(stack);
		Consumer con5 = new Consumer(stack);
		
		ThreadCon threadCon1 = new ThreadCon(con1);
		ThreadCon threadCon2 = new ThreadCon(con2);
		ThreadCon threadCon3 = new ThreadCon(con3);
		ThreadCon threadCon4 = new ThreadCon(con4);
		ThreadCon threadCon5 = new ThreadCon(con5);
		
		threadCon1.start();
		threadCon2.start();
		threadCon3.start();
		threadCon4.start();
		threadCon5.start();
		
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
