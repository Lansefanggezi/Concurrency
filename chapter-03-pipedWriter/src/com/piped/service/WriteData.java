package com.piped.service;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData {

	public void writeMethod(PipedWriter out)
	{
		try {
			System.out.println("Writer:");
			for(int i= 0 ;i<300; i++)
			{
			String data = "" + i;
				out.write(data);
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
