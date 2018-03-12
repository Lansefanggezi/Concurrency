package com.ProducterAndConsumer.main;

import com.ProducterAndConsumer.entity.Consumer;
import com.ProducterAndConsumer.entity.Producter;
import com.ProducterAndConsumer.thread.ThreadConsumer;
import com.ProducterAndConsumer.thread.ThreadProducter;

public class Run {

	public static void main(String[] args) {
		// ����test�����ߺ�������
		
		//Lock��
		String lock = new String("");
		
		//������
		Producter pro = new Producter(lock);
		ThreadProducter threadPro = new ThreadProducter(pro);
		
		//������
		Consumer con = new Consumer(lock);
		ThreadConsumer threadCon =  new ThreadConsumer(con);
		
		
		threadPro.start();
		threadCon.start();
		

	}

}
