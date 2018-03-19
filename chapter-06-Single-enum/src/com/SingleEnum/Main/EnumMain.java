package com.SingleEnum.Main;

import com.SingleEnum.Thread.ThreadA;

public class EnumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadA threadA1 = new ThreadA();
		
		ThreadA threadA2 = new ThreadA();
		
		ThreadA thread3 = new ThreadA();
		threadA1.start();
		threadA2.start();
		thread3.start();
	}

}
