package com.InheritableThreadLocal.mian;

import com.InheritableThreadLocal.service.Tools;
import com.InheritableThreadLocal.thread.ThreadA;

public class Main {

	public static void main(String[] args) {
		try {
			for(int i = 0 ; i<5 ; i++)
			{
				System.out.println(Tools.inheritableThreadLocal.get() + "Main");
				Thread.sleep(2000);
			}
			
			
			ThreadA threaA = new ThreadA();
			threaA.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
