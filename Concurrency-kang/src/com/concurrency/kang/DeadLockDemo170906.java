package com.concurrency.kang;

public class DeadLockDemo170906 {
	
	private static String A = "A";
	private static String B = "B";
	
	public static void main(String[] args){
		new DeadLockDemo170906().deadLock();
	}
	private void deadLock(){
		Thread thread1 = new Thread(new Runnable(){
			@Override
			public void run(){
				synchronized(A){
					try{
						Thread.currentThread().sleep(2000);
					}catch(InterruptedException ie){
						ie.printStackTrace();
					}
					synchronized(B){
						
					}
				}
			}
		});
		Thread thread2 = new Thread(new Runnable(){
			@Override
			public void run(){
				synchronized(B){
					synchronized(A){
						System.out.println("2");
					}
				}
			}
		});
		thread1.start();
		thread2.start();
	}
}
