package com.chapter03.waitNotify;

public class test1 {

	public static void main(String[] args) {
		String lock =  new String("");
			
		// 调用wait应持有当前锁 否则报错
		// 此时线程将一直停止，不会执行后面的代码
		try{
			String newstring = new String("");
			System.out.println("同步方法前");
			synchronized(lock){
				System.out.println("同步方法第一句");
				lock.wait();
				System.out.println("同步方法第三句");
			}
			System.out.println("同步方法后");
		}catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}

	}

}
