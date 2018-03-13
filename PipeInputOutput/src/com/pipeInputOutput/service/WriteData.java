/*
 * 向管道中写入数据
 * */
package com.pipeInputOutput.service;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {

	/*
	 * 写的操作
	 * */
	public void WirMethod(PipedOutputStream out)
	{
		try {
			//打印操作类型
			System.out.println("Writ:");
			
			for(int i = 0; i < 300; i++)
			{
				String outDate = "" + (i+1);
	
				out.write(outDate.getBytes());
				
				System.out.println(outDate);
			}
			System.out.println();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
