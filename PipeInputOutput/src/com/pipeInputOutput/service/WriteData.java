/*
 * ��ܵ���д������
 * */
package com.pipeInputOutput.service;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriteData {

	/*
	 * д�Ĳ���
	 * */
	public void WirMethod(PipedOutputStream out)
	{
		try {
			//��ӡ��������
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
