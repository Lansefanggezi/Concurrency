/*
 * ͨ��ջ��ʵ���߳�ͨ��
 * ��ջ�Ĵ�Сʼ�ն���1
 */
package com.ProAndCon.entity;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

	private List list = new ArrayList();
	
	synchronized public void push()
	{
		try
		{
			while(list.size() == 1)
			{
				//��ǰ�߳�wait
				this.wait();
			}
			//���������
			list.add("anyString" + Math.random());
			
			//���������߳�
			this.notifyAll();
			
			//�����ǰ��List�Ĵ�С
			System.out.println("��ǰ������push,size��:" + list.size());
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	
	synchronized public String pop()
	{
		//����ֵ;
		String returnString = "";
		try
		{
			while(list.size() == 0)
			{
				this.wait();
			}
			returnString = "" + list.get(0);
			
			//����
			list.remove(0);

			this.notifyAll();
			
			//�����ǰ��List�Ĵ�С
			System.out.println("��ǰ������pop,size��:" + list.size());
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		return returnString;
	}
}
