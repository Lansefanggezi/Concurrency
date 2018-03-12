/*
 * 通过栈来实现线程通信
 * 本栈的大小始终都是1
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
				//当前线程wait
				this.wait();
			}
			//存入随机数
			list.add("anyString" + Math.random());
			
			//唤醒其他线程
			this.notifyAll();
			
			//输出当前的List的大小
			System.out.println("当前操作是push,size是:" + list.size());
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
	
	synchronized public String pop()
	{
		//返回值;
		String returnString = "";
		try
		{
			while(list.size() == 0)
			{
				this.wait();
			}
			returnString = "" + list.get(0);
			
			//消费
			list.remove(0);

			this.notifyAll();
			
			//输出当前的List的大小
			System.out.println("当前操作是pop,size是:" + list.size());
		}catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		return returnString;
	}
}
