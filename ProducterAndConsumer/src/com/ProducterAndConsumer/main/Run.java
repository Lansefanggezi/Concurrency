package com.ProducterAndConsumer.main;

import com.ProducterAndConsumer.entity.Consumer;
import com.ProducterAndConsumer.entity.Producter;
import com.ProducterAndConsumer.thread.ThreadConsumer;
import com.ProducterAndConsumer.thread.ThreadProducter;

public class Run {

	public static void main(String[] args) {
		// 初步test生产者和消费者
		
		//Lock用
		String lock = new String("");
		
		//生产者
		Producter pro = new Producter(lock);
		ThreadProducter threadPro = new ThreadProducter(pro);
		
		//消费者
		Consumer con = new Consumer(lock);
		ThreadConsumer threadCon =  new ThreadConsumer(con);
		
		
		threadPro.start();
		threadCon.start();
		

	}

}
