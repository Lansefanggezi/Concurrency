package com.chapter03.waitNotify;

public class test1 {

	public static void main(String[] args) {
		String lock =  new String("");
			
		// ����waitӦ���е�ǰ�� ���򱨴�
		// ��ʱ�߳̽�һֱֹͣ������ִ�к���Ĵ���
		try{
			String newstring = new String("");
			System.out.println("ͬ������ǰ");
			synchronized(lock){
				System.out.println("ͬ��������һ��");
				lock.wait();
				System.out.println("ͬ������������");
			}
			System.out.println("ͬ��������");
		}catch (InterruptedException ex)
		{
			ex.printStackTrace();
		}

	}

}
